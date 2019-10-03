package revision;

public class StringExample {

	public static void main(String[] args) {
		/**
		 * Creating new instances of class for methods
		 */
		StringExample examples = new StringExample();
		examples.firstCharacter();

		examples.startCharacter();

		examples.endCharacter();

		examples.subCharacter();

		examples.containsString();

		examples.indexString();

		examples.splitString();

		examples.upperString();
	}

	/**
	 * This method returns the character at index number 5.  
	 */
	public void firstCharacter() {
		String name = "martin";
		char letter = name.charAt(5);
		System.out.println(letter);
	}

	/**
	 * This method checks whether the variable "martin"  begins with "mart".
	 */
	public void startCharacter() {
		String name = "martin";
		boolean startWith = name.startsWith("mart");
		if(startWith) {
			System.out.println("it starts with the character");
		}
	}

	/**
	 * This method checks whether the string name ends with "itn".
	 */
	public void endCharacter() {
		String name = "Tori";
		boolean startWith = name.endsWith("ori");
		if(startWith) {
			System.out.println("it ends with the character");
		}
	}

	/**
	 * This method returns the 2nd and 3rd index of "martin". 
	 */
		public void subCharacter() {
			String name = "martin";
			String subCharacter = name.substring(2, 4);
			System.out.println(subCharacter);
		}

		/**
		 * This method checks if the string "martin" contains the characters "rti".
		 */
		public void containsString() {
			String name = "martin";
			boolean contains = name.contains("rti");
			if(contains) {
				System.out.println("it contains");
			}
		}

		/**
		 * This method checks the index number of "in" in "martin".
		 */
		public void indexString() {
			String name = "martin";
			int index = name.indexOf("in");
			System.out.println("Index of " + index);
		}

		/**
		 * This method checks the number of spaces in the string.
		 */
		public void splitString() {
			String sentence = "I am studying";
			String[] strings = sentence.split(" ");
			System.out.println("Length is " + strings.length);


			for (int index = 0; index < strings.length; index++)
				System.out.println(strings[index]);
		}

		/**
		 * This method changes the string to lower case.
		 */
		public void upperString() {
			String sentence = "I am studying";
			//have to assign it to new string with = to change string
			sentence = sentence.toLowerCase();
			//have to assign it to sentence
			System.out.println("lower case sentence " + sentence);
		}
	}
