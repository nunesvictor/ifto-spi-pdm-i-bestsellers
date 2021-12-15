package com.example.best_sellers;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class BookDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_detail);

        BookList books = BookList.instance;
        Book book = books.get(getIntent().getIntExtra("book", 0));

        ImageView coverImageView = findViewById(R.id.imageview_book_cover);
        coverImageView.setImageResource(book.getCover());

        TextView precoTextView = findViewById(R.id.textview_book_price);
        precoTextView.setText(getString(R.string.textview_book_price, book.getPrice()));

        TextView synopsisTextView = findViewById(R.id.textview_book_synopsis);
        synopsisTextView.setText(book.getSynopsis());
    }

    @Override
    protected void onStop() {
        super.onStop();
        finish();
    }
}
