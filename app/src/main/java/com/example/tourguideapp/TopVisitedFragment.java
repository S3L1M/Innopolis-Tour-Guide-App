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
public class TopVisitedFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list, container, false);
        super.onCreate(savedInstanceState);

        ArrayList<Item> items = new ArrayList<Item>();
        items.add(new Item(R.drawable.innopolis_university, R.string.innopolis_university));
        items.add(new Item(R.drawable.pyaterochka, R.string.pyaterochka));
        items.add(new Item(R.drawable.technopark, R.string.technopark));
        items.add(new Item(R.drawable.sport_complex, R.string.sport));
        items.add(new Item(R.drawable.post_office, R.string.post));

        Adapter adapter = new Adapter(getActivity(), items);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;
    }
}
