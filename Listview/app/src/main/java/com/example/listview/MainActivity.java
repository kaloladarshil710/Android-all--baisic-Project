package com.example.listview;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    // for listview
ListView listView;
    // for spinner
Spinner spinner;

AutoCompleteTextView actxtView;


    // for listview
ArrayList<String> arrNames = new ArrayList<>();
    // for spinner
ArrayList<String> arrIds = new ArrayList<>();
ArrayList<String> arrLanguage = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
// for spinner
        spinner =  findViewById(R.id.spinner);
// for listview
        listView = findViewById(R.id.listView);
// for autocomplete text view
        actxtView = findViewById(R.id.actxtView);

        arrNames.add("Ram");
        arrNames.add("Shyam");
        arrNames.add("Mohan");
        arrNames.add("Sohan");
        arrNames.add("Ravi");
        arrNames.add("Amit");
        arrNames.add("Rahul");
        arrNames.add("Anil");
        arrNames.add("Vijay");
        arrNames.add("Rajesh");
        arrNames.add("Kiran");
        arrNames.add("Vikas");
        arrNames.add("Pranav");
        arrNames.add("Suresh");
        arrNames.add("Ajay");
        arrNames.add("Deepak");
        arrNames.add("Sanjay");
        arrNames.add("Naveen");
        arrNames.add("Kunal");
        arrNames.add("Yash");

// for spinner
        arrIds.add("Aadhar Card");
        arrIds.add("PAN Card");
        arrIds.add("Voter ID Card");
        arrIds.add("Driving lincense Card");
        arrIds.add("Ration Card");
        arrIds.add("Xth Score Card");
        arrIds.add("XIIth Score Card");

        //for spinner
        ArrayAdapter<String> spinnerAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item,arrIds);
        spinner.setAdapter(spinnerAdapter);



// for listview
        ArrayAdapter<String> adapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1,arrNames);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i>0) {
                    Toast.makeText(MainActivity.this, "Clicked", Toast.LENGTH_SHORT).show();
                }
            }
        });





        // Auto CompleteTextView

        arrLanguage.add("C");
        arrLanguage.add("C++");
        arrLanguage.add("JAVA");
        arrLanguage.add("PHP");
        arrLanguage.add("Objective c");
        arrLanguage.add("C#");
        arrLanguage.add("PYTHON");
        arrLanguage.add("SWIFT");


        ArrayAdapter<String> actvAdapter =new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,arrLanguage);
        actxtView.setAdapter(actvAdapter);
        actxtView.setThreshold(1);



    }
}