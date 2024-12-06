package Learnings;

public class Mo_and_MOR {
	public int add(int a,int b) {
		return a+b;
	}
	public double add(double a,double b) {
		return a+b;
	}
	public int add(int a,int b,int c) {
		return a+b+c;
	}
	public static void main(String[] args) {
		
		Mo_and_MOR obj= new Mo_and_MOR();
		System.out.println(obj.add(5, 6));
		System.out.println(obj.add(25.23, 13.25));
		System.out.println(obj.add(21, 22,25));
//		Method overloading in Java occurs when two or more methods in the same class have the same name but different parameters 
//		(different type, number, or both). It allows methods to perform similar operations with different inputs
	}
	public void add() {
		System.out.println("Animal makes a sound");		
	}

}
