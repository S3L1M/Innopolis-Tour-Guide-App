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
public class EducationFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list, container, false);
        super.onCreate(savedInstanceState);

        ArrayList<Item> items = new ArrayList<Item>();
        items.add(new Item(R.drawable.innopolis_university, R.string.innopolis_university));
        items.add(new Item(R.drawable.lyceum_innopolis, R.string.school));
        items.add(new Item(R.drawable.kindergarten, R.string.kg));

        Adapter adapter = new Adapter(getActivity(), items);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;
    }
}
