package com.nyc.okcupidproject.model;

/**
 * Created by Wayne Kellman on 5/25/18.
 */

public interface IMatchModel {
    void switchLiked();
    int getMatch();
    boolean isLiked();
    String getState_code();
    String getState_name();
    int getAge();
    String getUsername();
    String getCity_name();
}
