package com.techreturners.encapsulation.bankaccount.model;

import com.techreturners.encapsulation.reporter.model.Location;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LocationTest {
    @Test
    public void checkLondonIsRainy() {
        Location location = new Location("London");
        assertEquals("London", location.getName());
        assertEquals("🌦", location.getWeather());
    }

    @Test
    public void checkCaliforniaIsSunset() {
        Location location = new Location("California");
        assertEquals("California", location.getName());
        assertEquals("🌅", location.getWeather());
    }

    @Test
    public void checkCapeTownIsCloudy() {
        Location location = new Location("Cape Town");
        assertEquals("Cape Town", location.getName());
        assertEquals("🌤", location.getWeather());
    }

    @Test
    public void checkOtherLocationIsSunny() {
        Location location = new Location("York");
        assertEquals("York", location.getName());
        assertEquals("🔆", location.getWeather());
    }

    @Test
    public void checkEmptyLocationIsSunny() {
        Location location = new Location("");
        assertEquals("", location.getName());
        assertEquals("🔆", location.getWeather());
    }

    @Test
    public void checkBlankLocationIsSunny() {
        Location location = new Location(" ");
        assertEquals(" ", location.getName());
        assertEquals("🔆", location.getWeather());
    }
}
