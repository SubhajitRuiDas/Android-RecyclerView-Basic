package com.example.recycleviewdemo;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<ContactModel> arrContact = new ArrayList<>();
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        recyclerView = findViewById(R.id.recyclerContactView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        arrContact.add(new ContactModel(R.drawable.download,"Subhajit","9674487504"));
        arrContact.add(new ContactModel(R.drawable.download,"Yugagni","9674487310"));
        arrContact.add(new ContactModel(R.drawable.download,"Sima","9674487504"));
        arrContact.add(new ContactModel(R.drawable.download,"Chandan","9674487310"));
        arrContact.add(new ContactModel(R.drawable.download,"Rahul","9674487504"));
        arrContact.add(new ContactModel(R.drawable.download,"Priyanka","9674487310"));
        arrContact.add(new ContactModel(R.drawable.download,"Hiren","9674487504"));
        arrContact.add(new ContactModel(R.drawable.download,"Sorrow","9674487310"));
        arrContact.add(new ContactModel(R.drawable.download,"Bheem","9674487504"));
        arrContact.add(new ContactModel(R.drawable.download,"kalia","9674487310"));
        arrContact.add(new ContactModel(R.drawable.download,"Subha","9674487504"));
        arrContact.add(new ContactModel(R.drawable.download,"priya","9674487310"));
        arrContact.add(new ContactModel(R.drawable.download,"jit","9674487504"));
        arrContact.add(new ContactModel(R.drawable.download,"kousik","9674487310"));
        arrContact.add(new ContactModel(R.drawable.download,"Sunil","9674487504"));
        arrContact.add(new ContactModel(R.drawable.download,"Rupa","9674487310"));
        arrContact.add(new ContactModel(R.drawable.download,"Faranh","9674487504"));
        arrContact.add(new ContactModel(R.drawable.download,"Paulo","9674487310"));
        arrContact.add(new ContactModel(R.drawable.download,"Kohli","9674487504"));
        arrContact.add(new ContactModel(R.drawable.download,"Virat","9674487310"));

        RecyclerViewContactAdapter adapter = new RecyclerViewContactAdapter(MainActivity.this,arrContact);
        recyclerView.setAdapter(adapter);
    }
}