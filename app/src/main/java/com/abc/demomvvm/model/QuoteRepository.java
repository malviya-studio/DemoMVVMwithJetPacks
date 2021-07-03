package com.abc.demomvvm.model;

import androidx.lifecycle.LiveData;

import com.abc.demomvvm.model.database.QuoteDAO;
import com.abc.demomvvm.model.database.TableQuote;

import java.util.List;

public class QuoteRepository {

    private final QuoteDAO quoteDAO;

    public QuoteRepository(QuoteDAO quoteDAO){
        this.quoteDAO = quoteDAO;
    }

    public LiveData<List<TableQuote>>  getQuotes(){
        return quoteDAO.getQuotes();
    }

    public void insertQuote(TableQuote data){
        quoteDAO.insertQuote(data);
    }
}
