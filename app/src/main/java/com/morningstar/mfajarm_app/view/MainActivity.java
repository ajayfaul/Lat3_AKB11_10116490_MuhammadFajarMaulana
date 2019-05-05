package com.morningstar.mfajarm_app.view;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

import com.morningstar.mfajarm_app.R;
import com.morningstar.mfajarm_app.view.fragment.ActivitiesFragment;
import com.morningstar.mfajarm_app.view.fragment.GalleryFragment;
import com.morningstar.mfajarm_app.view.fragment.HomeFragment;
import com.morningstar.mfajarm_app.view.fragment.MusicFragment;
import com.morningstar.mfajarm_app.view.fragment.ProfileFragment;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView navView = findViewById(R.id.navigation_view);
        navView.setOnNavigationItemSelectedListener(this);

        loadFragment(new HomeFragment());
    }

    void loadFragment(Fragment fragment){
        FragmentTransaction fragmen = getSupportFragmentManager().beginTransaction();
        fragmen.replace(R.id.frame_container,fragment);
        fragmen.commit();
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        switch (menuItem.getItemId()){
            case R.id.navigation_home:
                loadFragment(new HomeFragment());
                return true;
            case R.id.navigation_activities:
                loadFragment(new ActivitiesFragment());
                return true;
            case R.id.navigation_galery:
                loadFragment(new GalleryFragment());
                return true;
            case R.id.navigation_music:
                loadFragment(new MusicFragment());
                return true;
            case R.id.navigation_profile:
                loadFragment(new ProfileFragment());
                return true;
        }
        return false;
    }
}
