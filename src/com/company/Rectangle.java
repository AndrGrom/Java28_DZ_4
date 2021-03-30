package com.company;

public class Rectangle {
    double x;
    double y;

    public Rectangle(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Rectangle(double x) {
        this.x = x;
        this.y = x;
    }

    public double calculateArea() {
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

    public boolean isTheSameRectangle (Rectangle Rect) {
        return this.x == Rect.x && this.y == Rect.y;
    }

}
