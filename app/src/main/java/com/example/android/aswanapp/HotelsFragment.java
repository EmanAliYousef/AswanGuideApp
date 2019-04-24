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

public class HotelsFragment extends Fragment {


    public HotelsFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_hotels, container, false);


        final ArrayList<AswanData> data = new ArrayList<AswanData>();
        data.add(new AswanData(getString(R.string.sofitil),getString(R.string.sofitilData),R.drawable.sofitile));
        data.add(new AswanData(getString(R.string.Mouvinpic),getString(R.string.MouvinpicData),R.drawable.muvinpick));
        data.add(new AswanData(getString(R.string.pyramisia),getString(R.string.pyramisiaData),R.drawable.pyramisia));
        data.add(new AswanData(getString(R.string.phila),getString(R.string.philaData),R.drawable.filate));
        data.add(new AswanData(getString(R.string.basma),getString(R.string.basmaData),R.drawable.basma));
        data.add(new AswanData(getString(R.string.isis),getString(R.string.isisData),R.drawable.pyramisiaisis));
        data.add(new AswanData(getString(R.string.marhaba),getString(R.string.marhabaData),R.drawable.marhababalas));
        data.add(new AswanData(getString(R.string.nileData),getString(R.string.nileData),R.drawable.nile));

        MyAdapter<AswanData> itemsAdapter = new MyAdapter<>(getActivity(),data);
        ListView listView =(ListView)rootView.findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
        return rootView;

    }

}
