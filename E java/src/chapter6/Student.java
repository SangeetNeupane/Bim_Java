package chapter6;


/**
 *Create a class named 'Student' with String variable 'name' and integer variable 'roll_no'. 
 *Assign the value of roll_no as '2' and that of name as "John" by creating an object of the class Student.
 */

import java.util.*;
class Student
{
    String name;
    int roll_no;
    public static void main(String[]args)
    {
        System.out.print("\u000C");
        Scanner rz=new Scanner(System.in); 
       Student S =new Student();
       System.out.println("Enter the name of Student:");
       S.name=rz.nextLine();
       Scanner rk=new Scanner(System.in);
       System.out.println("Enter the roll no of Student:");
       S.roll_no=rk.nextInt();
       System.out.println("The name of Student : "+S.name);
       System.out.println("The roll_no of Student : "+S.roll_no);
    }
}