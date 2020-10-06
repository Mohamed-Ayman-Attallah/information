package com.example.yourinformation;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class adapter_articles extends RecyclerView.Adapter<adapter_articles.myViewHolder> {
    private Context context;
    private List<adabter> list;

    public adapter_articles(Context context, List<adabter> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public adapter_articles.myViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view;
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        view = layoutInflater.inflate(R.layout.cardview_item_articles, viewGroup, false);
        return new adapter_articles.myViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull adapter_articles.myViewHolder viewHolder, @SuppressLint("RecyclerView") final int i) {


        viewHolder.articles_title.setText(list.get(i).getTitle());
        viewHolder.img_articles.setImageResource(list.get(i).getImg());
        viewHolder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context,Articles_Activity.class);
                intent.putExtra("BookTitle",list.get(i).getTitle());
                intent.putExtra("BookDescription",list.get(i).getDescription());
                intent.putExtra("thumpnall",list.get(i).getImg());
                context.startActivity(intent);

            }
        });


    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class myViewHolder extends RecyclerView.ViewHolder {
        TextView articles_title;
        ImageView img_articles;
        CardView cardView;

        public myViewHolder(View view) {
            super(view);

            articles_title = (TextView) view.findViewById(R.id.title3);
            img_articles = (ImageView) view.findViewById(R.id.image3);
            cardView = (CardView) view.findViewById(R.id.articles);
        }
    }
}