package com.app.citizen.poll.menu;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.app.citizen.poll.R;


/**
 * Created by ramis on 6/17/14.
 */
public class AboutTheApp extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about_the_app);

        Button button1 = (Button) findViewById(R.id.buttonFeedback);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AboutTheApp.this, FeedbackActivity.class);
                startActivity(intent);
            }
        });
    }
}
