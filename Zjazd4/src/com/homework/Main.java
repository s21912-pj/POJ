package com.homework;

/*
    Some tests 
    Author: Karol Kuchnio
 */

public class Main {

    public static void main(String[] args) {

        System.out.println("//Ex.20");
        Person person = new Person("Karol","ul.Polna");
        System.out.println(person.toString());
        Student student = new Student("Marek","ul.Wielkopolska","program",1995,15.0);
        System.out.println(student.toString());
        Staff staff = new Staff("Adam","ul.Warenska","program",200);
        System.out.println(staff.toString());

        System.out.println("//Ex.21");
        Point2D point2D = new Point2D();
        System.out.println(point2D.toString());
        Point2D point2D2 = new Point2D(10,20);
        System.out.println(point2D2.toString());
        Point3D point3 = new Point3D(10,20,10);
        System.out.println(point3.toString());

        System.out.println("//Ex.22");
        Point point = new Point(1,18);
        System.out.println(point.toString());
        MovablePoint movablePoint = new MovablePoint(10,21,11,18);
        System.out.println(movablePoint.toString());

        System.out.println("//Ex.23");
        Shape shape = new Shape();
        System.out.println(shape.toString());
        Circle circle = new Circle(12);
        System.out.println(circle.toString());
        Rectangle rectangle = new Rectangle(11,22);
        System.out.println(rectangle.toString());
        Square square = new Square("Blue",true,22);
        System.out.println(square.toString());

        System.out.println("//Ex.24");
        int valuetoCheck1 = 123;
        int valuetoCheck2 = 153;
        System.out.println(String.format("%d is Armstrong number:%s",valuetoCheck1, Ex24ArmStrong.IsArmStrongNumber(valuetoCheck1)));
        System.out.println(String.format("%d is Armstrong number:%s",valuetoCheck2, Ex24ArmStrong.IsArmStrongNumber(valuetoCheck2)));

        //Ex 25 and 26 is under implementation classes, where code is also tested.

    }
}
