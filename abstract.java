abstract class Parent {
abstract void display1()//abstract method 
void display2(){
System.out.println("Testing for abstract class");
}
}
class Children extends Parent {
void display1(){
System.out.println("This body is provided by child class ");
}
void display3(){
System.out.println("child");

}
}
class Abst_Testing{
public static void main(String a[]){
Child t = new Child();
t.display1();
t.display2();
t.display3();

}
}