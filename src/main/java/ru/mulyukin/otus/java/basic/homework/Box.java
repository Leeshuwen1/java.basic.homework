package ru.mulyukin.otus.java.basic.homework;

public class Box {
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
    }

    public void open(){
        System.out.println("Коробка открыта ");
    }

    public void close(){
        System.out.println("Коробка закрыта ");
    }

    public String put (String item){
        if (item != null){
            System.out.println("В коробку положили " + item);
        }
        return item;
    }
}

