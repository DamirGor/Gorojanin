package com.app.citizen.poll.start;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.app.citizen.poll.R;


/**
 * Created by ramis on 6/9/14.
 */
public class Registration extends Activity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registration);


        Button button = (Button) findViewById(R.id.buttonRegIn);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Registration.this, Authorization.class);
                startActivity(intent);
            }
        });
    }
}
