package com.pmdm.planetas;

public class Planet {
    private String name;
    private double radius;
    private double distanceToSun;

    public Planet(String name, double radius, double distanceToSun) {
        this.name = name;
        this.radius = radius;
        this.distanceToSun = distanceToSun;
    }

    public String getName() {
        return name;
    }

    public double getRadius() {
        return radius;
    }

    public double getDistanceToSun() {
        return distanceToSun;
    }

    @Override
    public String toString() {
        return "Planet{" +
                "name='" + name + '\'' +
                ", radius=" + radius +
                ", distanceToSun=" + distanceToSun +
                '}';
    }
}