import java.util.*;
class pqueue{
public static void main(String args[]){
PriorityQueue queue = new PriorityQueue();
queue.add("Sumit");
queue.add("Vijay");
queue.add("Jai");
queue.add("Raj");
System.out.println("head:"+queue.peek());
System.out.println("iterating the queue elements:");
Iterator itr = queue.iterator();
while(itr.hasNext()){
System.out.println(itr.next());
}
System.out.println("After first removal");
queue.remove();
System.out.println(queue);
//to remove the head element of the queue
queue.poll();
System.out.println("After second removal");
System.out.println(queue);
}
}