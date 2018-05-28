package com.nyc.okcupidproject.presenter;

import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.Toast;

import com.nyc.okcupidproject.adapter.MatchAdapter;
import com.nyc.okcupidproject.model.MatchModel;
import com.nyc.okcupidproject.model.matchResponse;
import com.nyc.okcupidproject.network.MatchService;
import com.nyc.okcupidproject.views.MainActivity;
import com.nyc.okcupidproject.views.MatchesView;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Wayne Kellman on 5/25/18.
 */

public class MatchPresenter {
    private static final String TAG = "MatchPresenter";
    private MatchesView matchesView;
    private MatchService matchService;

    public MatchPresenter(MatchesView matchesView) {
        this.matchesView = matchesView;
        this.matchService = new MatchService();
    }

    public void callURL() {
        matchService.getAPI()
                .getMatches()
                .enqueue(new Callback<matchResponse>() {
                    @Override
                    public void onResponse(Call<matchResponse> call, Response<matchResponse> response) {
                        if (response.isSuccessful()) {
                            matchesView.MatchesFound(response.body().getData());
                        } else {
                            Log.d(TAG, "onResponse: call failed");
                        }
                    }

                    @Override
                    public void onFailure(Call<matchResponse> call, Throwable t) {
                        t.printStackTrace();
                    }
                });
    }

    public void setRecView(MainActivity mainActivity, RecyclerView recyclerView, List<MatchModel> matched) {

        recyclerView.setLayoutManager(new GridLayoutManager(mainActivity,2, LinearLayoutManager.VERTICAL,false));
        MatchAdapter adapter = new MatchAdapter(matched);
        recyclerView.setAdapter(adapter);
    }
}
