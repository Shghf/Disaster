package com.example.form;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;
import java.util.List;


public class DisasterFragment extends Fragment {
    ImageView tsunami, earthquake, volcano, forest, tornado, snowstorm, flood, hurricane, sandstorm, thunderstorm, hailstorm, dust, drought, sinkhole, avalanche, windstorm;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_disaster, container, false);
        tsunami = view.findViewById(R.id.tsunami);
        earthquake = view.findViewById(R.id.earthquake);
        volcano = view.findViewById(R.id.volcano);
        forest = view.findViewById(R.id.forest);
        tornado = view.findViewById(R.id.tornado);
        snowstorm = view.findViewById(R.id.snowstorm);
        flood = view.findViewById(R.id.flood);
        hurricane = view.findViewById(R.id.hurricane);
        sandstorm = view.findViewById(R.id.sandstorm);
        thunderstorm = view.findViewById(R.id.thunderstorm);
        hailstorm = view.findViewById(R.id.hailstorm);
        dust = view.findViewById(R.id.dust);
        drought = view.findViewById(R.id.drought);
        sinkhole = view.findViewById(R.id.sinkhole);
        avalanche = view.findViewById(R.id.avalanche);
        windstorm = view.findViewById(R.id.windstorm);


        tsunami.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), DisasterMap.class);
            intent.putExtra("disaster-title", "information about Hurricanes:");
            intent.putExtra("disaster-details", "Hurricanes  are dangerous and  can  cause  major damage   from   storm   surge,  wind  damage, rip currents  and  flooding.  They  can  happen along any U.S. coast or in any territory in the Atlantic or Pacific oceans.");
            startActivity(intent);
        });
        return view;
    }
}