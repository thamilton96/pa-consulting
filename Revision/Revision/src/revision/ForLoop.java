package revision;

public class ForLoop {

	public static void main(String[] args) {

	}
	
	public boolean checkIfEmpty(String word) {
//		String result = "";
		boolean result = false;
		
		if(word.isEmpty()) {
			result = true;
		}
		
		//returns result back to main
		return result;
	}
	
	public boolean isCThere(String name) {
		boolean result = false;
		
		if(name.contains("c")) {
			result = true;
		}
		
		
		return result;
	
		
	}
	
	

}
