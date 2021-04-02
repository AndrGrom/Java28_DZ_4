package com.company;

public class Rectangle {
    private double x;
    private double y;
    // счетчик
    private static int createdRectangles = 0;
    // константа
    private final static String RUSSIAN_CLASS_NAME = "Прямоугольник";
    private final static String ENGLISH_CLASS_NAME = "Rectangle";

    public Rectangle(double x, double y) {
        this.x = x;
        this.y = y;
        createdRectangles += 1;
    }

    public Rectangle(double x) {
        this.x = x;
        this.y = x;
        createdRectangles += 1;
    }

    public static void printRectanglesCount() {
        System.out.println("Всего было создано [ " + createdRectangles + " ] прямоугольников");
    }

    public static void printClassName(boolean printInRussian) {
        if (printInRussian) {
            System.out.println(RUSSIAN_CLASS_NAME);
        } else {
            System.out.println(ENGLISH_CLASS_NAME);
        }
    }

    private double calculateArea() {
        return this.x * this.y;
    }

    public void printArea() {
        System.out.println(calculateArea());
    }

    public void printRectangleKind() {
        if (this.x == this.y) {
            System.out.println("квадрат");
        } else {
            System.out.println("прямоугольник");
        }

    }

    public boolean isTheSameRectangle(Rectangle Rect) {
        return this.x == Rect.x && this.y == Rect.y;
    }
}
