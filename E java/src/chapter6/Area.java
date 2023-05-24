package chapter6;

/**
 * Write a program to print the area of a rectangle by creating a class named 'Area' having two methods. 
 * First method named as 'setDim' takes length and breadth of rectangle as parameters 
 * and the second method named as 'getArea' returns the area of the rectangle. 
 * Length and breadth of rectangle are entered through keyboard.
 */

import java .util .*;
class Area
{
    int length;
    int breadth;
    int setDim(int l, int b)
    {
        length=l;
        breadth=b;
        int result= length *breadth;
        return result;
    }
    void getArea(int a,int b)
    {
    System.out.println("Area = " + setDim(a,b));
    }
    public static void main(String[]args)
    {
       Scanner rz = new Scanner(System.in);
        System.out.println("Enter the length and breadth of Rectangle");
        int x=rz.nextInt();
        int y=rz.nextInt(); 
        Area rec=new Area();
        rec.setDim(x,y);
        rec.getArea(x,y);
        
    }
}
