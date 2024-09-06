class A{
int x,y;
A(int a , int b){
x=a;
y=b;
}
void disp1(){
System.out.println(x+" "+y);
}
}
class B extends A{
int c,d;
B(int s,int t,int u,int v){
super(s,t);
c=u;
d=v;
}
void disp2(){
System.out.println(c+" "+d);
}

}
class super_const2{
public static void main(String a[]){
B ob = new B(20,30,40,50);
ob.disp1();
ob.disp2();
}
}