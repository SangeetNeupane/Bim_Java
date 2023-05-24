package inheritance;
abstract class animal
{
    abstract void sound();
}
class dog extends animal
{
    void sound()
    {
        System.out.println("Dogs Barks");
    }
}
class Cat extends animal
{
    void sound()
    {
        System.out.println("Cat Meow");
    }
}

public class abstract_class1 {

	public static void main(String[] args) 
	{
		animal rz=new dog();
		animal rk=new Cat();
	    rz.sound();
	    rk.sound();
	}

}
