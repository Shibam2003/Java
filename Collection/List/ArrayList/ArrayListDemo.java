import java.util.*;
class ArrayListDemo{
public static void main(String args[]){
//create an arraylist
ArrayList al = new ArrayList();
System.out.println("Initial size of al: "+al.size());
//add elements to the array
al.add("C");
al.add("A");
al.add("E");
al.add("B");
al.add("D");
al.add("F");
al.add("5");
al.add("Ayan");
al.add(20.25);
al.add(1,"A2");//adding elements in middle
System.out.println("Size of al after additions: "+al.size());
//display the array list
System.out.println("Contents of al: "+al);
//Remove elements from the arrayList
al.remove("F");
al.remove(2);//removing using index
al.remove("5");
System.out.println("Size of al after deletion: "+al.size());
System.out.println("Contents of al: "+al);
//Traversing list through Iterator
Iterator itr = al.iterator();
while(itr.hasNext()){
System.out.println(itr.next());
}
//Traversing through iterator but converting to string 
String s;
Iterator itr2 = al.iterator();
while(itr2.hasNext()){
s = itr2.next().toString();
System.out.println(s);
}
//Traversing list using for but converting to string 
String s2;
for(int i = 0; i < al.size(); i++){
s2=al.get(i).toString();
System.out.println(s2);
}

}
}