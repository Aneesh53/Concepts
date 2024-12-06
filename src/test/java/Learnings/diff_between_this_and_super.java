package Learnings;

public class diff_between_this_and_super {
	int value; 
	diff_between_this_and_super(int value) { 
	this.value = value; // 'this' refers to the instance variable }
	}
	void display() {
	System.out.println("Value: " + this.value); // 'this' used to refer to the current instance }
	}
	diff_between_this_and_super ()
	{
		this(10);
	}
}
//this is used to refer to the current instance of a class, helping to differentiate between instance variables and parameters, and to invoke other constructors in the same class.
//
//super is used to refer to the parent class's instance, allowing access to parent class methods, variables, and constructors.