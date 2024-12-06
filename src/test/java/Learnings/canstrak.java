package Learnings;

public class canstrak {
int value;
	public canstrak() {
		value=0;
	}
	public canstrak(int value) {
		this.value=value;
	}
	public canstrak(canstrak n) {
		this.value=n.value;
	}
	public static void main(String[] args) {
		canstrak test1=new canstrak();
		canstrak test2=new canstrak(25);
		canstrak test3=new canstrak(test2);
		System.out.println(test1.value);
		System.out.println(test2.value);
		System.out.println(test3.value);
	}

}
//In Java, a constructor is a special type of method used to initialize objects. It is called when an instance of a class is created.
//Constructors have the same name as the class and do not have a return type