package com.example.yourinformation;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class ArticlesFragment extends Fragment {

    private RecyclerView recyclerView;
    private adapter_articles myAdabter;
    List<adabter> lstArticles;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_articles , container , false);

        recyclerView = (RecyclerView) view.findViewById(R.id.RV_Articles);
        myAdabter = new adapter_articles(getContext(),lstArticles);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(myAdabter);

        return view;

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        lstArticles = new ArrayList<>();
        lstArticles.add(new adabter("sds" , "asdn" , "R.drawable.ic_baseline_favorite_24" , R.drawable.ic_baseline_person_24));
        lstArticles.add(new adabter("sds" , "kcsd" , "R.drawable.ic_baseline_favorite_24" , R.drawable.ic_baseline_person_24));
        lstArticles.add(new adabter("sds" , "kcsd" , "R.drawable.ic_baseline_favorite_24" , R.drawable.ic_baseline_person_24));
        lstArticles.add(new adabter("sds" , "kcsd" , "R.drawable.ic_baseline_favorite_24" , R.drawable.ic_baseline_person_24));
        lstArticles.add(new adabter("sds" , "kcsd" , "R.drawable.ic_baseline_favorite_24" , R.drawable.ic_baseline_person_24));
        lstArticles.add(new adabter("sds" , "kcsd" , "R.drawable.ic_baseline_favorite_24" , R.drawable.ic_baseline_person_24));
        lstArticles.add(new adabter("sds" , "kcsd" , "R.drawable.ic_baseline_favorite_24" , R.drawable.ic_baseline_person_24));
        lstArticles.add(new adabter("sds" , "kcsd" , "R.drawable.ic_baseline_favorite_24" , R.drawable.ic_baseline_person_24));
        lstArticles.add(new adabter("sds" , "kcsd" , "R.drawable.ic_baseline_favorite_24" , R.drawable.ic_baseline_person_24));
        lstArticles.add(new adabter("sds" , "kcsd" , "R.drawable.ic_baseline_favorite_24" , R.drawable.ic_baseline_person_24));
        lstArticles.add(new adabter("sds" , "kcsd" , "R.drawable.ic_baseline_favorite_24" , R.drawable.ic_baseline_person_24));
        lstArticles.add(new adabter("sds" , "kcsd" , "R.drawable.ic_baseline_favorite_24" , R.drawable.ic_baseline_person_24));
        lstArticles.add(new adabter("sds" , "kcsd" , "R.drawable.ic_baseline_favorite_24" , R.drawable.ic_baseline_person_24));
        lstArticles.add(new adabter("sds" , "kcsd" , "R.drawable.ic_baseline_favorite_24" , R.drawable.ic_baseline_person_24));
        lstArticles.add(new adabter("sds" , "kcsd" , "R.drawable.ic_baseline_favorite_24" , R.drawable.ic_baseline_person_24));
    }
}
