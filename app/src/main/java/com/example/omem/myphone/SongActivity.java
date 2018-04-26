package com.example.omem.myphone;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SongActivity extends AppCompatActivity {
    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song);

        this.mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.my_song);
    }

    public void playMyMusic(View view) {
        mediaPlayer.start();
    }
}
