package com.example.android.myapplication;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class NewsAdapter extends ArrayAdapter<News> {

    private static final String DATE_SEPARATOR = "T";

    public NewsAdapter (Activity context, ArrayList<News> earthquakes){
        super(context, 0, earthquakes);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        News currentNews = getItem(position);
        TextView sectionNameView = (TextView) listItemView.findViewById(R.id.tv_section_name);
        sectionNameView.setText(currentNews.getSectionName());

        String date = currentNews.getDate();
        String[] dateParts = date.split(DATE_SEPARATOR);
        TextView dateView = (TextView) listItemView.findViewById(R.id.tv_date);
        dateView.setText(dateParts[0]);

        TextView titleView = (TextView) listItemView.findViewById(R.id.tv_title);
        titleView.setText(currentNews.getTitle());

        TextView authorView = (TextView) listItemView.findViewById(R.id.tv_author);
        authorView.setText(currentNews.getAuthor());

        return listItemView;
    }
}