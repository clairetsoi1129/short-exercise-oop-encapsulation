package com.techreturners.encapsulation.bankaccount.model;


import com.techreturners.encapsulation.reporter.model.WeatherReporter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class WeatherReporterTest {
    @Test
    public void checkBuildMessageNormalLocationIntegerTemperature() {
        WeatherReporter reporter = new WeatherReporter("London", 3);
        assertEquals("I am in London and it is \uD83C\uDF26. It's too cold \uD83E\uDD76!. The temperature in Fahrenheit is 37.4.", reporter.buildMessage());
        reporter = new WeatherReporter("California", 32);
        assertEquals("I am in California and it is \uD83C\uDF05. It's too hot \uD83E\uDD75!. The temperature in Fahrenheit is 89.6.", reporter.buildMessage());
        reporter = new WeatherReporter("Cape Town", 28);
        assertEquals("I am in Cape Town and it is \uD83C\uDF24. Ahhh...it's just right \uD83D\uDE0A!. The temperature in Fahrenheit is 82.4.", reporter.buildMessage());
    }

    @Test
    public void checkBuildMessageOtherLocation() {
        WeatherReporter reporter = new WeatherReporter("York", -3);
        assertEquals("I am in York and it is \uD83D\uDD06. It's too cold \uD83E\uDD76!. The temperature in Fahrenheit is 26.6.", reporter.buildMessage());
    }

    @Test
    public void checkBuildMessageVeryLowTemperature() {
        WeatherReporter reporter = new WeatherReporter("Calgary", -50.11);
        assertEquals("I am in Calgary and it is \uD83D\uDD06. It's too cold \uD83E\uDD76!. The temperature in Fahrenheit is -58.198.", reporter.buildMessage());
    }

    @Test
    public void checkBuildMessageVeryHighTemperature() {
        WeatherReporter reporter = new WeatherReporter("Oven", 250.99);
        assertEquals("I am in Oven and it is \uD83D\uDD06. It's too hot \uD83E\uDD75!. The temperature in Fahrenheit is 483.782.", reporter.buildMessage());
    }
}
