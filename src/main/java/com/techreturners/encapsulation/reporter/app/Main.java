package com.techreturners.encapsulation.reporter.app;

import com.techreturners.encapsulation.reporter.model.Location;
import com.techreturners.encapsulation.reporter.model.Temperature;
import com.techreturners.encapsulation.reporter.model.WeatherReporter;

public class Main {
    public static void main(String[] args) {
        WeatherReporter reporter = new WeatherReporter(new Location("London"), new Temperature(3));
        System.out.println(reporter.report());
        reporter = new WeatherReporter(new Location("California"), new Temperature(32));
        System.out.println(reporter.report());
        reporter = new WeatherReporter(new Location("Cape Town"), new Temperature(28));
        System.out.println(reporter.report());
        reporter = new WeatherReporter(new Location("York"), new Temperature(-3));
        System.out.println(reporter.report());
        reporter = new WeatherReporter(new Location("Calgary"), new Temperature(-50.11));
        System.out.println(reporter.report());
        reporter = new WeatherReporter(new Location("Oven"), new Temperature(250.99));
        System.out.println(reporter.report());
    }
}
