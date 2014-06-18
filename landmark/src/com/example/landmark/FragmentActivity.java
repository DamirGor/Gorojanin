package com.example.landmark;


import android.app.Fragment;
import android.view.Menu;

public class FragmentActivity extends SingleFragmentActivity {

	@Override
	protected android.support.v4.app.Fragment createFragment() {
		// TODO Auto-generated method stub
		return new SightFragment();
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// TODO Auto-generated method stub
		getMenuInflater().inflate(R.menu.mapshow, menu);
		
		return super.onCreateOptionsMenu(menu);
	}
}
