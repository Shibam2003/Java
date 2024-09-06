//using final method(this program will give us error as disp function in class A is declared as final and it can not be override)
class A{
final void disp(){//declaring the function as final
System.out.println("Hello");
}
}
class B extends A{
void disp(){
System.out.println("world");
}
}
class circle1{
public static void main(String args[]){
B ob = new B();
ob.disp();
}
}