package com.yurikb.simpletodoyb;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    ArrayList<string> items;
    ArrayAdapter<string> itemsAdapter;
    ListView lvItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        items = new ArrayList<string>();
        itemsAdapter = new ArrayAdapter<string>(this, android.R.layout.simple_expandable_list_item_1, items);
        lvItems = findViewById(R.id.lvitems);
        lvItems.setAdapter(itemsAdapter);

        //mock data
        items.add("First item");
        items.add("Second item");


    }
}
