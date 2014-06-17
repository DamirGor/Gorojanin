package com.example.landmark;

import android.support.v4.app.Fragment;
import android.view.Menu;

public class SightListActivity extends SingleFragmentActivity{

	@Override
	protected Fragment createFragment() {
		// TODO Auto-generated method stub
		return new SightListFragment();
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// TODO Auto-generated method stub
		getMenuInflater().inflate(R.menu.search, menu);
		
		return super.onCreateOptionsMenu(menu);
	}
}
