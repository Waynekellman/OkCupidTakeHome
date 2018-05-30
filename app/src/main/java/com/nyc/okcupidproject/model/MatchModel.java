package com.nyc.okcupidproject.model;

/**
 * Created by Wayne Kellman on 5/25/18.
 */

public class MatchModel implements IMatchModel {

    private int match;
    private boolean liked;
    private String state_code;
    private String state_name;
    private int age;
    private Photo photo;
    private String username;
    private String city_name;

    public void setMatch(int match) {
        this.match = match;
    }

    public void setLiked(boolean liked) {
        this.liked = liked;
    }

    public void setState_code(String state_code) {
        this.state_code = state_code;
    }

    public void setState_name(String state_name) {
        this.state_name = state_name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPhoto(Photo photo) {
        this.photo = photo;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setCity_name(String city_name) {
        this.city_name = city_name;
    }

    public int getMatch() {
        return match;
    }

    public boolean isLiked() {
        return liked;
    }

    public String getState_code() {
        return state_code;
    }

    public String getState_name() {
        return state_name;
    }

    public int getAge() {
        return age;
    }

    public String getUsername() {
        return username;
    }

    public String getCity_name() {
        return city_name;
    }

    public void switchLiked() {
        this.liked = !liked;
    }

    public Photo getPhoto() {
        return photo;
    }

    public String getProfileInfo() {
        return String.valueOf(getAge()) + " \u2022 " + getCity_name() + " " + getState_code();
    }

    public String getMatchPercent() {
        return String.valueOf(match/100) + "% Match";
    }
}

