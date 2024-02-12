package ru.mulyukin.otus.java.basic.homework;

import ru.mulyukin.otus.java.basic.homework.homework4.Box;
import ru.mulyukin.otus.java.basic.homework.homework4.User;

import java.util.Scanner;

public class Applycation1 {
    public static void main(String[] args) {
        User[] user = {
                new User("Mulyukin", "Alexsey", "Vladimirovich", 1986, "adiott52@gmail.com"),
                new User("Mulyukina", "Alena", "Valerevna", 1989, "Hellenochka@yandex.ru"),
                new User("Mulyukina", "Maia", "Alexseevna", 2013, "Maia@gmail.com"),
                new User("Mulyukin", "Vladimir", "Yurevich", 1960, "warrier@gmail.com"),
                new User("Mulyukina", "Irina", "Alexsandrovna", 1961, "medvrach@gmail.com"),
                new User("Budalaev", "Ilgis", "Haritonovich", 1952, "hariton@yanfdex.ru"),
                new User("Smokhtalin", "Alexsey", "Vladimirovich", 1975, "smokva@mail.ru"),
                new User("Nikulina", "Svetlana", "Ivanovna", 1965, "nikul@mail.com"),
                new User("Kriumskiy", "Matis", "Alexseevich", 2020, "pesel@gmail.com"),
                new User("Shevchenko", "Alexsander", "Igorevich", 1946, "onlywar@yandex.ru")
        };
        for (int i = 0; i < user.length; i++) {
            if (user[i].getYearOfBirth() < 1984) {
                user[i].userInformation();
            }
        }


        Box box = new Box(15, 10, 10, "Green");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Коробка закрыта: выберите y или n");
        char choiceUser = scanner.next().charAt(0);
        String result = null;
        if (choiceUser == 'y') {
            box.open();
            if (box.notFilled()) {
                System.out.println("Вы можете положить в коробку");
                String item = scanner.next();
                box.put(item);
                result = String.format(item);
            }else if (result != null) {
                    box.filled();
                    System.out.println("Уберите предмет из коробки");
                    box.putAway();
                }
            } else {
                box.close();
            }
        }
    }










