package com.nyc.okcupidproject.network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Wayne Kellman on 5/25/18.
 */

public class MatchService {
    private Retrofit retrofit = null;
    private static final String URL = "https://www.okcupid.com/";

    public MatchAPI getAPI() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }

        return retrofit.create(MatchAPI.class);
    }
}
