package com.example.patariczagyorgy.openlibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.example.patariczagyorgy.openlibrary.model.FakeApiTesting;
import com.example.patariczagyorgy.openlibrary.service.OpenLibraryClient;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class FakeApiTester extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_fake_api_tester);

    Retrofit.Builder builder = new Retrofit.Builder()
        .baseUrl("https://jsonplaceholder.typicode.com/")
        .addConverterFactory(GsonConverterFactory.create());

    Retrofit retrofit = builder.build();

    OpenLibraryClient client = retrofit.create(OpenLibraryClient.class);
    Call<FakeApiTesting> call = client.fakeApiTester();

    call.enqueue(new Callback<FakeApiTesting>() {
      @Override
      public void onResponse(Call<FakeApiTesting> call, Response<FakeApiTesting> response) {
        FakeApiTesting fakeApiTesting = response.body();
        TextView textView = findViewById(R.id.textView);
        textView.setText(fakeApiTesting.getTitle());
      }

      @Override
      public void onFailure(Call<FakeApiTesting> call, Throwable t) {
        Toast.makeText(FakeApiTester.this, "Something went wrong", Toast.LENGTH_SHORT).show();
      }
    });
  }
}
