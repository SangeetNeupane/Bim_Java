
    import java.util.Scanner;

class student {
    int roll;
    int marks;
    String address;
    String name;
    student(){}
    student(String n, String a, int r, int m) {
        roll = r;
        marks = m;
        address = a;
        name = n;

        System.out.println("Name:  " + name + "  Address:  " + address + "  roll: " + roll + "  marks: " + marks);
    }

    public static void main(String args[]) {
    	
        student s = new student( );
        System.out.println("enter the details:-");
        Scanner v = new Scanner(System.in);
        Scanner va = new Scanner(System.in);
        System.out.println("Name:");
        s.name = v.nextLine();
        System.out.println("Roll:");
        s.roll = va.nextInt();
        System.out.println("Marks");
        s.marks = va.nextInt();
        System.out.println("Address");
        s.address = v.nextLine();
        student sa = new student(s.name,s.address,s.roll,s.marks);
        
    }
}

