//use of final keyword to prevent inheritance(this will give us error as class A is declared as final and now it can't be inherited )
final class A{
final void disp(){
System.out.println("Hello");
}
}
class B extends A{
void disp(){
System.out.println("world");
}
}
class circle2{
public static void main(String args[]){
B ob = new B();
ob.disp();
}
}