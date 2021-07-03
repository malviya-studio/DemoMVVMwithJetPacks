package com.abc.demomvvm.view;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.abc.demomvvm.viewmodel.MainViewModelFactory;
import com.abc.demomvvm.model.QuoteRepository;
import com.abc.demomvvm.R;
import com.abc.demomvvm.model.database.QuoteDAO;
import com.abc.demomvvm.model.database.QuoteDatabase;
import com.abc.demomvvm.model.database.TableQuote;
import com.abc.demomvvm.databinding.ActivityMainBinding;
import com.abc.demomvvm.viewmodel.MainViewModel;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding = null;
    MainViewModel mainViewModel = null;

    String name = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
       // binding.setQuotes("this is working ");
        initialize();

        name = "Kalpana";
    }

    private void initialize() {

       // QuoteDAO quoteDao = QuoteDatabase.getDatabase(this).getQuoteDaoInstance();

        //QuoteRepository repository = new QuoteRepository(quoteDao);

//        mainViewModel = new ViewModelProvider(this, new MainViewModelFactory(repository)).get(MainViewModel.class);
//
//        mainViewModel.getQuotes().observe(this, new Observer<List<TableQuote>>() {
//            @Override
//            public void onChanged(List<TableQuote> tableQuotes) {
//               binding.setQuotes(tableQuotes.get(tableQuotes.size()-1).text);
//            }
//        });

//        binding.btnAddQuote.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                //for inserting quote
//                TableQuote data = new TableQuote();
//                data.text = "demo testing text";
//                data.author = "demo texting quthor";
//
//                repository.insertQuote(data);
//            }
//        });
    }
}