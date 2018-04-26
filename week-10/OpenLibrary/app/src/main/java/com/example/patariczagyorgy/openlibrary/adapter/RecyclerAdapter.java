package com.example.patariczagyorgy.openlibrary.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.patariczagyorgy.openlibrary.R;
import com.example.patariczagyorgy.openlibrary.model.Book;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder> {

  private List<Book> books;

  public RecyclerAdapter(List<Book> books) {
    this.books = books;
  }

  @NonNull
  @Override
  public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
    View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_item, parent, false);
    return new MyViewHolder(view);
  }

  @Override
  public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
    holder.name.setText(books.get(position).getName());
    holder.email.setText(books.get(position).getEmail());
  }

  @Override
  public int getItemCount() {
    return books.size();
  }

  public class MyViewHolder extends RecyclerView.ViewHolder {

    TextView name;
    TextView email;

    public MyViewHolder(View itemView) {
      super(itemView);
      name = (TextView) itemView.findViewById(R.id.name);
      email = (TextView) itemView.findViewById(R.id.email);
    }
  }
}
