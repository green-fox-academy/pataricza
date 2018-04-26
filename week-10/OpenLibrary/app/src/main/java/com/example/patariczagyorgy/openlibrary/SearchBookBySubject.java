package com.example.patariczagyorgy.openlibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.patariczagyorgy.openlibrary.model.Book;
import com.example.patariczagyorgy.openlibrary.service.OpenLibraryClient;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class SearchBookBySubject extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_search_books_by_subject);

    Retrofit.Builder builder = new Retrofit.Builder()
        .baseUrl("https://jsonplaceholder.typicode.com/")
        .addConverterFactory(GsonConverterFactory.create());

    Retrofit retrofit = builder.build();

    OpenLibraryClient client = retrofit.create(OpenLibraryClient.class);
    Call<List<Book>> call = client.searchBySubject();

    call.enqueue(new Callback<List<Book>>() {
      @Override
      public void onResponse(Call<List<Book>> call, Response<List<Book>> response) {
        List<Book> books = response.body();
        List<String> bookBodies = new ArrayList<>();
        for (Book oneBook : books) {
          bookBodies.add(oneBook.getBody());
        }
        ListAdapter bookadapter = new ArrayAdapter<String>(SearchBookBySubject.this, android.R.layout.simple_list_item_1, bookBodies);
        ListView bookListView = (ListView) findViewById(R.id.bookList);
        bookListView.setAdapter(bookadapter);
      }

      @Override
      public void onFailure(Call<List<Book>> call, Throwable t) {
        System.out.println("-------------------------------------------------------------------------------------");
        t.printStackTrace();
        Toast.makeText(SearchBookBySubject.this, "Something went wrong", Toast.LENGTH_SHORT).show();
      }
    });
  }
}
