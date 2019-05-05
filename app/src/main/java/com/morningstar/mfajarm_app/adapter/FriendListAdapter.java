package com.morningstar.mfajarm_app.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.morningstar.mfajarm_app.R;
import com.morningstar.mfajarm_app.model.FriendListModel;

import java.util.ArrayList;

public class FriendListAdapter extends RecyclerView.Adapter<FriendListAdapter.FriendViewHolder> {

    private ArrayList<FriendListModel> listFriendItem;
    public static class FriendViewHolder extends RecyclerView.ViewHolder {
        public ImageView imageView;
        public TextView namaTeman;


        public FriendViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.fototeman);
            namaTeman = itemView.findViewById(R.id.namateman);
        }
    }

    public FriendListAdapter(ArrayList<FriendListModel> friendList){
        listFriendItem = friendList;
    }

    @NonNull
    @Override
    public FriendViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_friend_list_view,viewGroup,false);
        FriendViewHolder fvh = new FriendViewHolder(view);
        return fvh;
    }

    @Override
    public void onBindViewHolder(@NonNull FriendViewHolder friendViewHolder, int position) {
        FriendListModel currentItem = listFriendItem.get(position);
        friendViewHolder.imageView.setImageResource(currentItem.getImageSource());
        friendViewHolder.namaTeman.setText(currentItem.getFriendName());
    }

    @Override
    public int getItemCount() {
        return listFriendItem.size();
    }
}
