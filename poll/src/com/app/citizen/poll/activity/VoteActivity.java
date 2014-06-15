package com.app.citizen.poll.activity;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import com.app.citizen.poll.R;


/**
 * Created by ainurminibaev on 12.06.14.
 */
public class VoteActivity extends FragmentActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vote);
    }
}
