package revision;
/*" Given a string, return true if "bad" appears starting at index
 *  0 or 1 in the string, such as with "badxxx" or
 *  "xbadxx" but not "xxbadxx".
 * 
 * hasBad("badxx") -> true
 * hasBad("xbadxx") -> true
 * hasBad("xxbadxx") -> false
 */
public class Bad {

	public boolean hasBad(String str) {
		
		boolean result = true;

		String subCharacter = str.substring(0, 2);
//		Commented out below line because it was just
//		used to find where error was 
//		System.out.println(subCharacter);
		if(subCharacter.equals("ba")) {
			result = true;
		}
		else {
			result = false;
		}
		return result;
	}
}
