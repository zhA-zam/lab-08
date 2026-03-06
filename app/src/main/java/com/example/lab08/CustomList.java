package com.example.lab08;

import java.util.ArrayList;
import java.util.List;

public class CustomList {
    private List<City> cities;

    public CustomList() {
        this.cities = new ArrayList<>();
    }

    public void addCity(City city) {
        cities.add(city);
    }



    // Will be implemented later using TDD (leave blank for now)
    // public boolean hasCity(City city) { ... }

    /**
     * This returns true if the list contains a given city, false otherwise
     *
     * @param city      city object
     * @return          Return boolean value whether a given city is in the list
     */
    public boolean hasCity(City city) {
        return cities.contains(city);
    }


}
