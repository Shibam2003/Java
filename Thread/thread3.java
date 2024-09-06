class Thread1 implements Runnable{//step 1
public void run()//step 4
{
for(int i = 0; i < 5; i++){
System.out.println("Thread1's i="+i);
}
}
}
class Thread2 implements Runnable{//step 1
public void run()//step 4
{
for(int i = 0; i < 5; i++){
System.out.println("Thread2's i="+i);
}
}
}
class Thread4 implements Runnable{//step 1
public void run()//step 4
{
for(int i = 0; i < 5; i++){
System.out.println("Thread3's i="+i);
}
}
}
class thread3
{
public static void main(String args[]){
Thread1 ob = new Thread1();
Thread2 ob2 = new Thread2();
Thread4 ob3 = new Thread4();
Thread t = new Thread(ob);//step 2
t.start();//step 3

Thread t2 = new Thread(ob2);//step 2
t2.start();//step 3

Thread t3 = new Thread(ob3);//step 2
t3.start();//step 3


for(int i = 0; i < 5; i++){
System.out.println("Thread main's i="+i);
}
}
}