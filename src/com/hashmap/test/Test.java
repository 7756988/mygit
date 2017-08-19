
public class Test {

	public static void m1(Object o){
		System.out.println("Object");
	}
	public static void m1(String s){
		System.out.println("String");
	}
	
	public static void main(String[] args) {
       m1(null);
	}

}
