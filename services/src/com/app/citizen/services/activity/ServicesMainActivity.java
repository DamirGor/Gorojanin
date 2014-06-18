package com.app.citizen.services.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.app.citizen.services.R;

<<<<<<< HEAD

=======
>>>>>>> FETCH_HEAD
/**
 * Created by ainurminibaev on 18.06.14.
 */
public class ServicesMainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_services);
        findViewById(R.id.btn_fines).setOnClickListener(clickListener);
        findViewById(R.id.btn_hospital).setOnClickListener(clickListener);
    }

    private final View.OnClickListener clickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = null;
            int i = v.getId();
            if (i == R.id.btn_fines) {
                intent = new Intent(getApplicationContext(), FineActivity.class);

            } else if (i == R.id.btn_hospital) {
                intent = new Intent(getApplicationContext(), HospitalActivity.class);
            }
            startActivity(intent);
        }
    };
}
