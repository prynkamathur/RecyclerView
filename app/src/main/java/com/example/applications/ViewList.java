package com.example.applications;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ViewList extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_list);


        listView=findViewById(R.id.List);


        ArrayList<ListDataModel> itemlist = new ArrayList<>();

        itemlist.add(new ListDataModel(R.drawable.beach));
        itemlist.add(new ListDataModel(R.drawable.island));
        itemlist.add(new ListDataModel(R.drawable.maldives));


        AdapterList itemarrayadapter = new AdapterList(this, R.layout.listitem,itemlist);
        listView.setAdapter(itemarrayadapter);

    }
}
