package com.app.citizen.poll;

/**
 * Created by ramis on 6/9/14.
 */

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.widget.TextView;

public class DetailActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.details_activity_layout);
        //принимаем intent из фрагмента
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            //выводим текст из полученной ссылки
            String s = extras.getString("value");
            TextView view = (TextView) findViewById(R.id.detailsText);
            view.setText(s);
        }
    }
}