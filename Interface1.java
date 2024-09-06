interface I1{
void display1();

}
interface I2 extends I1{
void display2();
}
class C1 implements I2{
public void display1(){
System.out.println("Display function of I1");
}
public void display2(){
System.out.println("Display function of I2");
}

}
class Interface1{
public static void main(String a[]){
I2 ob2 = new C1();
ob2.display1();
ob2.display2();
}
}