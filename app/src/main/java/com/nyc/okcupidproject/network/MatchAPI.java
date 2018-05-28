package com.nyc.okcupidproject.network;

import com.nyc.okcupidproject.model.matchResponse;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Wayne Kellman on 5/25/18.
 */

public interface MatchAPI {
    @GET("matchSample.json")
    Call<matchResponse> getMatches();
}
