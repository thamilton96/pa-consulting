package revision;

import java.util.ArrayList;

public class MethodExamples {

	public static void main(String[] args) {
		MethodExamples methodExamples = new MethodExamples();

		//outcome is name of boolean, only value of boolean is passed to method 
		boolean outcome = methodExamples.returnSomething();
		System.out.println("the outcome was:" + outcome);

		int theValueIs = methodExamples.returnInt();
		System.out.println("the value is:" + theValueIs);

		String theSentenceIs = methodExamples.returnString();
		System.out.println("the sentence is:" + theSentenceIs);

		int multiple = methodExamples.returnMultipleInt(8,9);
		System.out.println("the numbers are:" + multiple);

		//array list means we can keep adding info
		ArrayList<String> arrays = methodExamples.returnArrayList();
		System.out.println("the array list is:" + arrays);

		//for loop needed for array list
		for(int i = 0; i < arrays.size() ; i++) {
			arrays.get(i);

		}
	}

	public boolean returnSomething() {
		// result is a local variable
		boolean result = true;

		return result;

	}

	public int returnInt() {
		int result = 42;

		return result;

	}

	public String returnString() {
		String result = "hello World";

		return result;

	}

	public int returnMultipleInt(int result1, int result2) {

		return result1 * result2;

	}

	public ArrayList<String> returnArrayList() {

		ArrayList<String> list = new ArrayList();
		list.add("hello");
		list.add("world");

		return list;
		//return is last thing in a method, don't put anything  below this

	}
	
}
