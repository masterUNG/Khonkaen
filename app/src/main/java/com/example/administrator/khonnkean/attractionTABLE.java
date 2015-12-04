package com.example.administrator.khonnkean;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;


public class attractionTABLE extends ActionBarActivity {


    private MyDbHelper_Kk objDbHelper;
    public static final String TABLE_NAME_ATTRACTION = "attraction";
    public static final String TABLE_NAME_FOLKCUSTOM = "folkcustom";
    public static final String TABLE_NAME_FOODFOLK = "foodfolk";
    public static final String TABLE_NAME_SOUVERNIR = "souvernir";

    public static final String COLUMN_NAME = "name";
    public static final String COLUMN_DETAIL = "detail";
    


    private SQLiteDatabase writeDatabase, readDatabase;

    public attractionTABLE(Context context) {
        objDbHelper = new MyDbHelper_Kk(context);
        writeDatabase = objDbHelper.getWritableDatabase();
        readDatabase = objDbHelper.getReadableDatabase();
    }

    public String[] Dataattractions(int Position) {
        String[] strDATA = null;

        switch (Position) {
            case 1:
                Cursor objCursor1 = readDatabase.query(TABLE_NAME_ATTRACTION, new String[]{COLUMN_DETAIL}, null, null, null, null, null);
                objCursor1.moveToFirst();
                strDATA = new String[objCursor1.getCount()];
                for (int i = 0; i < objCursor1.getCount(); i++) {
                    strDATA[i] = objCursor1.getString(objCursor1.getColumnIndex(COLUMN_DETAIL));

                    objCursor1.moveToNext();

                }
                objCursor1.close();
                break;
            case 2:
                Cursor objCursor2 = readDatabase.query(TABLE_NAME_FOLKCUSTOM, new String[]{COLUMN_DETAIL}, null, null, null, null, null);
                objCursor2.moveToFirst();
                strDATA = new String[objCursor2.getCount()];
                for (int i = 0; i < objCursor2.getCount(); i++) {
                    strDATA[i] = objCursor2.getString(objCursor2.getColumnIndex(COLUMN_DETAIL));
                    objCursor2.moveToNext();

                }
                objCursor2.close();
                break;
            case 3:
                Cursor objCursor3 = readDatabase.query(TABLE_NAME_FOODFOLK, new String[]{COLUMN_DETAIL}, null, null, null, null, null);
                objCursor3.moveToFirst();
                strDATA = new String[objCursor3.getCount()];
                for (int i = 0; i < objCursor3.getCount(); i++) {
                    strDATA[i] = objCursor3.getString(objCursor3.getColumnIndex(COLUMN_DETAIL));
                    objCursor3.moveToNext();

                }
                objCursor3.close();
                break;
            case 4:
                Cursor objCursor4 = readDatabase.query(TABLE_NAME_SOUVERNIR, new String[]{COLUMN_DETAIL}, null, null, null, null, null);
                objCursor4.moveToFirst();
                strDATA = new String[objCursor4.getCount()];
                for (int i = 0; i < objCursor4.getCount(); i++) {
                    strDATA[i] = objCursor4.getString(objCursor4.getColumnIndex(COLUMN_DETAIL));
                    objCursor4.moveToNext();

                }
                objCursor4.close();
                break;
        }

        Log.i("Data listImgNews() ", "มีข้อมูลอยู่ทั้งหมด " + String.valueOf(strDATA.length + " แถว"));

        return strDATA;
    }

}
