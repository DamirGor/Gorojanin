package com.app.citizen;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import com.app.citizen.poll.start.Authorization;
import com.example.landmark.SightListActivity;
import com.app.ciziten.R;

public class MainActivity extends Activity implements OnClickListener {

    ImageButton hum_btn;
    ImageButton btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        hum_btn = (ImageButton) findViewById(R.id.human);
        hum_btn.setOnClickListener(this);
        System.out.println("sdgdfgf");
        btn2 = (ImageButton) findViewById(R.id.imageButton2);
        btn2.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public void onClick(View v) {
        // TODO Auto-generated method stub
        switch (v.getId()) {
            case R.id.human:
                //пишем активити на которое надо перейти
                Intent intent = new Intent(getApplicationContext(), Authorization.class);
                startActivity(intent);
                break;
            case R.id.imageButton2 :
                Intent intent1 = new Intent(this, SightListActivity.class);
                startActivity(intent1);
                break;

        }
    }
}
