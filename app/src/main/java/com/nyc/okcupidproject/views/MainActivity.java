package com.nyc.okcupidproject.views;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import com.nyc.okcupidproject.R;
import com.nyc.okcupidproject.adapter.MatchAdapter;
import com.nyc.okcupidproject.model.MatchModel;
import com.nyc.okcupidproject.presenter.MatchPresenter;

import java.util.List;

public class MainActivity extends AppCompatActivity implements MatchesView{

    private static final String TAG = "MainActivity";
    RecyclerView recyclerView;
    MatchPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        presenter = new MatchPresenter(this);
        presenter.callURL();

    }

    @Override
    public void MatchesFound(List<MatchModel> matched) {
        Log.d(TAG, "MatchesFound: ran");

        recyclerView = findViewById(R.id.match_recycler);
        presenter.setRecView(MainActivity.this, recyclerView,matched);
    }
}
