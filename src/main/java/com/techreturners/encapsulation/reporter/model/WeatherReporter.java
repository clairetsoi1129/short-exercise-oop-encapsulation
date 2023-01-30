package com.techreturners.encapsulation.reporter.model;

import java.text.MessageFormat;

public class WeatherReporter {

    private final Location location;
    private final Temperature temperature;

    public WeatherReporter(Location location, Temperature temperature) {
        this.location = location;
        this.temperature = temperature;
    }

    public String report() {
        return MessageFormat.format("I am in {0} and it is {1}. {2}. The temperature in Fahrenheit is {3}.",
                location.getName(), location.getWeather(), temperature.getFeeling(), temperature.convertToFahrenheit());
    }
}