package com.example.applications;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class AdapterList extends ArrayAdapter<ListDataModel> {

    int layoutid;
    ArrayList<ListDataModel>listdata;

    public AdapterList(Context context, int resource, ArrayList<ListDataModel>object) {
        super(context, resource, object);
        layoutid = resource;
        listdata = object;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ListDataModel item = getItem(position);
        ViewHolder viewHolder;


        if(convertView==null)
        {

            viewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(layoutid,parent,false);
            viewHolder.imageView = (ImageView) convertView.findViewById(R.id.List_Image);
            convertView.setTag(viewHolder);
        }
        else
        {

            viewHolder = (ViewHolder)convertView.getTag();

        }

        viewHolder.imageView.setImageResource(item.getList_Image());

        return convertView;
    }

    private static class ViewHolder
    {
        ImageView imageView;
    }

}
