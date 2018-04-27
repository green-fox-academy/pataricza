package com.example.patariczagyorgy.openlibrary.service;

import com.example.patariczagyorgy.openlibrary.model.Book;
import com.example.patariczagyorgy.openlibrary.model.FakeApiTesting;
import com.example.patariczagyorgy.openlibrary.model.Library;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface OpenLibraryClient {

  @GET("/posts/1/comments")
  Call<List<Book>> searchBySubject();

  @GET("/posts/1")
  Call<FakeApiTesting> fakeApiTester();

  @GET("/subjects/{subject}.json")
  Call<Library> getBooksBySubject(@Path("subject") String subject);
}
