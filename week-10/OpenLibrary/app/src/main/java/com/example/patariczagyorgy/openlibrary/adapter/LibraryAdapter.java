package com.example.patariczagyorgy.openlibrary.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.patariczagyorgy.openlibrary.R;
import com.example.patariczagyorgy.openlibrary.model.RealBook;

import java.util.List;

public class LibraryAdapter extends RecyclerView.Adapter<LibraryAdapter.LibraryViewholder> {

  List<RealBook> works;

  public LibraryAdapter(List<RealBook> works) {
    this.works = works;
  }

  @NonNull
  @Override
  public LibraryViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
    View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_item, parent, false);
    return new LibraryViewholder(view);
  }

  @Override
  public void onBindViewHolder(@NonNull LibraryViewholder holder, int position) {
    holder.id.setText("" + works.get(position).getCoverId());
    holder.title.setText(works.get(position).getTitle());
  }

  @Override
  public int getItemCount() {
    return works.size();
  }

  public class LibraryViewholder extends RecyclerView.ViewHolder {

    TextView id;
    TextView title;

    public LibraryViewholder(View itemView) {
      super(itemView);
      id = itemView.findViewById(R.id.name);
      title = itemView.findViewById(R.id.email);
    }
  }
}
