package revision;

public class FizzAray3 {

	public static void main(String[] args) {
		public int[] fizzArray3(int start, int end) {
			  int length = end - start;
			  int[] result = new int[length];
			  int count = start;
			  
			  for(int index = 0; index < length; index++) {
			    result[index] = count;
			    count++;
			  }
			  return result;
			}

	}

}
