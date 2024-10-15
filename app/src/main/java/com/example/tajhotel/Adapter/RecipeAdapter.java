package com.example.tajhotel.Adapter;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tajhotel.R;

public class RecipeAdapter extends RecyclerView.ViewHolder.Adapter<RecipeAdapter.viewHolder> {

    public class viewHolder extends RecyclerView.ViewHolder{
        ImageView imageView;
        Button button;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
            button = itemView.findViewById(R.id.button);
        }
    }
}
