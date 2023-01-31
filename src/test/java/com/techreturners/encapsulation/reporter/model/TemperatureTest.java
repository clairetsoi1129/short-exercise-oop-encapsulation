package com.techreturners.encapsulation.reporter.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TemperatureTest {
    @Test
    public void checkHotTemperature() {
        Temperature temperature = new Temperature(32.2);
        assertEquals("It's too hot 🥵!", temperature.getFeeling());
    }

    @Test
    public void checkWarmTemperature() {
        Temperature temperature = new Temperature(22.2);
        assertEquals("Ahhh...it's just right 😊!", temperature.getFeeling());
    }

    @Test
    public void checkColdTemperature() {
        Temperature temperature = new Temperature(2.2);
        assertEquals("It's too cold 🥶!", temperature.getFeeling());
    }

    @Test
    public void checkVeryHotTemperature() {
        Temperature temperature = new Temperature(250.9);
        assertEquals("It's too hot 🥵!", temperature.getFeeling());
    }

    @Test
    public void checkVeryColdTemperature() {
        Temperature temperature = new Temperature(-100);
        assertEquals("It's too cold 🥶!", temperature.getFeeling());
    }
}
