package com.example.patariczagyorgy.openlibrary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
  }

  public void onClick(View view) {
    Intent randomTextFromWeb = new Intent(this, FakeApiTester.class);
    startActivity(randomTextFromWeb);
  }

  public void searchBySubject(View view) {
    Intent searchBySubject = new Intent(this, SearchBookBySubject.class);
    startActivity(searchBySubject);
  }

  public void recycleView(View view) {
    Intent recycleView = new Intent(this, RecyleViewPractice.class);
    startActivity(recycleView);
  }

  public void subjectSearcher(View view) {
    Intent subjectSearcher = new Intent(this, SubjectSearcher.class);
    EditText editText = (EditText) findViewById(R.id.editText);
    String subject = editText.getText().toString();
    subjectSearcher.putExtra("subject", subject);
    startActivity(subjectSearcher);
  }
}
