package chapter6;
/**
 * Assign and print the roll number, phone number and address of two students 
 * having names "Sam" and "John" respectively by creating two objects of class 'Student'.
 */
import java.util.*; 
 class Student_2
{
   
    int roll_no;
    Long phone_no;
    String address;
    Scanner rz=new Scanner(System.in);
    Scanner rk=new Scanner(System.in);
    void Sam()
    {
       
        System.out.println("\n\nDetails of Sam\n\n");
        System.out.println("Enter the roll no of  Sam:");
        roll_no=rz.nextInt();
        System.out.println("Enter the Phone no of  Sam:");
        phone_no=rz.nextLong();
        System.out.println("Enter the address of  Sam:");
        address=rk.nextLine();
        System.out.println("Roll no: "+roll_no);
        System.out.println("Phone no: "+phone_no);
        System.out.println("Address: "+address);
    }
    
    void John()
    { 
        System.out.println("\n\nDetails of John\n\n");
       
        System.out.println("Enter the roll no of John:");
        roll_no=rz.nextInt();
        System.out.println("Enter the Phone no of John:");
        phone_no=rz.nextLong();
        System.out.println("Enter the address of  John:");
        address=rk.nextLine();
        System.out.println("Roll no: "+roll_no);
        System.out.println("Phone no: "+phone_no);
        System.out.println("Address: "+address);
    }
    
    public static void main(String[]args)
    {
     System.out.print("\u000C");
    Student_2 r =new Student_2();
    r.Sam();
    r.John();
    }
}

