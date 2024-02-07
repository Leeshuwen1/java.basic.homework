package ru.mulyukin.otus.java.basic.homework.homework4;

public class Box {


    private int size;
    private int size1;
    private int size2;
    private String color;
    private boolean open;
    private boolean filled;


    public boolean getOpen() {
        return open;
    }

    public boolean getFilled() {
        return filled;
    }

    public int getSize1() {
        return size1;
    }

    public int getSize2() {
        return size2;
    }

    public int getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public void setOpen() {
        this.open = true;
    }

    public void setFilled() {
        this.filled = false;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public Box(int size, int size1, int size2, String color) {
        this.size = size;
        this.size1 = size1;
        this.size2 = size2;
        this.color = color;
    }


    public void info() {
        System.out.println("Коробка размером " + size + " X " + size1 + " X " + size2 + " " + " цветом " + color);
    }


    public void open() {
        this.open = true;
        System.out.println("Коробка открыта ");
    }


    public void close() {
        this.open = false;
        System.out.println("Коробка закрыта ");
    }


    public void put(String item) {

        if (this.open) {
            this.filled = true;
            System.out.println("В коробке лежит " + item + ',' + " нельзя ни чего положить");
        } else {
            System.out.println("Коробка закрыта! Положить ничего нельзя.");
        }
    }


    public void putAway() {
        if (this.open) {
            if (this.filled) {
                this.filled = false;
                System.out.println("Из коробки взяли предмет");
            } else {
                System.out.println("В коробке ничего нет!");
            }
        } else {
            System.out.println("Коробка закрыта! Взять ничего нельзя.");
        }
    }
}



