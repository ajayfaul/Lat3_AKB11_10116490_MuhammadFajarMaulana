package com.morningstar.mfajarm_app.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.morningstar.mfajarm_app.R;
import com.morningstar.mfajarm_app.model.ActivitiesModel;

import java.util.ArrayList;

/*
 * Nama  : Muhammad Fajar Maulana
 * NIM   : 10116490
 * Kelas : AKB11
 * 1 Mei 2019
 *
 *
 * */
public class ActivitiesAdapter extends RecyclerView.Adapter<ActivitiesAdapter.ActivitiesViewHolder> {

    private ArrayList<ActivitiesModel> aActivitiesModel;

    public static class ActivitiesViewHolder extends RecyclerView.ViewHolder {
        public TextView judulAktifitas;
        public TextView waktuAktifitas;

        public ActivitiesViewHolder(@NonNull View itemView) {
            super(itemView);
            judulAktifitas = itemView.findViewById(R.id.judul_aktifitas);
            waktuAktifitas = itemView.findViewById(R.id.waktu_aktifitas);
        }
    }

    public ActivitiesAdapter(ArrayList<ActivitiesModel> activitiesdailyList) {
        aActivitiesModel = activitiesdailyList;
    }

    @NonNull
    @Override
    public ActivitiesViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_daily_list_view, viewGroup, false);
        ActivitiesViewHolder avh = new ActivitiesViewHolder(view);
        return avh;
    }

    @Override
    public void onBindViewHolder(@NonNull ActivitiesViewHolder activitiesViewHolder, int posisi) {
        ActivitiesModel currentItem = aActivitiesModel.get(posisi);
        activitiesViewHolder.judulAktifitas.setText(currentItem.getActivityName());
        activitiesViewHolder.waktuAktifitas.setText(currentItem.getActivityTime());
    }

    @Override
    public int getItemCount() {
        return aActivitiesModel.size();
    }

}
