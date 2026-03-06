package com.example.lab08;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.NoSuchElementException;

public class CustomListTest {
    @Test
    public void testHasCity() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);
        // This will fail initially because hasCity() doesn't exist
        assertTrue(list.hasCity(calgary));
    }

    @Test
    void testCountCities() {
        CustomList cityList = new CustomList();
        // Test to see whether countCities returns how many cities are in the list
        City city1 = new City("Calgary", "Alberta");
        City city2 = new City("Regina", "Saskatchewan");
        City city3 = new City("Charlottetown", "Prince Edward Island");

        // Add a known amount of cities to a list then test countCities to be sure number is the same
        cityList.addCity(city1);
        cityList.addCity(city2);
        cityList.addCity(city3);

        assertEquals(3, cityList.countCities()); // expected = 4 because mockCity is always in cityList
    }




}
