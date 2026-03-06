package com.example.lab08;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

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

    /**
     * This returns the number of cities in the list
     *
     * @return          Number of cities in the list
     */
    public int countCities() {
        // Return how many cities are in the list

        return cities.size();
    }

    /**
     * This deletes an existing city from the list
     *
     * @param city      city object
     */
    public void deleteCity(City city) {
        // Check if a city is present in the list. If it does then remove
        // it from the list, if not then **throw an exception**
        if (cities.contains(city)) {
            cities.remove(city);
        } else {
            throw new NoSuchElementException();
        }
    }
}
