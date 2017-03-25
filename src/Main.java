/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mohammadHossein
 */
public class Main {

    public static void main(String[] args) {
        //testing constructors
        System.out.println("testing constructors");
        Point obj1 = new Point();
        Point obj2 = new Point(89, -100);
        System.out.println(obj1.getXY());
        System.out.println(obj2.getXY());
        ////////////////////////////////////////////////
        //testing setters
        System.out.println("testing setters");
        obj1.setPoint(100, -100);
        obj2.setX(40);
        obj2.setY(-90);
        Point obj3 = new Point();
        obj3.setPoint(obj1);
        System.out.println(obj1.getXY());
        System.out.println(obj2.getXY());
        System.out.println(obj3.getXY());
        ////////////////////////////////////////////////
        //testing getters
        System.out.println("testing getters");
        Point obj4 = new Point(80, 34);
        System.out.println("x: " + obj4.getX());
        System.out.println("y: " + obj4.getY());
        System.out.println("(x,y): " + obj4.getXY());
        ////////////////////////////////////////////////
        //other Methdos
        System.out.println("testing other Methods");
        Point obj5 = new Point(5, 3);
        Point obj6 = new Point(2, 7);
        Point obj7 = new Point();
        obj7.sum(obj5, obj6);
        System.out.println("sum of obj5 , obj6 is: " + obj7.getXY());
        obj7.minus(obj5, obj6);
        System.out.println("minus of obj5 , obj6 is: " + obj7.getXY());
        double distance;
        distance = obj5.getDistance(obj6);
        System.out.println("the distance between obj5 , obj6 is: " + distance);

    }

}
