package com.example.myapplication.ui.main;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.myapplication.R;

import java.util.ArrayList;


public class NewsFrag extends Fragment {

    private ListView listView;
    public NewsFrag() {
        
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_news, container, false);

        ListView listView = (ListView) view.findViewById(R.id.list);
        ArrayList<String> arr = new ArrayList<>();
        arr.add("good day");
        arr.add("KG1 had arabic session");
        arr.add("KG2 had coloring session");
        arr.add("KG3 had a party session");
        arr.add("KG1 played in the playground");
        arr.add("Required home work for KG 2");
        arr.add("good day");
        arr.add("KG1 had arabic session");
        arr.add("KG2 had coloring session");
        arr.add("KG3 had a party session");
        arr.add("KG1 played in the playground");
        arr.add("Required home work for KG 2");
        arr.add("good day");
        arr.add("KG1 had arabic session");
        arr.add("KG2 had coloring session");
        arr.add("KG3 had a party session");
        arr.add("KG1 played in the playground");
        arr.add("Required home work for KG 2");
        ArrayAdapter arrayAdapter=new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,arr);
        listView.setAdapter(arrayAdapter);

        return  view;
    }
}
