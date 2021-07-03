package com.abc.demomvvm.viewmodel;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import com.abc.demomvvm.model.QuoteRepository;
import com.abc.demomvvm.viewmodel.MainViewModel;

public class MainViewModelFactory implements ViewModelProvider.Factory {

    private final QuoteRepository repository;

    public MainViewModelFactory(QuoteRepository repository) {
        this.repository = repository;
    }

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        return (T) new MainViewModel(repository);
    }
}
