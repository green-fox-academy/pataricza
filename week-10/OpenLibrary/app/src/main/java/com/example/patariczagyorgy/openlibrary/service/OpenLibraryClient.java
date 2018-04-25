package com.example.patariczagyorgy.openlibrary.service;

import com.example.patariczagyorgy.openlibrary.model.Book;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface OpenLibraryClient {

  @GET("/search.json")
  Call<List<Book>> searchBySubject(@Query("subject") String subject);
}
