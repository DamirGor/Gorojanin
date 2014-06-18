package com.example.landmark;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import java.util.ArrayList;
import java.util.UUID;


public class SightLab {
	private ArrayList<Sight> mSig;
	private static SightLab sSightLab;
	private SightDataBase db;
	
	private SightLab (Context appContext) {
		// mAppContext = appContext;
		db = new SightDataBase(appContext);
		SQLiteDatabase sqlbase = db.getWritableDatabase();
		mSig = new ArrayList<Sight>();

		String sqlQuery = "Sights";

		String columns[] = { "DISTINCT Sights.name as Name",
				"Sights.sight_link as Sight_link",
				"Sights.drawable_link as Drawable_link" };
		Cursor c = sqlbase.query(sqlQuery, columns, null, null, null, null,
				null);
		Log.d("My", "ExersiceLab3" + c.toString());
		if (c.moveToFirst()) {
			Log.d("My", "cursor");
			int name = c.getColumnIndex("Name");
			Log.d("My", "h " + name);
			int slink = c.getColumnIndex("Sight_link");
			Log.d("My", "h " + slink);
			int dlink = c.getColumnIndex("Drawable_link");
			Log.d("My", "h " + dlink);
			// int id = c.getColumnIndex("id");
			do {
				// Log.d("My","LL "+c.getString(id));
				Sight ex = new Sight();
				ex.setSdrawable(c.getInt(dlink));
				ex.setSlink(c.getString(slink));
				Log.d("My", "   ");
				ex.setName(c.getString(name));
				Log.d("My", ex.getName());
				mSig.add(ex);
			} while (c.moveToNext());
		}
		
	}

	public static SightLab get(Context c) {
		if (sSightLab == null) {
			sSightLab = new SightLab(c.getApplicationContext());
		}
		return sSightLab;
	}

	public ArrayList<Sight> getSight() {
		return mSig;
	}

	public Sight getSight(UUID id) {
		for (Sight c : mSig) {
			if (c.getId().equals(id))
				return c;
		}
		return null;
	}
}
