package com.example.game1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class ActivityPractice extends AppCompatActivity {

    MediaPlayer intense;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practice);

        intense = MediaPlayer.create(ActivityPractice.this, R.raw.intense);
        intense.setLooping(true);
        intense.start();
    }
        protected void onPause(){
            super.onPause();
            intense.release();
            finish();
        }
        public void previous(View view){
            startActivity(new Intent(ActivityPractice.this,MainActivity.class));
    }
}