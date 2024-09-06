import java.util.*;
public class linkedhashset{
public static void main(String args[]){
//creating hashset and adding elements
LinkedHashSet set = new LinkedHashSet();
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