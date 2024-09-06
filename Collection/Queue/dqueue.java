import java.util.*;
public class dqueue{
public static void main(String args[]){
//creating dqueue and adding elements
Deque deque = new ArrayDeque();
deque.add("Sourav");
deque.add("Amit");
deque.add("Ajay");
deque.add("Ashish");
System.out.println(deque);
deque.offerFirst("Raj");
deque.offerLast("Ayan");
System.out.println(deque);
deque.pollFirst();
deque.pollLast();
System.out.println(deque);
}
}