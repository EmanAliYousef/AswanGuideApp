package com.example.android.aswanapp;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;


public class RestaurantsFragment extends Fragment {


    public RestaurantsFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_hotels, container, false);

        final ArrayList<AswanData> data = new ArrayList<AswanData>();
        data.add(new AswanData(getString(R.string.dokka),getString(R.string.dokkaData),R.drawable.eldokka));
        data.add(new AswanData(getString(R.string.masry),getString(R.string.masryData),R.drawable.elmasry));
        data.add(new AswanData(getString(R.string.panorama),getString(R.string.panoramaData),R.drawable.panoramarestaurant));
        data.add(new AswanData(getString(R.string.terrace),getString(R.string.terraceData),R.drawable.theterrace));
        data.add(new AswanData(getString(R.string.porto),getString(R.string.portoData),R.drawable.porto));
        data.add(new AswanData(getString(R.string.nubian),getString(R.string.nubianData),R.drawable.nubianrestaurant));
        data.add(new AswanData(getString(R.string.salah),getString(R.string.salahData),R.drawable.salaheldin));

        MyAdapter<AswanData> itemsAdapter = new MyAdapter<>(getActivity(),data);
        ListView listView =(ListView)rootView.findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
        return rootView;

    }


}
