package com.example.food_ordering.Domain;

public class Location {
    private int id;
    private String loc;

    // Default (no-argument) constructor
    public Location() {
        // Empty constructor
    }

    // Parameterized constructor
    public Location(int id, String loc) {
        this.id = id;
        this.loc = loc;
    }

    @Override
    public String toString() {
        return loc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }
}

