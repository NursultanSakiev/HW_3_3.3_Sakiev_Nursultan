package com.example.hw_3_33_sakiev_nursultan;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdressAdapter extends RecyclerView.Adapter<AdressViewHolder> {

    private ArrayList<String> adress=new ArrayList<>();

    public AdressAdapter(ArrayList<String> adress) {
        this.adress = adress;
    }

    @NonNull
    @Override
    public AdressViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new AdressViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_adress,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull AdressViewHolder holder, int position) {
holder.bind(adress.get(position));
    }

    @Override
    public int getItemCount() {
        return adress.size();
    }
}

