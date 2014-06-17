package com.example.landmark;

import java.util.UUID;

public class Sight {
	private UUID mId;
	private String mName; 
	private String mSlink;
	private int mSdrawable;
	
	public Sight() {
		mId = UUID.randomUUID();
	}
	
	public UUID getId() {
		return mId;
	}

	public String getName() {
		return mName;
	}

	public void setName(String name) {
		mName = name;
	}

	public String getSlink() {
		return mSlink;
	}

	public void setSlink(String slink) {
		mSlink = slink;
	}

	public int getSdrawable() {
		return mSdrawable;
	}

	public void setSdrawable(int sdrawable) {
		mSdrawable = sdrawable;
	}
	
	
}
