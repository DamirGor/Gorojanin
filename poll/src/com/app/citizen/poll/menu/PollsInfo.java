package com.app.citizen.poll.menu;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.widget.TextView;
import com.app.citizen.poll.R;

/**
 * Created by ramis on 6/10/14.
 */
public class PollsInfo extends FragmentActivity {

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