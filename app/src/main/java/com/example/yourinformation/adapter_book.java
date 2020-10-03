package com.example.yourinformation;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
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
    private int position;

    public adapter_book(Context context, List<adabter> list) {
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
    public void onBindViewHolder(@NonNull adapter_book.myViewHolder viewHolder, @SuppressLint("RecyclerView") final int position) {


        viewHolder.book_title.setText(list.get(position).getTitle());
        viewHolder.img_book.setImageResource(list.get(position).getImg());
        viewHolder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context,Book_Activity.class);
                intent.putExtra("BookTitle",list.get(position).getTitle());
                intent.putExtra("BookDescription",list.get(position).getDescription());
                intent.putExtra("thumpnall",list.get(position).getImg());
                context.startActivity(intent);

            }
        });


    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class myViewHolder extends RecyclerView.ViewHolder {
        TextView book_title;
        ImageView img_book;
        CardView cardView;

        public myViewHolder(View view) {
            super(view);

            book_title = (TextView) view.findViewById(R.id.Book_Title);
            img_book = (ImageView) view.findViewById(R.id.Book_Img);
            cardView = (CardView) view.findViewById(R.id.card_view_click);
        }
    }
}
