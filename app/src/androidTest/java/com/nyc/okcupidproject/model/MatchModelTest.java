package com.nyc.okcupidproject.model;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Wayne Kellman on 5/29/18.
 */
public class MatchModelTest {
    @Test
    public void switchLiked() throws Exception {
        MatchModel model = new MatchModel();
        model.setLiked(false);
        boolean currentLike = model.isLiked();
        model.switchLiked();
        boolean switchLikes = model.isLiked();


        Assert.assertNotEquals(currentLike, switchLikes);
    }

    @Test
    public void getProfileInfo() throws Exception {
        MatchModel model = new MatchModel();
        model.setAge(21);
        model.setCity_name("testCity");
        model.setState_code("TC");
        String info = "21 \u2022 testCity TC";

        Assert.assertEquals(model.getProfileInfo(), info);
    }

    @Test
    public void getMatchPercent() throws Exception {
        //String.valueOf(match/100) + "% Match"
        MatchModel model = new MatchModel();
        model.setMatch(1234);
        String match = "12% Match";
        Assert.assertEquals(model.getMatchPercent(), match);
    }

}