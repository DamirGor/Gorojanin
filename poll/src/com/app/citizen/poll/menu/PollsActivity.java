package com.app.citizen.poll.menu;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import com.app.citizen.poll.R;

/**
 * Created by ramis on 6/10/14.
 */
public class PollsActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.polls);
    }
}
