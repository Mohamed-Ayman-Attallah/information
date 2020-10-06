package com.example.yourinformation;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class showMoreActivity extends AppCompatActivity {

    private ImageView book_image2;
    private TextView book_intros;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_more);

        book_image2 = findViewById(R.id.book_img2);
        book_intros = findViewById(R.id.books_intros_tv2);


        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String value = extras.getString("title");
            int img = extras.getInt("book");
            book_intros.setText(value);
            book_image2.setImageResource(img);
        }
    }
}