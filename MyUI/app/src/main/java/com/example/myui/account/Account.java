package com.example.myui.account;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.example.myui.MainActivity;
import com.example.myui.R;
import com.example.myui.account.notes.NoteActivity;
import com.example.myui.favourite.Favourite;

public class Account extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);
        findViewById(R.id.back).setBackgroundResource(R.color.purple_200);
        Animation anim = AnimationUtils.loadAnimation(this, R.anim.blink_anim);
        findViewById(R.id.back).startAnimation(anim);
        findViewById(R.id.back).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Account.this, MainActivity.class));
            }
        });
        findViewById(R.id.myNotes).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Account.this, NoteActivity.class));
            }
        });
    }
}