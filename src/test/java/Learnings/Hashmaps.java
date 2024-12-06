package Learnings;

import java.util.HashMap;
import java.util.Map;

public class Hashmaps {
	public static void maps() {
		Map<String,Integer> colours=new HashMap<>();
		colours.put("Red", 2);
		colours.put("Green", 3);
		colours.put("White", 4);
		colours.put("Blue", null );
		colours.put("violet",8);
		colours.put("orange", 13);
		colours.put(null, 13);	
		colours.put("lemon", null);	
		colours.put(null, 13);
		colours.put(null, 13);
		int red=colours.get("Green");
		System.out.println(red);
		boolean color=colours.containsKey("Blue");
		System.out.println("Blue: "+color);
		colours.replace("orange",13, 26);
		System.out.println(colours);
		
	}
	public static void main(String[] args) {
		Hashmaps.maps();
	}
}
