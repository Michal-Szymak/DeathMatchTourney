package com.infoshare;

public class Barbarian extends Human implements ConstructedPerson{

    public Barbarian(String name, int health) {
        super(name);
        this.health = health;
    }

    @Override
    public void attack(CanBeDamaged target) {
//        if(target.isAlive()) {
            target.acceptDamage(NumberGenerator.generateDamage());
//        }
    }

    @Override
    public void acceptDamage(int damage) {
        this.health -= damage;
    }

    @Override
    public boolean isAlive() {
        return this.health > 0;
    }

    @Override
    public String getTheName() {
        return getName();
    }

}
