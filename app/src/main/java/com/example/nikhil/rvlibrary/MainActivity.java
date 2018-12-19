package com.example.nikhil.rvlibrary;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;


import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
RecyclerView list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list=findViewById(R.id.list);
        list.setHasFixedSize(true);
        list.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        String[] res={"Cupcake","Lollipop","Oreo","Ice-cream Sandwich"};
        String[] res2={"Version 1.5","Version 5.0","Version 8.0", "Version 4.0"};
        ArrayList<Drawable> images = new ArrayList<>();
        images.add(getResources().getDrawable(R.drawable.cupcake));
        images.add(getResources().getDrawable(R.drawable.lollipop));
        images.add(getResources().getDrawable(R.drawable.oreo));
        images.add(getResources().getDrawable(R.drawable.sandwich));
        RVAdapter rvAdapter = new RVAdapter(getApplicationContext(),res,res2,images);

        list.setAdapter(rvAdapter);

    }


}
