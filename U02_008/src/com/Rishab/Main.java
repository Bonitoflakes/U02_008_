package com.Rishab;

public class Main {
    public static void main(String[] args) {
        Shape s1 = new Shape();
        System.out.println("area:");
            System.out.println(s1.find_area());
        Box b1 = new Box();
        System.out.println("Circumference:");
            System.out.println(b1.circumference());
        Cube c1 = new Cube();
        System.out.println("Volume:");
        System.out.println(c1.volume());
        CIA c2 = new CIA("Rishab",004,100,100);
        c2.display();
        StudentMarks sm1 = new StudentMarks(); // no value given
        sm1.display();
    }
}
