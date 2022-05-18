package com.example.hw_3_33_sakiev_nursultan;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AdressViewHolder extends RecyclerView.ViewHolder {
private TextView tvAdress;

    public AdressViewHolder(@NonNull View itemView) {
        super(itemView);
        tvAdress=itemView.findViewById(R.id.adress);

    }

    public void bind(String adress){
        tvAdress.setText(adress);
    }
}
