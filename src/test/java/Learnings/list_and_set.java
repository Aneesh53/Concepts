package Learnings;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class list_and_set {
	public static void test1() {
		List<String> anee = new ArrayList<>();
		anee.add("aneesh");
		anee.add("andeesh");
		anee.add("anedesh");
		anee.add("anevesh");
		anee.add("andeesh");
		anee.add("anecesh");
		anee.add("anedesh");
		for(int i=0;i<anee.size();i++)
		{
		System.out.println(anee.get(i));
		}
	}
	public static void test2() {
		Set<String> set = new HashSet<>();
		set.add("bananna");
		set.add("banannaapple");
		set.add("banannaorange");
		set.add("banannagrapes");
		set.add("banannadfull");
	for(String fruit:set)
	{
		System.out.println(fruit);
	}
	}
	public static void test3() {
		List<String> fruits=new LinkedList<>();
		fruits.add("apple");
		fruits.add("Pine apple");
		fruits.add("Grapes");
		fruits.add("Mango");
		fruits.add("Bananna");
	for(String fruit:fruits)
	{
		System.out.println(fruit);
	}
	}

	public static void main(String[] args) {
		list_and_set.test3();

	}

}
