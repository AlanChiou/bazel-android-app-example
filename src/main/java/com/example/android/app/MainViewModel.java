package com.example.android.app;

import androidx.annotation.NonNull;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.android.app.model.BookStore;
import com.example.android.app.server.BookStoreService;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainViewModel extends ViewModel {

    private final MutableLiveData<BookStore> bookStore = new MutableLiveData<>();

    public void loadData() {
        BookStoreService.Companion.get().getBookStore().enqueue(new Callback<BookStore>() {
            @Override
            public void onResponse(@NonNull Call<BookStore> call,
                                   @NonNull Response<BookStore> response) {
                bookStore.postValue(response.body());
            }

            @Override
            public void onFailure(@NonNull Call<BookStore> call,
                                  @NonNull Throwable throwable) {
            }
        });
    }

    public LiveData<BookStore> getBookStore() {
        return bookStore;
    }
}
