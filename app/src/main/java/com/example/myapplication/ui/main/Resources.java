package com.example.myapplication.ui.main;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.myapplication.R;
import com.example.myapplication.videos;

/**
 * A simple {@link Fragment} subclass.
 */
public class Resources extends Fragment {


    public Resources() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_resources, container, false);

        ImageView imageView = (ImageView) view.findViewById(R.id.tovi);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), videos.class);
                startActivity(intent);
            }
        });
        return view;
    }

}
