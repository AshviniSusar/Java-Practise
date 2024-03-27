package MyOwnPractice;

import java.util.ArrayList;

public class javaAraryList {
	
public javaAraryList(String string) {
		// TODO Auto-generated constructor stub
	}

public static void main(String[] args) {
	  
	        // Create an ArrayList to store String objects
	        ArrayList<String> stringList = new ArrayList<String>();

	        // Add elements to the ArrayList
	        stringList.add("Hello");
	        stringList.add("World");

	        // Create an ArrayList to store Integer objects
	        ArrayList<Integer> integerList = new ArrayList<Integer>();

	        // Add elements to the Integer ArrayList
	        integerList.add(10);
	        integerList.add(20);

	        // Create an ArrayList to store custom objects
	        ArrayList<javaAraryList> customList = new ArrayList<javaAraryList>();
	        customList.add(new javaAraryList("Custom Object 1"));
	        customList.add(new javaAraryList("Custom Object 2"));
	       
}}
