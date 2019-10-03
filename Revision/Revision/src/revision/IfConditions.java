package revision;

public class IfConditions {
	
	//global variables
	private int a = 5;
	private int b = 4;
	boolean result;

	public static void main(String[] args) {
		
		//instances
		IfConditions ifConditions = new IfConditions();
		ifConditions.printConditions();
	
		ifConditions.forConditions();
		
		ifConditions.tori();
		
		ifConditions.whileConditions();
		
		ifConditions.doWhileCondition();
		
	}
	
	public void forConditions() {

		for(int index = 10; index >= 0 ; index--) {
			System.out.println("index:" + index);
		}
	}
		
	public void tori() {
		System.out.println("My name is Tori.");
	}
	
	public void whileConditions() {
//		int i = 0; 
//		while (i < 5) {
//			System.out.println(i);
//			i++;
//		}
		
//		String name = "martin";
//		String name1 = "martin";
//		while(name == name1) {
//			System.out.println("Strings Equal");
//		}
	//prints out continuously 
	}
		
		
	public void doWhileCondition() {
		int index = 0;
		do {
			System.out.println("index" + index);
			index++;
		}
		while (index < 0);
		//prints out 0
	}
		
	public void printConditions() {
		
		if(a == b) {
			System.out.println("A equals B");
		}
		else {
			System.out.println("A does not equal B");
		}
		
		if(a < b) {
			System.out.println("A is less than B");
		}
		else {
			System.out.println("A is not less than B");
		}
		
		if(!(a < b)) {
			System.out.println("A is not less than B");
		}
		else {
			System.out.println("A is less than B");
		}

		if(a > b) {
			System.out.println("A is bigger than B");
		}
		else {
			System.out.println("A is not bigger than B");
		}

		if(a <= 4) {
			System.out.println("A is less than or equal to 4");
		}
		else {
			System.out.println("A is not less than or equal to 4");
		}
		
		if(b >= 6) {
			System.out.println("B is bigger than or equal to 6");
		}
		else {
			System.out.println("B is not bigger than or equal to 6");
		}
		
		if(a != b) {
			System.out.println("A is not equal to B");
		}
		else {
			System.out.println("A is equal to B");
		}
		
		if(a>b || a<b) {
			System.out.println("A is bigger than B or A is less than B");
		}
		else {
			System.out.println("A is either not bigger than B or not less than B");
		}
		if(3 < a && a < 6) {
			System.out.println("A is bigger than 3 and less than 6");
		}
		else {
			System.out.println("This statement is false");
		}

	}

}