

/**Write a program to insert the string in the array 
 * and display in the console.
 */
import java.util.*;
public class  array_string2D 
{
  public static void main(String[] args)
  {
      System.out.print("\u000C");
      Scanner av=new Scanner(System.in);
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the size of row : ");
      int r=av.nextInt();
      System.out.println("Enter the size of column :");
      int c=av.nextInt();
      String array[][]= new String[r][c];
      System.out.println("Enter the elements of "+r+"X"+c+ " array :");
      for(int i=0;i<r;i++)
      {
          for(int j=0;j<c;j++)
          {
              array[i][j]=sc.nextLine();
          }
      }
      System.out.println("The names you have entered are : ");
      for(int i=0;i<r;i++)
      {
          for(int j=0;j<c;j++)
          {
              System.out.print(array[i][j]+"\t");
          }
          System.out.println();
      }
  }
}
