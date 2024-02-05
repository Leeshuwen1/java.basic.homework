package ru.mulyukin.otus.java.basic.homework;

public class Box {
    String[] box = new String[1];

    private int size;
    private int size1;
    private int size2;
    private String color;

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

    public void setColor(String color) {
        this.color = color;
    }

    public void setSize1(int size) {
        if (size != size) {
            this.size1 = size;
        }
    }

    public void setSize2(int size) {
        if (size != size) {
            this.size2 = size;
        }
    }

    public void setSize(int size) {
        if (size != size) {
            this.size = size;
        }
    }

    public Box(int size, int size1, int size2, String color) {
        this.size = size;
        this.size1 = size1;
        this.size2 = size2;
        this.color = color;
    }

    public void info() {
        for (int i = 0; i < box.length; i++) {
            if (box[i] == null) {
                System.out.println("Коробка размером " + size + " X " + size1 + " X " + size2 + " " + " цветом " + color + " " + box[i]);
            } else {
                System.out.println("Коробка размером " + size + " цветом " + color + " " + box[i]);
            }

        }
    }


    public void open() {
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


