import java.util.*;
public class abcd{
   public static void main(String[] args) 
   {
     int[][] a = new int [2][2];
     Scanner rz=new Scanner(System.in);
     System.out.println("Enter the numbers in array:-" );
     for (int i = 0; i < 2; i++) {
        for(int j = 0; j < 2; j++) {
           a[i][j]=rz.nextInt();
        }
       
     }
     System.out.println("The numbers in array:-" );
     for (int i = 0; i < 2; i++) {
        for(int j = 0; j < 2; j++) {
           System.out.print( " "+a[i][j] );
        }
        System.out.println();
     }
   }
}
