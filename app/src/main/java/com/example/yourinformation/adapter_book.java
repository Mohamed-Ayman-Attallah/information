package com.example.yourinformation;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class adapter_book extends RecyclerView.Adapter<adapter_book.myViewHolder> {
    private Context context;
    private List<adabter> list;

    public adapter_book( Context context, List<adabter> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public adapter_book.myViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view;
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        view = layoutInflater.inflate(R.layout.cardview_itembook, viewGroup, false);
        return new adapter_book.myViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull adapter_book.myViewHolder viewHolder, int i) {

        viewHolder.book_title.setText(list.get(i).getTitle());
        viewHolder.img_book.setImageResource(list.get(i).getImg());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class myViewHolder extends RecyclerView.ViewHolder {
        TextView book_title;
        ImageView img_book;

        public myViewHolder(View view) {
            super(view);

            book_title = (TextView)view.findViewById(R.id.Book_Title);
            img_book = (ImageView)view.findViewById(R.id.Book_Img);
        }
    }
}
