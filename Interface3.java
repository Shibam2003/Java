interface I1{
void display1();

}
interface I2{
void display2();
}
interface I3 extends I1,I2{
void display3();
}
class C1 implements I3{
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
class Interface3{
public static void main(String a[]){
I3 ob2 = new C1();
ob2.display1();
ob2.display2();
ob2.display3();
}
}