package com.example.myui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.example.myui.account.Account;
import com.example.myui.favourite.Favourite;
import com.example.myui.grids.Comfort;
import com.example.myui.grids.Finance;
import com.example.myui.grids.Goals;
import com.example.myui.grids.Health;
import com.example.myui.nothing.Nothing;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {
    private BottomNavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        navigationView = findViewById(R.id.navigationView);
        navigationView.setOnNavigationItemSelectedListener(MainActivity.this);
        findViewById(R.id.goals).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Goals.class));
            }
        });
        findViewById(R.id.finance).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Finance.class));
            }
        });
        findViewById(R.id.health).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Health.class));
            }
        });
        findViewById(R.id.comfort).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Comfort.class));
            }
        });
        findViewById(R.id.menu).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Nothing.class));
            }
        });
        findViewById(R.id.search).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Nothing.class));
            }
        });
    }

    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        switch(item.getItemId()) {
            case R.id.navigation_home:
                startActivity(new Intent(this, MainActivity.class));
                return true;
            case R.id.favourite:
                startActivity(new Intent(this, Favourite.class));
                return true;

            case R.id.account:
                startActivity(new Intent(this, Account.class));
                return true;

            case R.id.setting:
                startActivity(new Intent(this, Nothing.class));
                return true;
        }
        return false;
    }

}