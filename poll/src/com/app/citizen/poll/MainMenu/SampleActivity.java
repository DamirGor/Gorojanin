package com.app.citizen.poll.MainMenu;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import com.app.citizen.poll.MainMenu.slideout.SlideoutActivity;
import com.app.citizen.poll.R;


public class SampleActivity extends Activity {

	@TargetApi(11)
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.polls);
		findViewById(R.id.sample_button).setOnClickListener(
				new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						int width = (int)TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 40, getResources().getDisplayMetrics());
						SlideoutActivity.prepare(SampleActivity.this, R.id.inner_content, width);
						startActivity(new Intent(SampleActivity.this, MainActivity.class));
						overridePendingTransition(0, 0);
					}
				});
	}

}
