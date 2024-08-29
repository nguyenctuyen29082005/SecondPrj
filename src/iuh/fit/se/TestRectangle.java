/*
 * @ (#) TestRectangle.java       1.0     8/29/2024
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

public class TestRectangle {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(5.0, 7.0);
        System.out.println(r1.toString());
        System.out.println("Area = " + r1.getArea());
        System.out.println("Perimeter = "+r1.getPerimeter());

    }
}
