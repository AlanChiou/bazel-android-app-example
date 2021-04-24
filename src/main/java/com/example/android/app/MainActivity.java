package com.example.android.app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.android.app.model.BookStore;

public final class MainActivity extends AppCompatActivity {

    private MainViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewModel = new ViewModelProvider(this).get(MainViewModel.class);
        viewModel.getBookStore().observe(this, new Observer<BookStore>() {
            @Override
            public void onChanged(BookStore bookStore) {
                if (bookStore == null) {
                    return;
                }

                Toast.makeText(MainActivity.this, bookStore.toString(), Toast.LENGTH_LONG).show();
            }
        });
        viewModel.loadData();
    }

    public void goToKotlin(View view) {
        startActivity(new Intent("com.example.android.app.action.KOTLIN_PAGE"));
    }
}