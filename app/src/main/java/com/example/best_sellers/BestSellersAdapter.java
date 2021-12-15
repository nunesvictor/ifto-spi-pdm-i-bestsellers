package com.example.best_sellers;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class BestSellersAdapter extends BaseAdapter {
    private final Context context;
    private final List<Book> data;

    public BestSellersAdapter(Context context, List<Book> data) {
        this.context = context;
        this.data = data;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Book getItem(int i) {
        return data.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View myView = layoutInflater.inflate(R.layout.listview_item_book, viewGroup, false);

        Book book = data.get(i);

        ImageView coverImageView = myView.findViewById(R.id.imageview_book_cover);
        coverImageView.setImageResource(book.getCover());

        TextView titleTextView = myView.findViewById(R.id.textview_book_title);
        titleTextView.setText(book.getTitle());

        TextView authorTextView = myView.findViewById(R.id.textview_book_author);
        authorTextView.setText(book.getAuthor());

        TextView publisherTextView = myView.findViewById(R.id.textview_book_publisher);
        publisherTextView.setText(book.getPublisher());

        TextView lastWeekPositionTextView = myView.findViewById(R.id.textview_book_last_week_position);
        lastWeekPositionTextView.setText(context.getString(R.string.textview_previous_week, book.getLastWeekPosition()));

        TextView weeksOnListTextView = myView.findViewById(R.id.textview_book_weeks_on_list);
        weeksOnListTextView.setText(context.getString(R.string.textview_weeks_on_list, book.getWeeksOnList()));

        return myView;
    }
}
