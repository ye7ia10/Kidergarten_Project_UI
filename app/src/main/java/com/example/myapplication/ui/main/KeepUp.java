package com.example.myapplication.ui.main;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.myapplication.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class KeepUp extends Fragment {


    public KeepUp() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_keep_up, container, false);

        ListView listView = (ListView) view.findViewById(R.id.l2);
        ArrayList<String> arr = new ArrayList<>();
        arr.add("week 1");
        arr.add("week 2");
        arr.add("week 3");
        arr.add("Children Activities Participating");
        arr.add("week 4");
        arr.add("week 5");
        arr.add("week 6");
        arr.add("week 7");
        arr.add("week 8");
        arr.add("exam 1");
        arr.add("quiz 2");
        ArrayAdapter arrayAdapter=new ArrayAdapter<String>(getActivity(),R.layout.mytextview,arr);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getContext(), "You will be moved to details", Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }

}
