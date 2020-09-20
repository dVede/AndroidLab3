package com.example.lab3.task5;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.lab3.R;

public class Fragment2 extends Fragment implements View.OnClickListener {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_2, container, false);
        Button button1 = (Button) view.findViewById(R.id.button10);
        Button button2 = (Button) view.findViewById(R.id.button11);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch (id) {
            case R.id.button10:
                Navigation.findNavController(v).navigate(R.id.action_fragment2_to_fragment122);
                break;
            case R.id.button11:
                Navigation.findNavController(v).navigate(R.id.action_fragment2_to_fragment32);
                break;
        }
    }
}