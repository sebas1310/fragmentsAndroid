package com.example.fragapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class Fragmento1 extends Fragment {

    private Integer cnt=0;

    private Button btncnt;
    private Button btnHello;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_fragmento1, container, false);
        btncnt = (Button) view.findViewById(R.id.countxml);
        btnHello = (Button) view.findViewById(R.id.helloxml);

        btncnt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cnt++;
                Toast.makeText(getActivity(), "contagem em: "+ cnt, Toast.LENGTH_SHORT).show();
            }
        });


        btnHello.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity mainActivity = (MainActivity) getActivity();
                mainActivity.hello();
            }
        });

        return view;

    }
}