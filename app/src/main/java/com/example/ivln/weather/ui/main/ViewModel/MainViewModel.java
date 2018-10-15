package com.example.ivln.weather.ui.main.ViewModel;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.support.annotation.NonNull;

import com.example.ivln.weather.ui.location.Location;

import java.util.List;

public class MainViewModel extends AndroidViewModel {
    private MutableLiveData<List<Location>> locations;
    private final MutableLiveData<Location> selectedLocation = new MutableLiveData<>();

    public MainViewModel(@NonNull Application application) {
        super(application);
    }

    public LiveData<List<Location>> getLocations() {
        if (locations == null) {
            locations = new MutableLiveData<List<Location>>();
            loadLocations();
        }
        return locations;
    }

    private void loadLocations() {
        // Do an asynchronous operation to fetch locations.
    }

    public void selectLocation(Location location) {
        selectedLocation.setValue(location);
    }

    public LiveData<Location> getSelectedLocation() {
        return selectedLocation;
    }
}
