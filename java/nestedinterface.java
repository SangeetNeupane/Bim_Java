interface a{
 void show();
 interface b{
 void display();
 }
 }
 class abc implements a.b{
 public void show(){
 System.out.println("aarati");
 }
 public void display(){
 System.out.println("prerna");
 }
 }
 class nestedinterface{
 public static void main(String[] args){
 abc c=new abc();
 c.show();
 c.display();
 }
 }