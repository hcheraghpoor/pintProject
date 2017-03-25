/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mohammadHossein
 */
//-1000 و1000 فرض بر این است که طول و عرض هر نقطه بین 
public class Point {

    //############################ Attributes
    private int x;
    private int y;

    //############################ Methods
    //@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ Constructors
    public Point() {
        this.setPoint(0, 0);
    }

    public Point(int xx, int yy) {
        this.setPoint(xx, yy);
    }
    
    //@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ Setters
    public void setPoint(int xx, int yy) {
        //-1000 و1000 فرض بر این است که طول و عرض هر نقطه بین 
        if ((xx >= -1000 && xx <= 1000) && (yy >= -1000 && yy <= 1000)) {
            this.x = xx;
            this.y = yy;
        } else {
            this.x = 0;
            this.y = 0;
            System.err.println("your x and y value`s must be in range of [-1000,1000]...");
        }
    }
    
    public void setX(int xx) {
        this.setPoint(xx, this.y);
    }

    public void setY(int yy) {
        this.setPoint(this.x, yy);
    }

    //the clone constructor
    public void setPoint(Point p) {
        this.x = p.x;
        this.y = p.y;
    }

    //@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ Getters
    public String getXY() {
        return "(" + this.x + "," + this.y + ")";
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }
    //@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ Other methods
    public void sum(Point p1, Point p2){
        int xx , yy;
        xx = p1.x + p2.x;
        yy = p1.y +p2.y;
        this.setPoint(xx, yy);
    }
    public void minus(Point p1, Point p2){
        int xx , yy;
        xx = p1.x - p2.x;
        yy = p1.y - p2.y;
        this.setPoint(xx, yy);
    }
    public double getDistance(Point p){
        double result = Math.pow(this.x - p.x, 2) + Math.pow(this.y - p.y, 2);
        result = Math.sqrt(result);
        return result;
    }
}
