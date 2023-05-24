package pastQuestion;
class Book{
	String book_id;
	int page;
}
class Fiction_Book extends Book{
	String name;
	void get_data() {
		book_id="RZ05";
		page=07;
		name="sanu";
		
	}
	void display()
	{
		
		System.out.println("Book_Id of Fiction_Book: "+book_id);
		System.out.println("Page of Fiction_Book: "+page);
		System.out.println("Name of Fiction_Book: "+name);
	}
}
public class Q13_2019_makeup {

	public static void main(String[] args) {
		Fiction_Book rz=new Fiction_Book();
		rz.get_data();
		rz.display();
		

	}

}
