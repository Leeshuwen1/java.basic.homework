package ru.mulyukin.otus.java.basic.homework.homework4;

public class Box {
    String[] box = new String[1];

    private int size;
    private int size1;
    private int size2;
    private String color;
    private char open;
    private char filled;

    public char getOpen() {
        return open;
    }

    public char getFilled() {
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

    public void setOpen(char open) {
        this.open = open;
    }

    public void setFilled(char filled) {
        this.filled = filled;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public Box(int size, int size1, int size2, String color, char open, char filled) {
        this.size = size;
        this.size1 = size1;
        this.size2 = size2;
        this.color = color;
        this.open = open;
        this.filled = filled;
    }

    public char openBox(char choice) {
        choice = 'y';
        for (int i = 0; i < box.length; i++) {
            if (box[i].charAt(0) == choice) {
                System.out.println("Коробка открыта ");
            } else {
                System.out.println("Коробка закрыта ");
            }
        }
        return choice;
    }

    public void info() {
        if (box == null) {
            System.out.println("Коробка размером " + size + " X " + size1 + " X " + size2 + " " + " цветом " + color);
        } else {
            System.out.println("Коробка размером " + size + " X " + size1 + " X " + size2 + " " + "цветом " + color);
        }
    }


    public void open(char choiceUser) {
        for (int i = 0; i < box.length; i++) {
            if (box[i] == null) {
                System.out.println("Коробка открыта, вы можете в нее что нибудь положить");
            } else {
                System.out.println("Коробка открыта " + " " + box[i]);
            }
        }
    }

    public void close() {
        for (int i = 0; i < box.length; i++) {
            if (box[i] != null) {
                System.out.println("Коробка закрыта " + box[i]);
            } else {
                System.out.println("Коробка закрыта, откройте коробку ");
            }
        }
    }


    public void put(String item) {
        for (int i = 0; i < box.length; i++) {
            if (box[i] == null) {
                System.out.println("В коробку положили " + item);
                box[i] = item;
                return;
            }
        }
    }


    public String putAway(String item) {
        for (int i = 0; i < box.length; i++) {
            if (item.equals(box[i])) {
                box[i] = null;
                System.out.println("Из коробки взяли предмет");

            }
        }
        return item;
    }
}


