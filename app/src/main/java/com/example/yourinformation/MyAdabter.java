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


public class MyAdabter extends RecyclerView.Adapter<MyAdabter.ViewHolder> {

    private static RecycleViewOnItem recycleViewOnItem;
    private Context context;
    private List<adabter> list;

    public MyAdabter(RecycleViewOnItem recycleViewOnItem, Context context, List<adabter> list) {
        this.recycleViewOnItem = recycleViewOnItem;
        this.context = context;
        this.list = list;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        private TextView textView;
        private ImageView imageView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            textView = (TextView) itemView.findViewById(R.id.title);
            imageView = (ImageView) itemView.findViewById(R.id.image);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    recycleViewOnItem.onItemClick(getAdapterPosition());
                }
            });
        }
    }


    @NonNull
    @Override
    public MyAdabter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View listItemView;
        listItemView = LayoutInflater.from(context).inflate(R.layout.row, viewGroup, false);
        return new ViewHolder(listItemView);

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        adabter adabter = list.get(i);
        viewHolder.textView.setText(adabter.getTitle());
        viewHolder.imageView.setBackgroundResource(adabter.getImg());
    }


    @Override
    public int getItemCount() {
        return list.size();
    }
}
