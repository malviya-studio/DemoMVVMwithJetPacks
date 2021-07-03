package com.abc.demomvvm.model.database;


import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface QuoteDAO {

    @Query("SELECT * from quote")
    public LiveData<List<TableQuote>> getQuotes();

    @Insert
    public void insertQuote(TableQuote quote);
}
