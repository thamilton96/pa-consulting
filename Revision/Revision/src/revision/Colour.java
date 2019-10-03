package revision;
/* Given a string, if the string begins with "red" or "blue" return that color string,
 * otherwise return the empty string.
 * 
 * seeColor("redxx") -> "red"
 * seeColor("xxred") -> ""
 * seeColor("blueTimes") -> "blue"
 */

public class Colour {
	
	/**
	 * This method checks whether the string contains red or blue.
	 * @param word
	 * @return color
	 */
	public String seeColor(String word) {
		String color = "";
		
		if(color.startsWith("red")) {
			color = "red";
		}
		else if (color.startsWith("blue")) {
			color = "blue";
		}
		else {
			color = "";
		}
		return color;
	}

}
