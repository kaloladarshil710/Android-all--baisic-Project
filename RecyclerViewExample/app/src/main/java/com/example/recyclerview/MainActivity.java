package com.example.recyclerview;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import com.example.recyclerview.Adapters.ContectAdapter;
import com.example.recyclerview.Models.ContectModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclarView = findViewById(R.id.recyclarView);

        ArrayList<ContectModel> list = new ArrayList<>();

        list.add(new ContectModel(R.drawable.ic_launcher_foreground,"Darshil"));
        list.add(new ContectModel(R.drawable.ic_launcher_background,"Ram"));
        list.add(new ContectModel(R.drawable.ic_launcher_foreground,"Khush"));
        list.add(new ContectModel(R.drawable.ic_launcher_background,"Shiv"));
        list.add(new ContectModel(R.drawable.ic_launcher_foreground,"Paresh"));
        list.add(new ContectModel(R.drawable.ic_launcher_background,"Sandip"));
        list.add(new ContectModel(R.drawable.ic_launcher_foreground,"Bhavesh"));
        list.add(new ContectModel(R.drawable.ic_launcher_background,"Dev"));
        list.add(new ContectModel(R.drawable.ic_launcher_foreground,"Python"));
        list.add(new ContectModel(R.drawable.ic_launcher_background,"Bhola"));
        list.add(new ContectModel(R.drawable.ic_launcher_foreground,"JAVA"));
        list.add(new ContectModel(R.drawable.ic_launcher_background,"Flutter"));
        list.add(new ContectModel(R.drawable.ic_launcher_background,"Ram"));
        list.add(new ContectModel(R.drawable.ic_launcher_foreground,"Khush"));
        list.add(new ContectModel(R.drawable.ic_launcher_background,"Shiv"));
        list.add(new ContectModel(R.drawable.ic_launcher_foreground,"Paresh"));
        list.add(new ContectModel(R.drawable.ic_launcher_background,"Sandip"));
        list.add(new ContectModel(R.drawable.ic_launcher_foreground,"Bhavesh"));
        list.add(new ContectModel(R.drawable.ic_launcher_background,"Dev"));
        list.add(new ContectModel(R.drawable.ic_launcher_foreground,"Python"));
        list.add(new ContectModel(R.drawable.ic_launcher_background,"Bhola"));
        list.add(new ContectModel(R.drawable.ic_launcher_foreground,"JAVA"));
        list.add(new ContectModel(R.drawable.ic_launcher_background,"Flutter"));

        ContectAdapter adapter =new ContectAdapter(list,this);
        recyclarView.setAdapter(adapter);


//        StaggeredGridLayoutManager staggered = new StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.HORIZONTAL);
//        recyclarView.setLayoutManager(staggered);

//        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,3);
//        recyclarView.setLayoutManager(gridLayoutManager);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclarView.setLayoutManager(layoutManager);

//        LinearLayoutManager layoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
//        recyclarView.setLayoutManager(layoutManager);

    }
}