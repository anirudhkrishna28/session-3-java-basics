package io.javabrains.javabasics;

class Rectangle{
    int width;
    int height;
    static int numofRectangle=0;
    Rectangle(int wid,int hei){
        this.width=wid;
        this.height=hei;
        numofRectangle++;
    }
    public int getArea() {
        return width*height;
    }
    public int getPerimeter(){
        return 2*(width+height);
    }
    public static int getNumofRectangle(){
        return numofRectangle;
    }
}
public class StaticChallenge {
    public static void main(String[] args) {
        Rectangle r1=new Rectangle(2,5);
        Rectangle r2=new Rectangle(7,8);
        Rectangle r3=new Rectangle(3,9);
        Rectangle[] rectangle={r1,r2,r3};
        for(Rectangle r:rectangle){
            System.out.println("The area is: "+ r.getArea());
            System.out.println("The Perimeter is: " +r.getPerimeter());
        }
        System.out.println("total no of rectangles: "+Rectangle.getNumofRectangle());
    }
}