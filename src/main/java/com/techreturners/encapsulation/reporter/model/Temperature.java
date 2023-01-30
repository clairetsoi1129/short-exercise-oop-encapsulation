package com.techreturners.encapsulation.reporter.model;

public class Temperature {
    @SuppressWarnings("FieldMayBeFinal")
    private double temperature;
    @SuppressWarnings("FieldMayBeFinal")
    private String feeling;

    public Temperature(double temperature) {
        this.temperature = temperature;
        if (temperature > 30) {
            feeling = "It's too hot 🥵!";
        }
        else if (temperature < 10) {
            feeling = "It's too cold 🥶!";
        }
        else {
            feeling = "Ahhh...it's just right 😊!";
        }
    }

    public double convertToFahrenheit(){
        return  (9.0 / 5.0) * temperature + 32;
    }

    public String getFeeling(){
        return feeling;
    }
}
