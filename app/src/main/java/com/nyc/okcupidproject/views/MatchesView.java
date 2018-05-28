package com.nyc.okcupidproject.views;

import com.nyc.okcupidproject.model.MatchModel;

import java.util.List;

/**
 * Created by Wayne Kellman on 5/25/18.
 */

public interface MatchesView {
    void MatchesFound(List<MatchModel> matched);
}
