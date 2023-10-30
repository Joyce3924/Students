package com.example.students;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView = findViewById(R.id.Listview);
        List<String> list = new ArrayList<>();
        list.add(" CCS 2345 Data analysis");
        list.add(" CCS 2346 Knowledge representation");
        list.add("CCS 2347  Simulation and modeling");
        list.add("CCS 2348 Mobile application");
        list.add(" CCS 2349 Computer project");
        list.add("CCS 2350 Communication skills");
        list.add("CCS 2351 Multimedia systems");
        list.add("CCS 2352 sYSTEM Design");
        list.add("CCS 2353 Programming systems");
        list.add("CCS 2354 Analogy systems");
        list.add("CCS 2355 Architecture");
        list.add("CCS 2356 Manegarial systems");


        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1, list);

        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    // clicked Data analysis
                    startActivity(new Intent(MainActivity.this,DataanalysisActivity.class
                    ));
                } else if (position == 1) {
                    // clicked Knowledge representation
                    startActivity(new Intent(MainActivity.this,KnowledgeActivity.class
                    ));
                } else {
                    // Handle other items

                }

            }
        });
    }
}