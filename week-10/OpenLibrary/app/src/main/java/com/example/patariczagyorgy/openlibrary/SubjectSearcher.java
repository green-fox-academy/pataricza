package com.example.patariczagyorgy.openlibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.example.patariczagyorgy.openlibrary.R;
import com.example.patariczagyorgy.openlibrary.adapter.LibraryAdapter;
import com.example.patariczagyorgy.openlibrary.model.Library;
import com.example.patariczagyorgy.openlibrary.model.RealBook;
import com.example.patariczagyorgy.openlibrary.retrofit.RetrofitClient;
import com.example.patariczagyorgy.openlibrary.service.OpenLibraryClient;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SubjectSearcher extends AppCompatActivity {

  private RecyclerView recyclerView;
  private RecyclerView.LayoutManager layoutManager;
  private LibraryAdapter libraryAdapter;
  private List<RealBook> works;
  private Library library;
  private RetrofitClient retrofitClient = new RetrofitClient();

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_subject_searcher);

    recyclerView = findViewById(R.id.subjectSearcher);
    layoutManager = new LinearLayoutManager(this);
    recyclerView.setLayoutManager(layoutManager);
    recyclerView.setHasFixedSize(true);

    OpenLibraryClient client = retrofitClient.getOpenLibraryImpl("http://openlibrary.org/");
    Call<Library> call = client.getBooksBySubject("fiction");

    call.enqueue(new Callback<Library>() {
      @Override
      public void onResponse(Call<Library> call, Response<Library> response) {
        library = response.body();
        libraryAdapter = new LibraryAdapter(library.getWorks());
        recyclerView.setAdapter(libraryAdapter);
      }

      @Override
      public void onFailure(Call<Library> call, Throwable t) {
        System.out.println("-------------------------------------------------------------------------------------");
        t.printStackTrace();
        Toast.makeText(SubjectSearcher.this, "Something went wrong", Toast.LENGTH_SHORT).show();
      }
    });
  }
}
