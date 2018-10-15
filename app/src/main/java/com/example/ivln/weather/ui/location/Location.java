package com.example.ivln.weather.ui.location;

public class Location {
    private String name;
    private double longitude;
    private double latitude;

    public Location(String title, double lon, double lat) {
        name = title;
        longitude = lon;
        latitude = lat;
    }

    public Location(Location location) {
        name = location.getName();
        longitude = location.getLongitude();
        latitude = location.getLatitude();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

}
