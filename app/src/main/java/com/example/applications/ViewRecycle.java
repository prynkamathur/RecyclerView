package com.example.applications;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ViewRecycle extends AppCompatActivity {

    Button linear, grid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewrecycle);

        linear = findViewById(R.id.Linear);
        grid = findViewById(R.id.Grid);

        linear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent linear = new Intent(getApplicationContext(),LinearRecycle.class );
                startActivity(linear);

            }
        });

        grid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent grid = new Intent(getApplicationContext(),GridRecycle.class);
                startActivity(grid);

            }
        });

    }
}
