package com.techreturners.encapsulation.reporter.model;

import java.text.MessageFormat;

public class WeatherReporter {

    private final String location;
    private final double temperature;

    public WeatherReporter(String location, double temperature) {
        this.location = location;
        this.temperature = temperature;
    }

    public String buildMessage() {
        return MessageFormat.format("I am in {0} and it is {1}. {2}. The temperature in Fahrenheit is {3}.",
                location, checkWeatherAtLocation(), checkFeelingOfTemperature(), convertTemperatureToFahrenheit());
    }

    private double convertTemperatureToFahrenheit(){
        return  (9.0 / 5.0) * temperature + 32;
    }

    private String checkWeatherAtLocation() {
        if (location.equalsIgnoreCase("London")) {
            return "🌦";
        } else if (location.equalsIgnoreCase("California")) {
            return "🌅";
        } else if (location.equalsIgnoreCase("Cape Town")) {
            return "🌤";
        }
        return "🔆";
    }

    private String checkFeelingOfTemperature() {
        if (temperature > 30) {
            return "It's too hot 🥵!";
        } else if (temperature < 10) {
            return "It's too cold 🥶!";
        }
        return "Ahhh...it's just right 😊!";
    }
}