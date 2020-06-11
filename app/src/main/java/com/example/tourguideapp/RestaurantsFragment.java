package com.example.tourguideapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class RestaurantsFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list, container, false);
        super.onCreate(savedInstanceState);

        ArrayList<Item> items = new ArrayList<Item>();
        items.add(new Item(R.drawable.cacio_e_vino, R.string.cacio));
        items.add(new Item(R.drawable.cofe_cava, R.string.cava));
        items.add(new Item(R.drawable.burgerbeer, R.string.burgerbeer));
        items.add(new Item(R.drawable.nashe_mesto_hookah_bar, R.string.bar));

        Adapter adapter = new Adapter(getActivity(), items);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;
    }
}
