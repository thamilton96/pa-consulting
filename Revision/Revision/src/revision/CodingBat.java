package revision;

public class CodingBat {

	public static void main(String[] args) {

		CodingBat codingBat = new CodingBat();

		//		boolean outcome = codingBat.stringE("Hello"); // -> true
		//		System.out.println(outcome);
		//		
		//		boolean outcome1 = codingBat.stringE("Hello"); // -> true
		//		System.out.println(outcome1);
		//	
		//		boolean outcome2 = codingBat.stringE("Hello"); // -> false
		//		System.out.println(outcome2);
	}

	public boolean stringE(String word) {
		//boolean is always false by default DO NOT put to true
		boolean result = false;
		int count = 0;
		
		System.out.println(word);

		//looping through string
		//index < word.length() means 0 is less than length of string 
		for(int index =0; index < word.length(); index++) {
			char c = word.charAt(index);
			System.out.println(index);

			//checking if string contains e
			if(c == 'e') {
				count++;
			}
			
			//checking if number of e's is between 1 & 3
			if(count > 0 && count < 4 ) {
				result = true;
			}
			else {
				result = false;
			}
		}	
		// return letters at end of loop
		System.out.println(count);
		System.out.println(result);
		return result;
	}		

}