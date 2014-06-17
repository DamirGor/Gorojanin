package com.app.citizen.poll.start;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.app.citizen.poll.R;

/**
 * Created by ramis on 6/10/14.
 */
public class Recovery extends Activity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recovery);


        Button button = (Button) findViewById(R.id.buttonRecIn);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Recovery.this, Authorization.class);
                startActivity(intent);
            }
        });
    }
}
