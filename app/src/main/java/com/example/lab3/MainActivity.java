package com.example.lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.lab3.task2.Activity1Task2;
import com.example.lab3.task3.Activity1Task3;
import com.example.lab3.task4.Activity1Task4;
import com.example.lab3.task5.StartActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button1 = (Button) findViewById(R.id.button2);
        Button button2 = (Button) findViewById(R.id.button);
        Button button3 = (Button) findViewById(R.id.button3);
        Button button4 = (Button) findViewById(R.id.button4);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch (id) {
            case R.id.button2:
                Intent intent = new Intent(this, Activity1Task2.class);
                startActivity(intent);
                break;
            case R.id.button:
                Intent intent1 = new Intent(this, Activity1Task3.class);
                startActivity(intent1);
                break;
            case R.id.button3:
                Intent intent2 = new Intent(this, Activity1Task4.class);
                intent2.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
                startActivity(intent2);
                break;
            case R.id.button4:
                Intent intent3 = new Intent(this, StartActivity.class);
                startActivity(intent3);
                break;
        }
    }
}