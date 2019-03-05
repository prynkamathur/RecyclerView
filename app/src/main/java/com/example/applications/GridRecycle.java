package com.example.applications;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class GridRecycle extends AppCompatActivity {

    RecyclerView recyclergrid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_recycle);

        recyclergrid = findViewById(R.id.RecycleGrid);

        recyclergrid.setLayoutManager(new GridLayoutManager(GridRecycle.this, 3));

        List<ListDataModel> models = new ArrayList<>();
        for(int i=0; i<3; i++)
        {
            models.add(new ListDataModel(R.drawable.castle));
            models.add(new ListDataModel(R.drawable.coffee));
            models.add(new ListDataModel(R.drawable.holidayplace));
        }

        AdapterRecycle recyclerAdapter = new AdapterRecycle(models);
        recyclergrid.setAdapter(recyclerAdapter);

    }
}
