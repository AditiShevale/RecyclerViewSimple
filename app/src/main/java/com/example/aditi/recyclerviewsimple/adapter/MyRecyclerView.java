package com.example.aditi.recyclerviewsimple.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.aditi.recyclerviewsimple.R;
import com.example.aditi.recyclerviewsimple.pojo.Details;

import java.util.List;

public class MyRecyclerView extends RecyclerView.Adapter<MyRecyclerView.MyViewHolder> {

    //POJO variable
    List<Details> mDetails;


    public MyRecyclerView(List<Details> details) {
        mDetails = details;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // refer custom layout

        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.custom_list, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        Details details=mDetails.get(position);
        holder.txt_name.setText(details.getName());
        holder.txt_surname.setText(details.getSurname());

    }

    @Override
    public int getItemCount() {
        // always returns size
        return mDetails.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder
    {

        // refer custom layout views

        TextView txt_name,txt_surname;

        public MyViewHolder(View itemView) {
            super(itemView);

            txt_name=itemView.findViewById(R.id.name);
            txt_surname=itemView.findViewById(R.id.surname);


        }
    }



}
