package Learnings;

public class MOR2 extends Mo_and_MOR {

	@Override
	public void add() {
		System.out.println("Dog barks");
	}
	public static void main(String[] args) {
		Mo_and_MOR obj = new MOR2();//polymorphisam
		obj.add();
		

	}

}
