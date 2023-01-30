package com.techreturners.encapsulation.reporter.model;


public class Location {
    @SuppressWarnings("FieldMayBeFinal")
    private String name;
    @SuppressWarnings("FieldMayBeFinal")
    private String weather;

    public Location(String name) {
        this.name = name;

        if ("London".equalsIgnoreCase(name)) {
            this.weather =  "🌦";
        } else if ("California".equalsIgnoreCase(name)) {
            this.weather =  "🌅";
        } else if ("Cape Town".equalsIgnoreCase(name)) {
            this.weather = "🌤";
        }else {
            this.weather = "🔆";
        }
    }

    public String getName() {
        return name;
    }

    public String getWeather() {
        return weather;
    }
}
