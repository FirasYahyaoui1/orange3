package com.example.orange.adaptater;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.orange.R;
import com.example.orange.models.User;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;

public class RecycleAdaptater extends RecyclerView.Adapter<UserViewHolder> {
    private List<User> userList;



    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false);
        return new UserViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {
        User user=userList.get(position);
        holder.email.setText(user.getEmail());
        holder.name.setText(user.getFirst_name());



    }
    @Override
    public int getItemCount() {
        return userList.size();
    }
}
