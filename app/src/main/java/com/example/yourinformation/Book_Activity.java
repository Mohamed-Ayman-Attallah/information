package com.example.yourinformation;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Book_Activity extends AppCompatActivity {

    private ImageView Book_Image;
    private TextView Title_Book , Description_Book , Category_Book;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_);

        Title_Book = findViewById(R.id.Title_Book);
        Book_Image = findViewById(R.id.bookthmbnail);
        Description_Book = findViewById(R.id.Description_Book);
        Category_Book = findViewById(R.id.Category_Book);

        Bundle extras = getIntent().getExtras();
        if (extras != null){
            String value = extras.getString("BookDescription");
            int img = extras.getInt("thumpnall");
            Description_Book.setText(value);
            Book_Image.setImageResource(img);
        }

    }
}