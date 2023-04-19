package org.Lesson7.Adapter.meteo;

import java.time.*;

// Дополнительный датчик, который надо включить в систему
class ST500Info {
    public SensorTemperature getData() {
        return new SensorTemperature() {
            public int identifier() {
                return 100;
            }

            public double temperature() {
                return 22.0;
            }

            public int year() {
                return LocalDateTime.now().getYear();
            }

            public int day() {
                return LocalDateTime.now().getDayOfMonth();
            }

            public int second() {
                LocalDateTime now = LocalDateTime.now();
                return now.getSecond();
            }
        };
    }
}