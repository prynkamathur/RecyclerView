package com.example.applications;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class LinearRecycle extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_recycle);

        recyclerView = findViewById(R.id.RecycleLinear);

        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        List<ListDataModel> models = new ArrayList<>();
        for(int i=0; i<10; i++)
        {
            models.add(new ListDataModel(R.drawable.mountain));
        }

        AdapterRecycle recyclerAdapter = new AdapterRecycle(models);
        recyclerView.setAdapter(recyclerAdapter);

    }
}
