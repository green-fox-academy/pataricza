package com.example.patariczagyorgy.openlibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.patariczagyorgy.openlibrary.model.Book;
import com.example.patariczagyorgy.openlibrary.service.OpenLibraryClient;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class SearchBooksBySubject extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_search_books_by_subject);

    Retrofit.Builder builder = new Retrofit.Builder()
        .baseUrl("http://openlibrary.org/")
        .addConverterFactory(GsonConverterFactory.create());

    Retrofit retrofit = builder.build();

    OpenLibraryClient client = retrofit.create(OpenLibraryClient.class);
    Call<List<Book>> call = client.searchBySubject("fiction");

    call.enqueue(new Callback<List<Book>>() {
      @Override
      public void onResponse(Call<List<Book>> call, Response<List<Book>> response) {
        List<Book> books = response.body();
        ListAdapter bookadapter = new ArrayAdapter<Book>(this, android.R.layout.simple_list_item_1, books);
        ListView bookListView = (ListView) findViewById(R.id.bookList);
        bookListView.setAdapter(bookadapter);
      }

      @Override
      public void onFailure(Call<List<Book>> call, Throwable t) {
        Toast.makeText(SearchBooksBySubject.this, "Something went wrong", Toast.LENGTH_SHORT).show();
      }
    });
  }
}
