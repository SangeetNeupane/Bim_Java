package pastQuestion;

class Product
{
	String name;
	int qty;
	int price;
	Product(int q,int p,String n)
	{
		name=n;
		qty=q;
		price=p;
	}
	String getName()
	{
		return name;
    }

	int getQty()
	{
		return qty;
	}
	int price()
	{
		return price;
	}
	int getTotal()
	{
		
		return price*qty;
	}
}
public class ProductDemo_2022_Q12 
{
	public static void main(String[] args)
	{
	  Product sr[]=new Product[2];
	  String n1="Chimpu";
	  String n2="Sanu";
	  sr[0]=new Product(5,100,n1);
	  sr[1]=new Product(1,500,n2);
	  System.out.println("Name of 1st product : "+sr[0].getName());
	  System.out.println("Quantity : "+sr[0].getQty());
	  System.out.println("Rate : "+sr[0].price());
	  int total_1=sr[0].getTotal();
	  System.out.println("Total Price of 1st product  : "+total_1);
	  System.out.println("Name of 2nd product : "+sr[1].getName());
	  System.out.println("Quantity : "+sr[1].getQty());
	  System.out.println("Rate : "+sr[1].price());
	  int total_2=sr[1].getTotal();
	  System.out.println("Total Price of 2nd product  : "+total_2);
	  int total_price=total_1+total_2;
	  System.out.println("\n\n\nTotal price spend in two product : "+total_price);
	  
	}
}
