package com.example.form;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;
import java.util.List;


public class DisasterFragment extends Fragment {
ListView listView;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container,
//                             Bundle savedInstanceState) {
//        View view = inflater.inflate(R.layout.fragment_disaster, container, false);
//        listView = view.findViewById(R.id.listView);
//        List<String> personList = new ArrayList<String>();
//        personList.add("Forest Fire");
//        personList.add("Volcano");
//        personList.add("Earthquake");
//        personList.add("Tsunami");
//        personList.add("Hurricane");
//        personList.add("Flood");
//        personList.add("Snowstorm");
//        personList.add("Tornado");
//        personList.add("Dust storm");
//        personList.add("Hailstorm");
//        personList.add("Thunderstorm");
//        personList.add("Avalanche");
//        personList.add("Windstorm");
//        personList.add("Sinkhole");
//        personList.add("Tornado");
//        personList.add("Sandstorm");
//        personList.add("Drought");
//
//
//        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, personList);
//        listView.setAdapter(arrayAdapter);
//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//               startActivity(new Intent(getActivity(), DisasterMap.class));
//            }
//        });
//        return view;
//    }

    public void onClick(View view) {
        startActivity(new Intent(getActivity(), DisasterMap.class));

    }
}