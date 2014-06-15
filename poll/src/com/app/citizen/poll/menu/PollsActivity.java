package com.app.citizen.poll.menu;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.util.TypedValue;
import android.view.View;
import com.app.citizen.poll.MainMenu.MainActivity;
import com.app.citizen.poll.MainMenu.slideout.SlideoutActivity;
import com.app.citizen.poll.R;


/**
 * Created by ramis on 6/10/14.
 */
public class PollsActivity extends FragmentActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.polls);
        findViewById(R.id.sample_button1).setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int width = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 40, getResources().getDisplayMetrics());
                        SlideoutActivity.prepare(PollsActivity.this, R.id.inner_content, width);
                        startActivity(new Intent(PollsActivity.this,
                                MainActivity.class));
                        overridePendingTransition(0, 0);
                    }
                });
    }
}
