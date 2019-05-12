package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.concurrent.LinkedBlockingDeque;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Click on Library
        TextView library = (TextView) findViewById(R.id.library);

        library.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent libraryIntent = new Intent(MainActivity.this, LibraryActivity.class);

                startActivity(libraryIntent);
            }
        });
        // Click on Playlist
        TextView playlist = (TextView) findViewById(R.id.playlist);

        playlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent playListIntent = new Intent(MainActivity.this, PlaylistActivity.class);

                startActivity(playListIntent);
            }
        });
        // Click on Music Player
        TextView musicplayer = (TextView) findViewById(R.id.musicPlayer);

        musicplayer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent musicplayerIntent = new Intent(MainActivity.this, MusicPlayerActivity.class);

                startActivity(musicplayerIntent);
            }
        });
    }
}
