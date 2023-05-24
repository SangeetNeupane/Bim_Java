import java.util.Scanner;

public class for_example1 {
    public static void main(String[]args)
    {
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter the five number:-");
        int i;
        int A[]=new int[5];
        for(i=0;i<5;i++)
        {
          A[i]=sn.nextInt();  
        }
        System.out.println("The number you have entered is \n");
        i=0;
        while(i<5)
        {
            System.out.println(A[i]);
            i++;
        }
        sn.close();
    }

}
