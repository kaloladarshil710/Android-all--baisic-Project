package com.example.recyclerview;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
RecyclerView recyclerView;
ArrayList<ContactModel> arrContacts = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerContact);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        ContactModel model = new ContactModel(R.drawable.ic_launcher_foreground,"A","9876543210");

        arrContacts.add(model);
        arrContacts.add(new ContactModel(R.drawable.ic_launcher_foreground,"B","1234567890"));

        for (int i = 1; i <= 50; i++) {
            arrContacts.add(new ContactModel(R.drawable.ic_launcher_foreground, "B" + i, "123456789" + i));
        }


        RecyclerContactAdapter adapter = new RecyclerContactAdapter(this,arrContacts);


    }
}