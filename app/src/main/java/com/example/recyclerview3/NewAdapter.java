package com.example.recyclerview3;

import android.content.Context;
import android.graphics.ColorSpace;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

public class NewAdapter extends RecyclerView.Adapter<NewAdapter.ViewHolder> {

    List<Model> itemlist = new ArrayList<>();



    public NewAdapter() {

        addDataToList();

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.home_items, parent, false);
        ViewHolder viewHolder=new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.imageView.setImageResource(itemlist.get(position).getImage());
        holder.textView.setText(itemlist.get(position).getTxt());

            }

    @Override
    public int getItemCount() {
        return itemlist.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.image);
            textView=itemView.findViewById(R.id.text);



        }
    }

    public List<Model> addDataToList() {

        itemlist.add(new Model(R.drawable.th, "i am first image"));
        itemlist.add(new Model(R.drawable.th, "i am second image"));
        itemlist.add(new Model(R.drawable.th, "i am first image"));
        itemlist.add(new Model(R.drawable.th, "i am first image"));
        itemlist.add(new Model(R.drawable.th, "i am first image"));
        itemlist.add(new Model(R.drawable.th, "i am first image"));
        itemlist.add(new Model(R.drawable.th, "i am first image"));
        itemlist.add(new Model(R.drawable.th, "i am first image"));
        itemlist.add(new Model(R.drawable.th, "i am first image"));
        itemlist.add(new Model(R.drawable.th, "i am first image"));

        return itemlist;
    }
}
