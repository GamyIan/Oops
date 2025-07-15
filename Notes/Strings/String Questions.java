public class StringQuestions {
	
	// Write code to tell number of words in the sentence
	static int wordCount(String sentence) {
		String[] words = sentence.split(" ");
		return words.length;
	};
	
	String longWord(String sentence) {
		String[] words = sentence.split(" ");
		String longestWord=words[0];
		for (String word : words) {
			if (word.length() > longestWord.length()) {
				longestWord=word;
			}
		}
		return longestWord;
	}
	
	String secondLastWord(String sentence){
		String[] words=sentence.split(" ");
		return words[words.length-3]; 
	}
	
	StringBuffer revMiddle(String sentence) {
		String[] words=sentence.split(" ");
		StringBuffer rev = new StringBuffer();
		rev.append(words[(words.length%2==0?words.length/2:(words.length+1/2)-1)]);
		rev.reverse();
		return rev;
	}
	
	public static void main(String[] args) {
		System.out.println(wordCount("Hi Hello Listen to BBC News at Friday night."));
		System.out.println();
	}

}
