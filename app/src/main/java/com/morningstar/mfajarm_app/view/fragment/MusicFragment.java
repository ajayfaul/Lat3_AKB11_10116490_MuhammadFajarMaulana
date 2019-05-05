package com.morningstar.mfajarm_app.view.fragment;

import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.morningstar.mfajarm_app.R;
import com.morningstar.mfajarm_app.model.MusicModel;


/*
 * Nama  : Muhammad Fajar Maulana
 * NIM   : 10116490
 * Kelas : AKB11
 * 1 Mei 2019
 *
 *
 * */
public class MusicFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.music_fragment, container, false);
    }


}
