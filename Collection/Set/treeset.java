import java.util.*;
public class treeset{
public static void main(String args[]){
//creating hashset and adding elements
TreeSet set = new TreeSet();
set.add("Raj");
set.add("Vijay");
set.add("Raj");
set.add("Shibam");
System.out.println(set);
set.remove("Raj");
//Traversing elements
Iterator itr = set.iterator();
while(itr.hasNext()){
System.out.println(itr.next());
}
}
}