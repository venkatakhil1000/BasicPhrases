package com.example.basicphrases;

import android.media.MediaPlayer;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    public void playPhrase(View view){

        Button buttonPressed=(Button) view;

        MediaPlayer mediaPlayer=MediaPlayer.create(this,getResources().getIdentifier(buttonPressed.getTag().toString(),"raw",getPackageName()));

        mediaPlayer.start();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}