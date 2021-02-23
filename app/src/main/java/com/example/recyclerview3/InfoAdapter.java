package com.example.recyclerview3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class InfoAdapter extends RecyclerView.Adapter<InfoAdapter.ViewHolder> {

    List<Model> itemlist = new ArrayList<>();

    public InfoAdapter() {
        addDataToList();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.info_items, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
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
            imageView = itemView.findViewById(R.id.image);
            textView = itemView.findViewById(R.id.text);
        }
    }

    public List<Model> addDataToList() {

        itemlist.add(new Model(R.drawable.th, "i am info text"));
        itemlist.add(new Model(R.drawable.th, "i am info text"));
        itemlist.add(new Model(R.drawable.th, "i am info text"));
        itemlist.add(new Model(R.drawable.th, "i am info text"));
        itemlist.add(new Model(R.drawable.th, "i am info text"));
        itemlist.add(new Model(R.drawable.th, "i am info text"));
        itemlist.add(new Model(R.drawable.th, "i am info text"));
        itemlist.add(new Model(R.drawable.th, "i am info text"));
        itemlist.add(new Model(R.drawable.th, "i am info text"));
        itemlist.add(new Model(R.drawable.th, "i am info text"));

        return itemlist;
    }
}
