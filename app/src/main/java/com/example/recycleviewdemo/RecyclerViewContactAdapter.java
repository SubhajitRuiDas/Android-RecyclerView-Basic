package com.example.recycleviewdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerViewContactAdapter extends RecyclerView.Adapter<RecyclerViewContactAdapter.ViewHolder> {
    Context context;
    ArrayList<ContactModel> contactModelArrayList;
    RecyclerViewContactAdapter(Context context, ArrayList<ContactModel> contactModelArrayList){
        this.context = context;
        this.contactModelArrayList = contactModelArrayList;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.contact_row, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.contactName.setText(contactModelArrayList.get(position).name);
        holder.contactNumber.setText(contactModelArrayList.get(position).contactNo);
        holder.imgContact.setImageResource(contactModelArrayList.get(position).img);
    }

    @Override
    public int getItemCount() {
        return contactModelArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView contactName;
        TextView contactNumber;
        ImageView imgContact;
        public ViewHolder(View view){
            super(view);
            contactName = view.findViewById(R.id.textName);
            contactNumber = view.findViewById(R.id.textNumber);
            imgContact = view.findViewById(R.id.contactImage);
        }
    }
}
