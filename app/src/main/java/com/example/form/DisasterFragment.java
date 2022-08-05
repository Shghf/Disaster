package com.example.form;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.form.adapter.CustomAdapter;
import com.example.form.model.DisasterModel;

import java.util.ArrayList;

public class DisasterFragment extends Fragment {
    CustomAdapter adapter;
    RecyclerView disasterRecyclerView;
    static  ArrayList<DisasterModel> disasterList;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_disaster, container, false);
        disasterRecyclerView = view.findViewById(R.id.disaster_list);
         disasterList = new ArrayList<>();
        disasterList.add(new DisasterModel(R.drawable.flood, "Floods", "flood_disaster_flooding_is_a_temporary_overflow_of_water_onto_land_that_is_normally_dry_floods_are_the_most_common_natural_disaster_in_the_united_states_detection_find_safe_shelter_right_away_do_not_walk_swim_or_drive_through_flood_waters_turn_around_don_t_drown_remember_just_six_inches_of_moving_water_can_knock_you_down_and_one_foot_of_moving_water_can_sweep_your_vehicle_away_stay_off_bridges_over_fast_moving_water_depending_on_the_type_of_flooding_o_evacuate_if_told_to_do_so_o_move_to_higher_ground_or_a_higher_floor_o_stay_where_you_are"));
        adapter =new CustomAdapter(getActivity(),disasterList);
        adapter.setOnItemClickListener((position, v) -> {
            Intent intent = new Intent(getActivity(), DisasterMap.class);
            intent.putExtra("position", position);
            startActivity(intent);
        });
        insertToLocal();
        return view;
    }
    void insertToLocal() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false);
        disasterRecyclerView.setLayoutManager(linearLayoutManager);
        disasterRecyclerView.setAdapter(adapter);
        linearLayoutManager.setStackFromEnd(true);
//        recycleViewMessage.addItemDecoration(new OverlapDecoration());

    }
}