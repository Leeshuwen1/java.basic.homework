package ru.mulyukin.otus.java.basic.homework.homework5;


public class Animal {
    protected String name;
    protected int runningSpeedMS;
    protected int enduranceUE;
    protected int swimSpeedMS;
    protected int staminaCosts;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRunningSpeedMS() {
        return runningSpeedMS;
    }

    public void setRunningSpeedMS(int runningSpeedMS) {
        this.runningSpeedMS = runningSpeedMS;
    }

    public int getEnduranceUE() {
        return enduranceUE;
    }

    public void setEnduranceUE(int enduranceUE) {
        this.enduranceUE = enduranceUE;
    }

    public int getSwimSpeedMS() {
        return swimSpeedMS;
    }

    public void setSwimSpeedMS(int swimSpeedMS) {
        this.swimSpeedMS = swimSpeedMS;
    }

    public int getStaminaCosts() {
        return staminaCosts;
    }

    public void setStaminaCosts(int staminaCosts) {
        this.staminaCosts = staminaCosts;
    }

    public Animal(String name, int runningSpeedMS, int enduranceUE, int swimSpeedMS) {
        this.name = name;
        this.runningSpeedMS = runningSpeedMS;
        this.enduranceUE = enduranceUE;
        this.swimSpeedMS = swimSpeedMS;

    }

    public Animal(String name, int runningSpeedMS, int enduranceUE) {
        this.name = name;
        this.runningSpeedMS = runningSpeedMS;
        this.enduranceUE = enduranceUE;
    }

    public void info() {
        System.out.println("Имя животного " + name + " Скорость бега М/С " + runningSpeedMS + " Скорость плавания М/С " + swimSpeedMS + " Выносливость " + enduranceUE);
    }

    public int run(int distance) {
        this.staminaCosts = 1;
        int metrInSecond = distance / this.runningSpeedMS;
        System.out.println(name + "Время " + metrInSecond + " секунд " + " пробежал " + distance + " метров");
        int power = (distance / enduranceUE);
        if (power < enduranceUE) {
            System.out.println(name + " пробежал " + distance);
        } else {
            System.out.println(name + " устал");
            return metrInSecond - 1;
        }
        return power;
    }


    public int swim(int distance) {
        this.staminaCosts = 2;
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
