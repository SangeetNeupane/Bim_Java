package haddi;
class member
{
	String name;
	int age;
	int phone;
	String address;
	int salary;
	void setMemberDetails()
	{
	name="reeza";
	age=20;
	phone=981568456;
	address="birgunj";
	salary=500;
	}
	void printMemberDetails()
	{
		System.out.println("the name is"+name);
		System.out.println("the age is"+age);
		System.out.println("the phone is"+phone);
		System.out.println("the address is"+address);
		System.out.println("the salary is"+salary);

		
	}
}
class employee extends member
{
String specialization;
void setSpecialization()
{
	setMemberDetails();
	printMemberDetails();
	specialization="doctor";
}
void printSpecialization()
{
System.out.println(specialization);
}
}
class manager extends member
{
String department;
void setDepartment()
{
department="opd";	
}
void printDepartment()
{
	
System.out.println(department)	;
}
}
public class q2021 {
	public static void main(String[] args)
	{
		
employee bv=new employee();
bv.setSpecialization();
bv.printSpecialization();
manager bd=new manager();
bd.setDepartment();
bd.printDepartment();
}
}