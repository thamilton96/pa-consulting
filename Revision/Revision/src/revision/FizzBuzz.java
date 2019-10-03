package revision;

public class FizzBuzz {

	public static void main(String[] args) {
		public String[] fizzBuzz(int start, int end) {
			  String[] result = new String[end-start];
			  int currentNumber = start;
			  
			  for(int index = 0; index < end-start;index++) {
			    
			    if(currentNumber % 15 == 0) {
			      result[index] = "FizzBuzz"; 
			    }
			    else if(currentNumber % 5 == 0) {
			      result[index] = "Buzz";
			    }
			    else if(currentNumber % 3 == 0) {
			      result[index] = "Fizz";
			    }
			    else {
			    result[index] = String.valueOf(currentNumber);
			    }
			    currentNumber++;
			  }
			  return result;
			}

	}

}
