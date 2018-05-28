package com.nyc.okcupidproject.adapter;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.nyc.okcupidproject.R;
import com.nyc.okcupidproject.model.MatchModel;
import com.squareup.picasso.Picasso;

/**
 * Created by Wayne Kellman on 5/25/18.
 */

public class ViewHolder extends RecyclerView.ViewHolder {

    private static final String TAG = "ViewHolder";
    private ImageView profilePic;
    private TextView username, profileInfo, matchPercent;
    View itemView;

    public ViewHolder(View itemView) {
        super(itemView);
        profilePic = itemView.findViewById(R.id.thumb_pic);
        username = itemView.findViewById(R.id.username);
        profileInfo = itemView.findViewById(R.id.profile_info);
        matchPercent = itemView.findViewById(R.id.match_percent);
        this.itemView = itemView;
    }

    public void OnBind(MatchModel model) {
        if (model != null) {
            Log.d(TAG, "OnBind: " + model.getUsername());
            Picasso.get()
                    .load(model.getPhoto().getThumb_paths().getLarge())
                    .fit()
                    .centerCrop()
                    .into(profilePic);
            username.setText(model.getUsername());
            profileInfo.setText(model.getProfileInfo());
            matchPercent.setText(model.getMatchPercent());
        } else {
            Toast.makeText(itemView.getContext()," null model", Toast.LENGTH_LONG).show();
        }
    }
}
