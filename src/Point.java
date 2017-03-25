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
        }
    }
    
    public void setPoint(){
         //-1000 و1000 فرض بر این است که طول و عرض هر نقطه بین 
        this.setPoint(0, 0);
    }
     public void setPoint(int xx){
         this.setPoint(xx, this.y);
     }
//     public void setPoint(int yy){
//         this.setPoint(this.x, yy);
//     }
     public void setPoint(Point p){
         this.setPoint(this.x, this.y);
     }
    //@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ Getters
     public String getXY(){
         return "("+ this.x + "," + this.y + ")";
     }
     public int getX(){
         return this.x;
     }
     public int getY(){
         return this.y;
     }
    //@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ Other methods
     
}
