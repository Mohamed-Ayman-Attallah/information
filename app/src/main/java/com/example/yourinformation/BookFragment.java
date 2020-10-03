package com.example.yourinformation;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class BookFragment extends Fragment {

    private RecyclerView recyclerView;
    private adapter_book myAdabter;
    List<adabter> lstBook;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       View view =  inflater.inflate(R.layout.fragment_book , container , false);

        recyclerView = (RecyclerView) view.findViewById(R.id.RV_Book);
        myAdabter = new adapter_book(getContext(),lstBook);
        recyclerView.setLayoutManager(new GridLayoutManager(getActivity(),2));
        recyclerView.setAdapter(myAdabter);

       return view;

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        lstBook = new ArrayList<>();
        lstBook.add(new adabter("sds" , "kcsd" , "R.drawable.ic_baseline_favorite_24" , R.drawable.ic_baseline_person_24));
        lstBook.add(new adabter("sds" , "kcsd" , "R.drawable.ic_baseline_favorite_24" , R.drawable.ic_baseline_person_24));
        lstBook.add(new adabter("sds" , "kcsd" , "R.drawable.ic_baseline_favorite_24" , R.drawable.ic_baseline_person_24));
        lstBook.add(new adabter("sds" , "kcsd" , "R.drawable.ic_baseline_favorite_24" , R.drawable.ic_baseline_person_24));
        lstBook.add(new adabter("sds" , "kcsd" , "R.drawable.ic_baseline_favorite_24" , R.drawable.ic_baseline_person_24));
        lstBook.add(new adabter("sds" , "kcsd" , "R.drawable.ic_baseline_favorite_24" , R.drawable.ic_baseline_person_24));
        lstBook.add(new adabter("sds" , "kcsd" , "R.drawable.ic_baseline_favorite_24" , R.drawable.ic_baseline_person_24));
        lstBook.add(new adabter("sds" , "kcsd" , "R.drawable.ic_baseline_favorite_24" , R.drawable.ic_baseline_person_24));
        lstBook.add(new adabter("sds" , "kcsd" , "R.drawable.ic_baseline_favorite_24" , R.drawable.ic_baseline_person_24));
        lstBook.add(new adabter("sds" , "kcsd" , "R.drawable.ic_baseline_favorite_24" , R.drawable.ic_baseline_person_24));
        lstBook.add(new adabter("sds" , "kcsd" , "R.drawable.ic_baseline_favorite_24" , R.drawable.ic_baseline_person_24));
        lstBook.add(new adabter("sds" , "kcsd" , "R.drawable.ic_baseline_favorite_24" , R.drawable.ic_baseline_person_24));
        lstBook.add(new adabter("sds" , "kcsd" , "R.drawable.ic_baseline_favorite_24" , R.drawable.ic_baseline_person_24));
        lstBook.add(new adabter("sds" , "kcsd" , "R.drawable.ic_baseline_favorite_24" , R.drawable.ic_baseline_person_24));
        lstBook.add(new adabter("sds" , "kcsd" , "R.drawable.ic_baseline_favorite_24" , R.drawable.ic_baseline_person_24));
    }
}
