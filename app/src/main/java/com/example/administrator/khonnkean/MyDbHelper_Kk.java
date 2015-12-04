package com.example.administrator.khonnkean;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

class MyDbHelper_Kk extends SQLiteOpenHelper {
	private static final String DB_NAME = "khonkean.db";
    private static final int DB_VERSION = 1;

    public static final String TABLE_NAME_ATTRACTION = "attraction";
    public static final String TABLE_NAME_FOLKCUSTOM = "folkcustom";
    public static final String TABLE_NAME_FOODFOLK = "foodfolk";
    public static final String TABLE_NAME_SOUVENIR = "souvenir";

    public MyDbHelper_Kk(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
	}

	public void onCreate(SQLiteDatabase db) {

	}
	
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+ TABLE_NAME_ATTRACTION);
        onCreate(db);
        db.execSQL("DROP TABLE IF EXISTS "+ TABLE_NAME_FOLKCUSTOM);
        onCreate(db);
        db.execSQL("DROP TABLE IF EXISTS "+ TABLE_NAME_FOODFOLK);
        onCreate(db);
        db.execSQL("DROP TABLE IF EXISTS "+ TABLE_NAME_SOUVENIR);
        onCreate(db);

    }
}
