package com.example.landmark;

import android.support.v4.app.Fragment;
import android.view.Menu;

public class SightListActivity extends SingleFragmentActivity{

	@Override
	protected Fragment createFragment() {
<<<<<<< HEAD
=======
		// TODO Auto-generated method stub
>>>>>>> FETCH_HEAD
		return new SightListFragment();
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
<<<<<<< HEAD
=======
		// TODO Auto-generated method stub
>>>>>>> FETCH_HEAD
		getMenuInflater().inflate(R.menu.search, menu);
		
		return super.onCreateOptionsMenu(menu);
	}
}
