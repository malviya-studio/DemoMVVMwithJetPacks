package com.abc.demomvvm.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.abc.demomvvm.model.QuoteRepository;
import com.abc.demomvvm.model.database.TableQuote;

import java.util.List;

public class MainViewModel extends ViewModel {

    private final QuoteRepository repository;

    public MainViewModel(QuoteRepository repository){
        this.repository = repository;
    }

    public LiveData<List<TableQuote>> getQuotes(){
        return repository.getQuotes();
    }


    public void insertQuote(TableQuote data){
        repository.insertQuote(data);
    }

}
