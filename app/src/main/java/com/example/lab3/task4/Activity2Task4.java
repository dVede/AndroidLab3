package com.example.lab3.task4;

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

public class Activity2Task4 extends AppCompatActivity implements View.OnClickListener {

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
                Intent intent1 = new Intent(this, Activity1Task4.class);
                intent1.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
                startActivity(intent1);
                overridePendingTransition(0, 0);
                break;
            case R.id.button7:
                Intent intent2 = new Intent(this, Activity3Task4.class);
                intent2.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
                startActivity(intent2);
                overridePendingTransition(0, 0);
                break;
        }
    }
}