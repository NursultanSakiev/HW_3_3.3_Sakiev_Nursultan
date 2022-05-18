package com.example.hw_3_33_sakiev_nursultan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
   private RecyclerView recyclerView;
   private AdressAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       recyclerView=findViewById(R.id.adress);
        ArrayList<String> adress=new ArrayList<>();
        adress.add("Ahunbaeva");
        adress.add("Belinka");
        adress.add("Kiev");
        adapter=new AdressAdapter(adress);
        recyclerView.setAdapter(adapter);
    }
}