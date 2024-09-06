class Thread5{
public static void main(String args[]){
for(int i = 0; i < 10; i++){
try{
System.out.println(i);
Thread.sleep(2000);
}
catch(InterruptedException e){

}
}
}
}