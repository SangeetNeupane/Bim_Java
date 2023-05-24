//2015.14
class Rectangle{
int length ,breadth;
int area;
void computeArea(int l,int b){
length=l;
breadth=b;
area=length*breadth;
}
void displayArea()
{
System.out.println("larger rectangle "+area);
}
}
class largerarea{
public static void main(String[] args){
Rectangle r=new Rectangle();
Rectangle g=new Rectangle();
r.computeArea(30,40);
g.computeArea(20,20);
if(r.area>g.area)
{
r.displayArea();
}
else{ 
g.displayArea();
}
}
}