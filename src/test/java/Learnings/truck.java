package Learnings;

public class truck {
	public static void test1() {
		System.out.println("this is test1");
	}
	public static void test1(int n) {
		System.out.println("this is test1 with variable: "+n);
	}
	public static void test1(String n) {
		System.out.println("this is test1 with String: "+n);
	}
	
	public static void main(String[] args) {
		test1();
		test1(2);
		test1("ANEESH");
	}

}
