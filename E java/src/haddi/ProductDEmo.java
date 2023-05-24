package haddi;
class Product
{
 String name;
 int qty,price;
	Product(String a,int b,int c)
	{
		name=a;
		qty=b;
		price=c;
	}
	String getName()
	{
	   return name;
	}
	int getQty()
	{
		return qty;
	}
	int getPrice()
	{
		return price;
	}
	int getTotal()
	{
		int total=qty*price;
		return total;
	}
}
public class ProductDEmo
{
	public static void main(String[] args)
	{
		Product rz=new Product("Prerena",2,500);
		System.out.println("The name is : ");
		System.out.println("The qty is :"+rz.getQty());
		System.out.println("The Price is :"+rz.getPrice());
		int rk=rz.getTotal();
		System.out.println("The total is : "+rk);
		Product re=new Product("Singh",3,100);
		System.out.println("The name is : "+re.getName());
		System.out.println("The qty is :"+re.getQty());
		System.out.println("The Price is :"+re.getPrice());
		int k=re.getTotal();
		System.out.println("The total is : "+k);
		System.out.println("The total of both product is : "+(rk+k));
	}
}
