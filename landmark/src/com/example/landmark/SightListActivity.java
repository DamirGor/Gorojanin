package com.example.landmark;

import android.support.v4.app.Fragment;
import android.view.Menu;

public class SightListActivity extends SingleFragmentActivity{

	@Override
	protected Fragment createFragment() {
		return new SightListFragment();
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.search, menu);
		
		return super.onCreateOptionsMenu(menu);
	}
}
