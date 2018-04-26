package com.example.patariczagyorgy.openlibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.patariczagyorgy.openlibrary.adapter.RecyclerAdapter;
import com.example.patariczagyorgy.openlibrary.model.Book;
import com.example.patariczagyorgy.openlibrary.retrofit.RetrofitClient;
import com.example.patariczagyorgy.openlibrary.service.OpenLibraryClient;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RecyleViewPractice extends AppCompatActivity {

  private RecyclerView recyclerView;
  private RecyclerView.LayoutManager layoutManager;
  private RecyclerAdapter adapter;
  private List<Book> books;
  private RetrofitClient retrofitClient = new RetrofitClient();

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_recyle_view_practice);

    recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
    layoutManager = new LinearLayoutManager(this);
    recyclerView.setLayoutManager(layoutManager);
    recyclerView.setHasFixedSize(true);

    OpenLibraryClient client = retrofitClient.getOpenLibraryImpl("https://jsonplaceholder.typicode.com/");
    Call<List<Book>> call = client.searchBySubject();

    call.enqueue(new Callback<List<Book>>() {
      @Override
      public void onResponse(Call<List<Book>> call, Response<List<Book>> response) {
        books = response.body();
        adapter = new RecyclerAdapter(books);
        recyclerView.setAdapter(adapter);
      }

      @Override
      public void onFailure(Call<List<Book>> call, Throwable t) {
        System.out.println("-------------------------------------------------------------------------------------");
        t.printStackTrace();
        Toast.makeText(RecyleViewPractice.this, "Something went wrong", Toast.LENGTH_SHORT).show();
      }
    });
  }
}
