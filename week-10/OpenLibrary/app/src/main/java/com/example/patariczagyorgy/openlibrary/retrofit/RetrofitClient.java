package com.example.patariczagyorgy.openlibrary.retrofit;

import com.example.patariczagyorgy.openlibrary.service.OpenLibraryClient;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {

  public OpenLibraryClient getOpenLibraryImpl(String Url) {
    Retrofit.Builder builder = new Retrofit.Builder()
        .baseUrl(Url)
        .addConverterFactory(GsonConverterFactory.create());

    Retrofit retrofit = builder.build();

    return retrofit.create(OpenLibraryClient.class);
  }
}
