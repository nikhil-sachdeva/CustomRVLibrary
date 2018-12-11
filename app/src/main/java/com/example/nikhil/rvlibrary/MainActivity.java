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
        String[] res={"Alpha","Beta","Gamma"};
        String[] res2={"Alpha","Beta","Gamma"};
        ArrayList<Drawable> images = new ArrayList<>();
        images.add(getResources().getDrawable(R.drawable.ic_launcher_background));
        images.add(getResources().getDrawable(R.drawable.ic_launcher_background));
        images.add(getResources().getDrawable(R.drawable.ic_launcher_background));
        RVAdapter rvAdapter = new RVAdapter(getApplicationContext(),res,res2,images);

        list.setAdapter(rvAdapter);

    }


}
