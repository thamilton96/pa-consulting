package revision;
/*Given a string of even length, return a string made of the middle
two chars, so the string "string" yields "ri". The string length will
be at least 2.

middleTwo("string") -> "ri"
middleTwo("code") -> "od"
middleTwo("Practice") -> "ct"
*/

public class String2 {
	
	/**
	 * This method works out the middle characters of the
	 * string 
	 * @param str
	 * @return middle two characters of string
	 */
	public String middleTwo(String str) {
		
		int i = str.length() / 2;
		
		String newString = str.substring(i - 1, i + 1);
		
		return newString;
	}
}
