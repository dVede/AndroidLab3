package com.example.lab3.task3;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.lab3.AboutActivity;
import com.example.lab3.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Activity1Task3 extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity1_task2);
        Button button = (Button) findViewById(R.id.button5);
        button.setOnClickListener(this);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Intent intent = new Intent(getApplicationContext(), AboutActivity.class);
                startActivity(intent);
                overridePendingTransition(0, 0);
                return true;
            }
        });
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, Activity2Task3.class);
        startActivity(intent);
        overridePendingTransition(0, 0);
    }
}