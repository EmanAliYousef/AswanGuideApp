package com.example.android.aswanapp;


import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class TouristicPlacesFragment extends Fragment {

    public TouristicPlacesFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.activity_hotels, container, false);

        final ArrayList<AswanData> data = new ArrayList<AswanData>();
        data.add(new AswanData(getString(R.string.masallaName),getString(R.string.masalla),R.drawable.masalla));
        data.add(new AswanData(getString(R.string.theNubiaName),getString(R.string.thenubian),R.drawable.nubianmuseum));
        data.add(new AswanData(getString(R.string.elphentineName),getString(R.string.elphentineisland),R.drawable.elephantineisland));
        data.add(new AswanData(getString(R.string.plantislandName),getString(R.string.theplantsisland),R.drawable.theplantsisland));
        data.add(new AswanData(getString(R.string.highDamName),getString(R.string.highDam),R.drawable.highdam));
        data.add(new AswanData(getString(R.string.philaTempleName),getString(R.string.templeofphila),R.drawable.templeofphilae));
        data.add(new AswanData(getString(R.string.talbyaName),getString(R.string.mosqueTalbya),R.drawable.mosqueoftabiya));
        data.add(new AswanData(getString(R.string.comomboName),getString(R.string.comombo),R.drawable.templeofkomombo));
        data.add(new AswanData(getString(R.string.aswanMuseumName),getString(R.string.aswanmuseum),R.drawable.aswanmuseum));

        MyAdapter<AswanData> itemsAdapter = new MyAdapter<>(getActivity(),data);
        ListView listView =(ListView)rootView.findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
        return rootView;
    }


}


