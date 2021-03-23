package com.example.myui.favourite;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;
import com.example.myui.MainActivity;
import com.example.myui.R;
import com.example.myui.favourite.friends.FriendActivity;

public class Favourite extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favourite);
        findViewById(R.id.back).setBackgroundResource(R.color.purple_200);
        Animation anim = AnimationUtils.loadAnimation(this, R.anim.blink_anim);
        findViewById(R.id.back).startAnimation(anim);
        findViewById(R.id.back).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Favourite.this, MainActivity.class));
            }
        });
        findViewById(R.id.friend).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openInterface();
            }
        });
    }
    public void openInterface() {
        Intent intent = new Intent(this, FriendActivity.class);
        startActivity(intent);
    }
}