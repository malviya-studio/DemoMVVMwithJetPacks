package com.abc.demomvvm.model.database;


import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {TableQuote.class}, version = 1)
public abstract class QuoteDatabase extends RoomDatabase {

    private static QuoteDatabase INSTANCE;
//
    public abstract QuoteDAO getQuoteDaoInstance();
//
    public static QuoteDatabase getDatabase(Context context) {
        if (INSTANCE == null) {
            synchronized (context) {
                INSTANCE = Room.databaseBuilder(context, QuoteDatabase.class, "quote_db")
                        .createFromAsset("quotes.db")
                        .allowMainThreadQueries()
                        .build();
            }
        }
        return INSTANCE;
    }

}
