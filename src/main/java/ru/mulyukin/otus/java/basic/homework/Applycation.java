package ru.mulyukin.otus.java.basic.homework;

import ru.mulyukin.otus.java.basic.homework.homework5.Animal;
import ru.mulyukin.otus.java.basic.homework.homework5.Cat;
import ru.mulyukin.otus.java.basic.homework.homework5.Dog;
import ru.mulyukin.otus.java.basic.homework.homework5.Horse;

public class Applycation {
    public static void main(String[] args) {


        Cat cat = new Cat("Tom", 7, 93);
        Dog dog = new Dog("Maty", 3, 110, 5);
        Horse horse = new Horse("Plotva", 4, 164, 15);


        dog.info();
        dog.swim(1100);
        cat.info();
        cat.swim(40);
        horse.info();
        horse.swim(400);


        cat.info();
        cat.run(40);
        dog.info();
        dog.run(50);
        horse.info();
        horse.run(500);
    }
}
