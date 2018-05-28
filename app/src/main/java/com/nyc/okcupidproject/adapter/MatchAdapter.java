package com.nyc.okcupidproject.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.nyc.okcupidproject.R;
import com.nyc.okcupidproject.model.MatchModel;

import java.util.List;

/**
 * Created by Wayne Kellman on 5/25/18.
 */

public class MatchAdapter extends RecyclerView.Adapter<ViewHolder>{

    private List<MatchModel> matches;

    public MatchAdapter(List<MatchModel> matches) {
        this.matches = matches;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.match_itemview,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, final int position) {
        holder.OnBind(matches.get(position));
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                matches.get(position).switchLiked();
                if (matches.get(position).isLiked()) {
                    holder.itemView.setBackgroundColor(holder.itemView.getResources().getColor(R.color.yellow));
                } else {
                    holder.itemView.setBackgroundColor(holder.itemView.getResources().getColor(R.color.white));

                }

            }
        });
    }

    @Override
    public int getItemCount() {
        return matches.size();
    }
}
