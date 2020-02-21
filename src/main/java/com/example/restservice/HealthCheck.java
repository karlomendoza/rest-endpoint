package com.example.restservice;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class HealthCheck implements HealthIndicator {

    private Long dateMiliseconds = new Date().getTime();

    @Override
    public Health health() {

        int errorCode = check(); // perform some specific health check
        if (errorCode != 0) {
            throw new NullPointerException();

            //return Health.down()
            //        .withDetail("Error Code", errorCode).build();
        }
        return Health.up().build();
    }

    public int check() {
        // Our logic to check health

        return 0;
    }
}