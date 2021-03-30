package com.company;

public class Main {

    public static void main(String[] args) {

        Rectangle rec = new Rectangle(2);
        Rectangle rec1 = new Rectangle(2, 3);
        Rectangle rec2 = new Rectangle(6, 4);

        System.out.println(" ------------- Объект - 1 - ");
        rec.printArea();
        rec.printRectangleKind();
        System.out.println(rec.isTheSameRectangle(rec1));

        System.out.println(" ------------- Объект - 2 - ");
        rec1.printArea();
        rec1.printRectangleKind();
        System.out.println(rec1.isTheSameRectangle(rec2));

        System.out.println(" ------------- Объект - 3 - ");
        rec2.printArea();
        rec2.printRectangleKind();
        System.out.println(rec2.isTheSameRectangle(rec));
    }
}
