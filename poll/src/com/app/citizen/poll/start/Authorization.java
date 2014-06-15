package com.app.citizen.poll.start;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.app.citizen.poll.MainMenu.MainActivity;
import com.app.citizen.poll.R;


/**
 * Created by ramis on 6/9/14.
 */
public class Authorization extends Activity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.authorization);

        Button button1 = (Button) findViewById(R.id.buttonLogin);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Authorization.this, MainActivity.class);
                startActivity(intent);
            }
        });

        Button button2 = (Button) findViewById(R.id.buttonReg);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Authorization.this, Registration.class);
                startActivity(intent);
            }
        });

        Button button3 = (Button) findViewById(R.id.buttonRecovery);
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Authorization.this, Recovery.class);
                startActivity(intent);
            }
        });
    }
}
