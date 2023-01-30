package com.techreturners.encapsulation.bankaccount.model;


import com.techreturners.encapsulation.reporter.model.Location;
import com.techreturners.encapsulation.reporter.model.Temperature;
import com.techreturners.encapsulation.reporter.model.WeatherReporter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class WeatherReporterTest {
    @Test
    public void checkReportLondonColdTemperature() {
        WeatherReporter reporter = new WeatherReporter(new Location("London"), new Temperature(3));
        assertEquals("I am in London and it is \uD83C\uDF26. It's too cold \uD83E\uDD76!. The temperature in Fahrenheit is 37.4.", reporter.report());
    }

    @Test
    public void checkReportCaliforniaHotTemperature() {
        WeatherReporter reporter = new WeatherReporter(new Location("California"), new Temperature(32));
        assertEquals("I am in California and it is \uD83C\uDF05. It's too hot \uD83E\uDD75!. The temperature in Fahrenheit is 89.6.", reporter.report());
        reporter = new WeatherReporter(new Location("Cape Town"), new Temperature(28));
        assertEquals("I am in Cape Town and it is \uD83C\uDF24. Ahhh...it's just right \uD83D\uDE0A!. The temperature in Fahrenheit is 82.4.", reporter.report());
    }

    @Test
    public void checkReportCapeTownWarmTemperature() {
        WeatherReporter reporter = new WeatherReporter(new Location("Cape Town"), new Temperature(28));
        assertEquals("I am in Cape Town and it is \uD83C\uDF24. Ahhh...it's just right \uD83D\uDE0A!. The temperature in Fahrenheit is 82.4.", reporter.report());
    }

    @Test
    public void checkReportOtherLocation() {
        WeatherReporter reporter = new WeatherReporter(new Location("York"), new Temperature(-3));
        assertEquals("I am in York and it is \uD83D\uDD06. It's too cold \uD83E\uDD76!. The temperature in Fahrenheit is 26.6.", reporter.report());
    }

    @Test
    public void checkReportVeryLowTemperature() {
        WeatherReporter reporter = new WeatherReporter(new Location("Calgary"), new Temperature(-50.11));
        assertEquals("I am in Calgary and it is \uD83D\uDD06. It's too cold \uD83E\uDD76!. The temperature in Fahrenheit is -58.198.", reporter.report());
    }

    @Test
    public void checkReportVeryHighTemperature() {
        WeatherReporter reporter = new WeatherReporter(new Location("Oven"), new Temperature(250.99));
        assertEquals("I am in Oven and it is \uD83D\uDD06. It's too hot \uD83E\uDD75!. The temperature in Fahrenheit is 483.782.", reporter.report());
    }
}
