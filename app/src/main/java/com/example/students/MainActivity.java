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

    private List<String> selectedItems = new ArrayList<>();

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
                String selectedItem = list.get(position);

                // Check if the item is already selected
                if (selectedItems.contains(selectedItem)) {
                    // If selected, remove it from the list
                    selectedItems.remove(selectedItem);
                } else {
                    // If not selected, check the selection limits
                    if (selectedItems.size() >= 5 && selectedItems.size() < 10) {
                        selectedItems.add(selectedItem);
                        // Handle the selected item, you can start a new activity here
                        handleSelectedItem(selectedItem);
                    }
                }

                // Perform any other actions or UI updates based on the selected items
                updateUI();
            }
        });
    }

    private void handleSelectedItem(String selectedItem) {
        // Start a new activity based on the selected item
        Intent intent;
        switch (selectedItem) {
            case " CCS 2345 Data analysis":
                intent = new Intent(MainActivity.this, DataanalysisActivity.class);
                break;
            case " CCS 2346 Knowledge representation":
                intent = new Intent(MainActivity.this, KnowledgeActivity.class);
                break;
            // Add more cases for other items as needed
            default:
                intent = null;
        }

        if (intent != null) {
            startActivity(intent);
        }
    }

    private void updateUI() {
        // Update your UI based on the selected items, if needed
        // For example, you can show a message or perform some action
        // based on the selected items.
    }
}
