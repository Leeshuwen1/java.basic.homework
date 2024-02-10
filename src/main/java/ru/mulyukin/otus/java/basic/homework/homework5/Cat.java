package ru.mulyukin.otus.java.basic.homework.homework5;

public class Cat extends Animal {
    public Cat(String name, int runningSpeedMS, int enduranceUE) {
        super(name, runningSpeedMS, enduranceUE);
    }

    @Override
    public int swim(int distance) {
        System.out.println(name + " плавать не умеет");
        return distance;
    }


}
