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

public class Activity2Task3 extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity2_task2);
        Button button1 = (Button) findViewById(R.id.button6);
        Button button2 = (Button) findViewById(R.id.button7);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);

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
        int id = v.getId();
        switch (id) {
            case R.id.button6:
                finish();
                overridePendingTransition(0, 0);
                break;
            case R.id.button7:
                Intent intent = new Intent(this, Activity3Task3.class);
                startActivity(intent);
                overridePendingTransition(0, 0);
                break;
        }
    }
}