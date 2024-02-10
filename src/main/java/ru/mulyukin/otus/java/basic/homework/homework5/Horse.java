package ru.mulyukin.otus.java.basic.homework.homework5;

public class Horse extends Animal {
    public Horse(String name, int runningSpeedMS, int enduranceUE, int swimSpeedMS) {
        super(name, runningSpeedMS, enduranceUE, swimSpeedMS);
    }

    @Override
    public int swim(int distance) {
        this.staminaCosts = 4;
        int metrInSecond = distance / this.swimSpeedMS;
        System.out.println(name + "Время " + metrInSecond + " секунд " + " пробежал " + distance + " метров");
        int power = (distance / enduranceUE);
        if (power < enduranceUE) {
            System.out.println(name + " проплыл " + distance);
        } else {
            System.out.println(name + " устал");
            return metrInSecond - 1;
        }
        return power;
    }

}
