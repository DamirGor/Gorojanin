package com.example.landmark;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;

import java.util.UUID;

public class SightFragment extends Fragment {
	public static final String EXTRA_SIGHT_ID = "com.example.showplace.sight_id";

	private Sight mSight;
	private WebView mWv ;
	private ImageView mImage;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		UUID sightId = (UUID) getActivity().getIntent().getSerializableExtra(EXTRA_SIGHT_ID);
		mSight = SightLab.get(getActivity()).getSight(sightId);
		// mCrime = new Crime();
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup parent,
			Bundle savedInstanceState) {
		View v = inflater.inflate(R.layout.sight_fragment, parent, false);
		
		mImage =(ImageView)v.findViewById(R.id.sight_image_fragment);
		mWv = (WebView)v.findViewById(R.id.sight_webview);
		mImage.setImageResource(mSight.getSdrawable());
		mWv.loadUrl("file:///android_asset/html/" + mSight.getSlink());
		
		return v;
	}
}
