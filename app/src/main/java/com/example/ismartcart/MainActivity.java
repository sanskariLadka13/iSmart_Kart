package com.example.ismartcart;


import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity
        extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView
                ParentRecyclerViewItem
                = findViewById(
                R.id.parent_recyclerview);

        // Initialise the Linear layout manager
        LinearLayoutManager
                layoutManager
                = new LinearLayoutManager(
                MainActivity.this);

        // Pass the arguments
        // to the parentItemAdapter.
        // These arguments are passed
        // using a method ParentItemList()
        ParentItemAdapter
                parentItemAdapter
                = new ParentItemAdapter(
                ParentItemList());

        // Set the layout manager
        // and adapter for items
        // of the parent recyclerview
        ParentRecyclerViewItem
                .setAdapter(parentItemAdapter);
        ParentRecyclerViewItem
                .setLayoutManager(layoutManager);
    }

    private List<ParentItem> ParentItemList()
    {
        List<ParentItem> itemList
                = new ArrayList<>();

        ParentItem item
                = new ParentItem(
                "Grocery",
                ChildItemList());
        itemList.add(item);
        ParentItem item1
                = new ParentItem(
                "Electronis",
                ChildItemList());
        itemList.add(item1);
        ParentItem item2
                = new ParentItem(
                "Mobiles",
                ChildItemList());
        itemList.add(item2);
        ParentItem item3
                = new ParentItem(
                "Clothes",
                ChildItemList());
        itemList.add(item3);
        ParentItem item4
                = new ParentItem(
                "Sport",
                ChildItemList());
        itemList.add(item3);

        return itemList;
    }

    // Method to pass the arguments
    // for the elements
    // of child RecyclerView
    private List<ChildItem> ChildItemList()
    {
        List<ChildItem> ChildItemList
                = new ArrayList<>();

        ChildItemList.add(new ChildItem("Item 1"));
        ChildItemList.add(new ChildItem("Item 2"));
        ChildItemList.add(new ChildItem("Item 3"));
        ChildItemList.add(new ChildItem("Item 4"));
        ChildItemList.add(new ChildItem("Item 5"));
        ChildItemList.add(new ChildItem("Item 6"));
        ChildItemList.add(new ChildItem("Item 7"));
        ChildItemList.add(new ChildItem("Item 8"));

        return ChildItemList;
    }
}
