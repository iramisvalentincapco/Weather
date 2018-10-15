package com.example.ivln.weather;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.ivln.weather.ui.location.Location;
import com.example.ivln.weather.ui.main.ListViewFragment;
import com.example.ivln.weather.ui.main.ViewModel.MainViewModel;
import com.example.ivln.weather.ui.main.MapFragment;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.list_fragment, ListViewFragment.newInstance())
                    .replace(R.id.map_fragment, MapFragment.newInstance())
                    .commitNow();
        }
        else {
            MainViewModel model = ViewModelProviders.of(this).get(MainViewModel.class);
            model.getLocations().observe(this, new Observer<List<Location>>() {
                @Override
                public void onChanged(@Nullable List<Location> locations) {

                }
            });
        }
    }

}
