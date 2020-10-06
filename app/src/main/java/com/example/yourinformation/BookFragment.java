package com.example.yourinformation;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
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
        lstBook.add(new adabter("sds" , "asdn" , "R.drawable.ic_baseline_favorite_24" , R.drawable.ic_baseline_person_24));
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
