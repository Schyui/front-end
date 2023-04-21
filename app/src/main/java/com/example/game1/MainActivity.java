package com.example.game1;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

import com.example.name.R;


public class MainActivity extends AppCompatActivity {
    MediaPlayer menu;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        menu = MediaPlayer.create(MainActivity.this, R.raw.menu);
        menu.setLooping(true);
        menu.start();
        Button start = (Button) findViewById(R.id.startbtn);
        Button practice = (Button) findViewById(R.id.practicebtn);
        Button settings = (Button) findViewById(R.id.settingsbtn);


        start.setOnClickListener(v -> openActivityStart());
        practice.setOnClickListener(v -> openActivityPractice());
        settings.setOnClickListener(v -> openActivitySettings());
        }

    public void openActivityPractice() {
        Intent intent = new Intent(this, ActivityPractice.class);
        startActivity(intent);
    }

    public void openActivitySettings() {
        Intent intent = new Intent(this, ActivitySettings.class);
        startActivity(intent);
    }

    public void openActivityStart() {
        Intent intent = new Intent(this, ActivityStart.class);
        startActivity(intent);
    }


    public void startGame(View view) {
    }

    @Override
    protected void onPause(){
        super.onPause();
        menu.release();
        finish();
    }

}
