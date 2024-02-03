package ru.mulyukin.otus.java.basic.homework;

public class Box {
    Box[] box = new Box[1];

    private int size;
    private String color;

    public int getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSize(int size) {
        if (size != size) {
            this.size = size;
        }
    }

    public Box(int size, String color) {
        this.size = size;
        this.color = color;
    }

    public void info() {
        System.out.println("Коробка размером " + size + " цветом " + color);
        String item = null;
        for (int i = 0; i < box.length; i++) {
            if (box[i] == null) {
                System.out.println("Коробка пуста");
            } else {
                System.out.println("В коробке лежит " + item);
            }

        }
    }

}

