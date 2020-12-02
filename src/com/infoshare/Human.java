package com.infoshare;

public class Human {
    private String name;
    protected int health;

    public Human(String name) {
        this.name = name;
        PopulationObserver.increasePopulation();
        System.out.println("Human " + this.name +
                " added. Current population: " + PopulationObserver.getPopulation());
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }
}
