class A{
	A(){
		System.out.println("this is a constructor of parent class");
	}
}
class B extends A{
	B(){
		System.out.println("this is a constructor of class B");
	}
}
class C extends B{
	C(){
		System.out.println("this is a constructor of class C");
	}
}
class super_const3{
	public static void main(String args[]){
						C ob = new C();
						}
}