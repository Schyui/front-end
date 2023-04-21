package com.example.game1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import com.example.game1.R;

public class ActivityStart extends AppCompatActivity {
    MediaPlayer lunatic;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        lunatic = MediaPlayer.create(ActivityStart.this, R.raw.lunatic);
        lunatic.setLooping(true);
        lunatic.start();
    }

        protected void onPause(){
            super.onPause();
            lunatic.release();
            finish();
        }
        public void previous(View view){
        startActivity(new Intent(ActivityStart.this,MainActivity.class));
        }
    }
