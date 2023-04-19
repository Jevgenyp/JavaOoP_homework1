package org.Lesson7.Adapter.meteo;

import java.time.LocalDateTime;

public class MeteoAdapter implements MeteoSensor {
    private SensorTemperature st500;
    public MeteoAdapter(SensorTemperature st500) {
        this.st500 = st500;
    }

    @Override
    public int getId() {
        return st500.identifier();
    }

    @Override
    public Double getTemperature() {
        return st500.temperature().doubleValue();
    }

    @Override
    public Float getHumidity() {
        return null;
    }

    @Override
    public Float getPressure() {
        return null;
    }

    @Override
    public LocalDateTime getDateTime() {
        LocalDateTime adaptDate = LocalDateTime.of(st500.year(), 1,st500.day(),1,1 ,st500.second());
        return adaptDate;

    }
}
