/*
 * @ (#) Rectangle.java       1.0     8/29/2024
 *
 * Copyright (c) 2024 IUH. All rights reserved.
 */
package iuh.fit.se;

/*
 * @description: This class represents a bank with many bank accounts
 * @author: Tuyen,Nguyen Cong
 * @date:    8/29/2024
 * @version:    1.0
 * @created: 29-Aug-2024 4:05:50 PM
 */

public class Rectangle {
    private double length, width;

    public Rectangle(double length, double width) {
        if (length < 0 || width < 0) throw new IllegalArgumentException("Length and width must be greater than 0");
        this.length = length;
        this.width = width;
    }

    public Rectangle() {
        this(0.0, 0.0);

    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length < 0) throw new IllegalArgumentException("Length must be greater than 0");
        this.length = length;
    }

    public double getWidth() {
        return this.width;
    }

    public void setWidth(double width) {
        if (width < 0) throw new IllegalArgumentException("Width must be greater than 0");
        this.width = width;
    }

    public double getArea() {
        return length * width;

    }

    public double getPerimeter() {
        return 2 * (length + width);
    }
    @Override
    public String toString() {
        return String.format("Rectangle [length=%s, width=%s]", length, width);
    }
}
