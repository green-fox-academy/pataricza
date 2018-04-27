package com.example.patariczagyorgy.openlibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.EditText;
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

  List<String> bookBodies;
  private static List<String> KEYWORDCONTAININGBODIES = new ArrayList<>();

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_search_books_by_subject);

    getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);

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
        bookBodies = new ArrayList<>();
        if (KEYWORDCONTAININGBODIES.isEmpty()) {
          for (Book oneBook : books) {
            bookBodies.add(oneBook.getBody());
          }
        } else {
          bookBodies.addAll(KEYWORDCONTAININGBODIES);
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

  public void searchKeyword(View view) {
    EditText editText = (EditText) findViewById(R.id.keyword);
    String keyword = editText.getText().toString();

    for (String bookBody : bookBodies) {
      if (bookBody.contains(keyword)) {
        KEYWORDCONTAININGBODIES.add(bookBody);
      }
    }

    finish();
    startActivity(getIntent());
  }

  public void clearSearch(View view) {
    KEYWORDCONTAININGBODIES.clear();

    finish();
    startActivity(getIntent());
  }
}
