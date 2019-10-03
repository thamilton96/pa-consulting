package revision;

public class FizzString {
	public String fizzString(String str) {
		  String newString = "";
		  
		  if(str.startsWith("f") && str.endsWith("b")) {
		    newString = "FizzBuzz";
		  }
		  else if(str.startsWith("f")) {
		    newString = "Fizz";
		  }
		  else if(str.endsWith("b")) {
		    newString = "Buzz";
		  }
		  else {
		    return str;
		  }
		  return newString;
		}
		  
}
