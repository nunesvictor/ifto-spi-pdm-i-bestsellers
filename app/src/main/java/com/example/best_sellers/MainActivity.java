package com.example.best_sellers;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ListView bestSellersListView;
    private List<Book> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle(getString(R.string.app_bar_text_header));

        bestSellersListView = findViewById(R.id.listview_bestsellers);

        bestSellersListView.setAdapter(new BestSellersAdapter(getApplicationContext(), BookList.instance));
        bestSellersListView.setOnItemClickListener((adapterView, view, i, l) -> {
            Intent intent = new Intent(this, BookDetailActivity.class);
            intent.putExtra("book", i);

            startActivity(intent);
        });
    }
}
