class Thread1 implements Runnable{//step 1
public void run()//step 4
{
for(int i = 0; i < 10; i++){
System.out.println("Thread1's i="+i);
}
}
}
class thread2
{
public static void main(String args[]){
Thread1 ob = new Thread1();
Thread t = new Thread(ob);//step 2
t.start();//step 3
for(int i = 0; i < 10; i++){
System.out.println("Thread main's i="+i);
}
}
}