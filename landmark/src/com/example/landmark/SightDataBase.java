package com.example.landmark;

import android.content.ContentValues;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

import java.io.IOException;

public class SightDataBase extends SQLiteOpenHelper {

	private final Context fContext;
	
	static final String dbName = "SightDB01";
	static final String sight_table = "Sights";
	
	public SightDataBase(Context context) {
		super(context, dbName, null, 1);
		fContext = context;
	}
	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO Auto-generated method stub
		Log.d("My", "DB");
		try {
			db.beginTransaction();
			db.execSQL("create table " + sight_table + "("
					+ "id integer primary key ,"
					+ "name text NOT NULL ,"+" sight_link text NOT NULL ,"+" drawable_link integer "
					+ " );");
			db.setTransactionSuccessful();
		} finally {
			db.endTransaction();
		}
		ContentValues values = new ContentValues();
		// Получим массив строк из ресурсов
		Resources res = fContext.getResources();
		
		// Открываем xml-файл
		XmlResourceParser _xml = res.getXml(R.xml.sight_record);
		try {
			// Ищем конец документа
			int eventType = _xml.getEventType();
			db.beginTransaction();
			while (eventType != XmlPullParser.END_DOCUMENT) {
				// Ищем теги record
				if ((eventType == XmlPullParser.START_TAG)
						&& (_xml.getName().equals("record"))) {
					// Тег Record найден, теперь получим его атрибуты и
					// вставляем в таблицу
					String name = _xml.getAttributeValue(0);
					String exercise_link = _xml.getAttributeValue(1);
					String youtube_link = _xml.getAttributeValue(2);
					values.put("name", name);
					values.put("sight_link", exercise_link );
					values.put("drawable_link", youtube_link);
					Log.d("My",values.toString());
					db.insert(sight_table, null, values);
				}
				eventType = _xml.next();
			}
			db.setTransactionSuccessful();
		}
		// Catch errors
		catch (XmlPullParserException e) {
			Log.e("Test", e.getMessage(), e);
		} catch (IOException e) {
			System.out.print(e);
			Log.e("Test", e.getMessage(), e);

		} finally {
			// Close the xml file
			_xml.close();
			db.endTransaction();
		}
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub
		
	}

}
