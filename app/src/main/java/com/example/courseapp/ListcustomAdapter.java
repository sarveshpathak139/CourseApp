package com.example.courseapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class ListcustomAdapter extends BaseAdapter {

    View view;
    private  static  final String TAG = ListcustomAdapter.class.getSimpleName();

    List<Practical> practicalList;
    Context context;

    LayoutInflater layoutInflater;

    public  ListcustomAdapter(Context context,List<Practical> practicalList){
        this.context=context;
        this.practicalList= practicalList;
    }

    @Override
    public int getCount() {
        return practicalList.size();
    }

    @Override
    public Object getItem(int position) {
        return practicalList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        layoutInflater = LayoutInflater.from(this.context);
        view = layoutInflater.inflate(R.layout.listitem,null);
        final Practical practical = practicalList.get(position);

        ((TextView)view.findViewById(R.id.textview1)).setText(practical.getPrac_Name());
        ((TextView)view.findViewById(R.id.textview2)).setText(practical.getPrac_Content());

        return view;
    }
}
