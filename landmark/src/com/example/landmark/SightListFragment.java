package com.example.landmark;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;


public class SightListFragment extends ListFragment{
	
	private ArrayList<Sight> mSights;
	
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		mSights = SightLab.get(getActivity()).getSight();
		Log.d("My", "Work");
		EAdapter adapter = new EAdapter(mSights);
		setListAdapter(adapter);
	}
	
	@Override
	public void onListItemClick(ListView l, View v, int position, long id) {
		Sight c = ((EAdapter) getListAdapter()).getItem(position);
		Intent i = new Intent(getActivity(), FragmentActivity.class);
		i.putExtra(SightFragment.EXTRA_SIGHT_ID, c.getId());
		startActivity(i);
	}
	
	private class EAdapter extends ArrayAdapter<Sight> {
		public EAdapter(ArrayList<Sight> sight) {
			super(getActivity(), 0, sight);
		}
		
		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			// If we weren't given a view, inflate one
			if (convertView == null) {
				convertView = getActivity().getLayoutInflater().inflate(
						R.layout.list_sight, null);
			}
			Sight ex = getItem(position);
			TextView titleTextView = (TextView) convertView
					.findViewById(R.id.sight_list_item_titleTextView);
			titleTextView.setText(ex.getName());
			return convertView;
		}
	}
}
