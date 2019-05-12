package com.example.android.musicalstructureapp;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class MusicAdapter extends ArrayAdapter<Music> {

}public MusicAdapter(Context context, ArrayList<Music> musicword) {
    super(context, 0, musicword);
}

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Word} object located at this position in the list
        Music currentMusic = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID miwok_text_view.
        TextView titleTextView = (TextView) listItemView.findViewById(R.id.title_text_view);
        // Get the Miwok translation from the currentWord object and set this text on
        // the Miwok TextView.
        titleTextView.setText(currentMusic.gettitleName());

        // Find the TextView in the list_item.xml layout with the ID default_text_view.
        TextView artistTextView = (TextView) listItemView.findViewById(R.id.artist_text_view);
        // Get the default translation from the currentWord object and set this text on
        // the default TextView.
        artistTextView.setText(currentMusic.getartistName());

        // Return the whole list item layout (containing 2 TextViews) so that it can be shown in
        // the ListView.
        return listItemView;
    }
}
