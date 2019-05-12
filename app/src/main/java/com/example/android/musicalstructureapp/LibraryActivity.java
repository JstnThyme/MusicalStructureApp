package com.example.android.musicalstructureapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ListView;

import java.util.ArrayList;

public class LibraryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);


        // Create a list of words
        ArrayList<Music> musicword = new ArrayList<Music>();
        musicword.add(new Music("red", "weṭeṭṭi"));
        musicword.add(new Music("mustard yellow", "chiwiiṭә"));
        musicword.add(new Music("dusty yellow", "ṭopiisә"));
        musicword.add(new Music("green", "chokokki"));
        musicword.add(new Music("brown", "ṭakaakki"));
        musicword.add(new Music("gray", "ṭopoppi"));
        musicword.add(new Music("black", "kululli"));
        musicword.add(new Music("white", "kelelli"));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        MusicAdapter adapter = new MusicAdapter(this, musicword);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);
    }
}
