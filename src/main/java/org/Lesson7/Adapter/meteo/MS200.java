package org.Lesson7.Adapter.meteo;

import java.time.*;

// Родной датчик системы
public class MS200 implements MeteoSensor {
    int id;

    public MS200(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public Double getTemperature() {
        return (Double) 20;
    }

    public Float getHumidity() {
        return (float) 60;
    }

    public Float getPressure() {
        return (float) 752.4;
    }

    public LocalDateTime getDateTime() {
        return LocalDateTime.now();
    }
}