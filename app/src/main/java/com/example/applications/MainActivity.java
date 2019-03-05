package com.example.applications;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button list, recycle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list = findViewById(R.id.List);
        recycle = findViewById(R.id.Recycle);

        list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent list = new Intent(getApplicationContext(),ViewList.class);
                startActivity(list);

            }
        });

        recycle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent recycle = new Intent(getApplicationContext(),ViewRecycle.class);
                startActivity(recycle);

            }
        });

    }
}
