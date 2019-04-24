package com.example.android.aswanapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;


public class SomeNubianWordsFragment extends Fragment {


    public SomeNubianWordsFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_hotels, container, false);

        final ArrayList<AswanData> data = new ArrayList<AswanData>();
        data.add(new AswanData(getString(R.string.mother),getString(R.string.motherEn),R.drawable.family_mother));
        data.add(new AswanData(getString(R.string.myMother),getString(R.string.myMotherEn),R.drawable.family_mother));
        data.add(new AswanData(getString(R.string.father),getString(R.string.fatherEn),R.drawable.family_father));
        data.add(new AswanData(getString(R.string.myFather),getString(R.string.myFatherEn),R.drawable.family_father));
        data.add(new AswanData(getString(R.string.sister),getString(R.string.sisterEn),R.drawable.family_older_sister));
        data.add(new AswanData(getString(R.string.brother),getString(R.string.brotherEn),R.drawable.family_older_brother));
        data.add(new AswanData(getString(R.string.grandba),getString(R.string.grandbaEn),R.drawable.family_grandfather));
        data.add(new AswanData(getString(R.string.grandMa),getString(R.string.grandMaEn),R.drawable.family_grandmother));
        data.add(new AswanData(getString(R.string.man),getString(R.string.manEn),R.drawable.man));
        data.add(new AswanData(getString(R.string.woman),getString(R.string.womanEn),R.drawable.woman));
        data.add(new AswanData(getString(R.string.black),getString(R.string.blackEn),R.drawable.color_black));
        data.add(new AswanData(getString(R.string.red),getString(R.string.redEn),R.drawable.color_red));
        data.add(new AswanData(getString(R.string.green),getString(R.string.greenEn),R.drawable.color_green));
        data.add(new AswanData(getString(R.string.yellow),getString(R.string.yellowEn),R.drawable.color_mustard_yellow));

        MyAdapter<AswanData> itemsAdapter = new MyAdapter<>(getActivity(),data);
        ListView listView =(ListView)rootView.findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
        return rootView;
    }

}
