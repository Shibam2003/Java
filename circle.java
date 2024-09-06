//use of final keyword(using pi as final)
class A{
final double pi = 3.1415;//declaring pi as final variable 
int r,a;
double area,perem;
A(int a){
r=a;
}
void area(){
area = pi*r*r;
}
void peremi(){
perem = 2*pi*r;
}
void disp(){
System.out.println("area of the circle is "+area);
System.out.println("perimeter of the circle is "+perem);
}
}
class circle{
public static void main(String args[]){
A ob = new A(3);
ob.area();
ob.peremi();
ob.disp();
}
}