class A1 extends Thread//step 1
{
A1(){
start();//step 2

}
public void run()//step 3
{
for(int i = 0; i < 10; i++){
System.out.println("A1's i="+i);
}
}
}
class thread4{
public static void main(String args[]){
new A1();
for(int i = 0; i < 10; i++){
System.out.println("Main's i="+i);
}
}
}