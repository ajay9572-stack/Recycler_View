package com.example.tajhotel.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.SearchView;
import android.widget.Toast;


import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tajhotel.R;
import com.example.tajhotel.RecipeModel;

import java.util.ArrayList;

public class RecipeAdapter extends RecyclerView.Adapter<RecipeAdapter.viewHolder> {
   ArrayList<RecipeModel> list;
   Context context;


    public RecipeAdapter(ArrayList<RecipeModel> list, Context context) {
        this.list = list;
        this.context = context;

    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        View view = LayoutInflater.from(context).inflate(R.layout.sample_recyclerview,parent, false);
        return new viewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position)
    {
        RecipeModel model = list.get(position);
        holder.imageView.setImageResource(model.getPic());
        holder.button.setText(model.getButtonText());
    }

    @Override
    public int getItemCount()
    {
        return list.size();
    }

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
