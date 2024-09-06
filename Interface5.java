interface I1{
void display1();

}
interface I2{
void display2();
}
interface I3 extends I1,I2{
void display3();
}
class c1{
void display(){
System.out.println("This is display from the class c1");
}
}
class c2 extends c1 implements I3{
public void display1(){
System.out.println("Display function of I1");
}
public void display2(){
System.out.println("Display function of I2");
}
public void display3(){
System.out.println("Display function of I3");
}
}
class Interface5{
public static void main(String a[]){
I3 ob2 = new c2();
c2 ob3 = new c2();
ob3.display();
ob2.display1();
ob2.display2();
ob2.display3();
}
}