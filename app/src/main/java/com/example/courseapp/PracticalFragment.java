package com.example.courseapp;



import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

/**
 * A simple {@link Fragment} subclass.
 */
public class PracticalFragment extends Fragment {

    View view;
    ListView listView;

    AppUtility appUtility;

    ArrayAdapter<String> namesAdapter;
    ListcustomAdapter listcustomAdapter;


    public PracticalFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_practical, container, false);

        listView = (ListView)view.findViewById(R.id.prac_view);

        appUtility= AppUtility.getAppUtility(getContext());
        listcustomAdapter = new ListcustomAdapter(getContext(),appUtility.getPracticalList());
        listView.setAdapter(listcustomAdapter);
        return  view;
    }

}
