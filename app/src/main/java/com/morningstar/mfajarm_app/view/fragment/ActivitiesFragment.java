package com.morningstar.mfajarm_app.view.fragment;

import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.morningstar.mfajarm_app.R;
import com.morningstar.mfajarm_app.adapter.ActivitiesAdapter;
import com.morningstar.mfajarm_app.adapter.FriendListAdapter;
import com.morningstar.mfajarm_app.model.ActivitiesModel;
import com.morningstar.mfajarm_app.model.FriendListModel;

import java.util.ArrayList;

public class ActivitiesFragment extends Fragment {

    private RecyclerView activitiesRecycleView, activitiesRecycleView2;
    private RecyclerView.Adapter activitiesAdapter, activitiesAdapter2;
    private RecyclerView.LayoutManager activitiesLayoutManager, activitiesLayoutManager2;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        final View activitiesFragmentView = inflater.inflate(R.layout.activities_fragment, container, false);

        //List Data Aktifitas Keseharian

        ArrayList<ActivitiesModel> activitiesModels = new ArrayList<>();
        activitiesModels.add(new ActivitiesModel("Bangun Tidur dan Sholat Subuh", "at 04.30 - 05.00"));
        activitiesModels.add(new ActivitiesModel("Mempersiapkan diri atau Beres-beres", "at 05.00 - 06.00"));
        activitiesModels.add(new ActivitiesModel("Sarapan Pagi", "at 06.00 - 07.00"));
        activitiesModels.add(new ActivitiesModel("Pergi Ke Kampus, Kuliah atau Aktivitas lainnya", "at 07.00 - 11.40"));
        activitiesModels.add(new ActivitiesModel("Shalat Dzuhur", "at 11.40 - 12.15"));
        activitiesModels.add(new ActivitiesModel("Melanjutkan aktivitas, istirahat atau makan siang", "at 12.15 - 15.00"));
        activitiesModels.add(new ActivitiesModel("Shalat Ashar", "at 15.00 - 15.20"));
        activitiesModels.add(new ActivitiesModel("Melanjutkan aktivitas atau istirahat", "at 15.20 - 17.40"));
        activitiesModels.add(new ActivitiesModel("Shalat Maghrib dan Mengaji", "at 17.40 - 18.20"));
        activitiesModels.add(new ActivitiesModel("Makan Malam", "at 18.20 - 19.00"));
        activitiesModels.add(new ActivitiesModel("Shalat Isya", "at 19.00 - 19.20"));
        activitiesModels.add(new ActivitiesModel("Belajar, bermain, nonton atau mengerjakan tugas", "at 19.20 - 10.00"));
        activitiesModels.add(new ActivitiesModel("Tidur atau Istirahat", "at 10.00"));

        activitiesRecycleView = activitiesFragmentView.findViewById(R.id.daily_list_view);
        activitiesRecycleView.setHasFixedSize(true);
        activitiesLayoutManager = new LinearLayoutManager(getActivity());
        activitiesAdapter = new ActivitiesAdapter(activitiesModels);
        activitiesRecycleView.setLayoutManager(activitiesLayoutManager);
        activitiesRecycleView.setAdapter(activitiesAdapter);

        //List Friends

        ArrayList<FriendListModel> friendListModels = new ArrayList<>();
        friendListModels.add(new FriendListModel(R.drawable.esa, "Esa M"));
        friendListModels.add(new FriendListModel(R.drawable.donny, "Donny H"));
        friendListModels.add(new FriendListModel(R.drawable.adhit, "Adhitya KJ"));
        friendListModels.add(new FriendListModel(R.drawable.imam, "Imam DC"));
        friendListModels.add(new FriendListModel(R.drawable.rifqi, "Rifqi"));
        friendListModels.add(new FriendListModel(R.drawable.star, "Star"));
        friendListModels.add(new FriendListModel(R.drawable.jari, "Fajar I"));
        friendListModels.add(new FriendListModel(R.drawable.ilham, "Ilham"));
        friendListModels.add(new FriendListModel(R.drawable.gerdi, "Gerdi"));
        friendListModels.add(new FriendListModel(R.drawable.mamun, "Mamun"));
        friendListModels.add(new FriendListModel(R.drawable.eko, "Eko D"));

        activitiesRecycleView2 = activitiesFragmentView.findViewById(R.id.friend_list_view);
        activitiesRecycleView2.setHasFixedSize(true);
        activitiesLayoutManager2 = new LinearLayoutManager(getActivity());
        activitiesAdapter2 = new FriendListAdapter(friendListModels);
        activitiesRecycleView2.setLayoutManager(activitiesLayoutManager2);
        activitiesRecycleView2.setAdapter(activitiesAdapter2);
        activitiesRecycleView2.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayout.HORIZONTAL,false));
        activitiesRecycleView2.setAdapter(activitiesAdapter2);

        return activitiesFragmentView;


    }


}
