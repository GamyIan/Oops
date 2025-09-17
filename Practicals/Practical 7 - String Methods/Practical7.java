public class Practical7 {
	/*
	Q1. Write a program to convert every alternate word of a given sentence into uppercase and display the modified sentence.
	Q2. Write a program which has a method for longest word, which extracts the longest word from the sentence.
	 */
	
	String q1(String sentence) {
		String output="";
		String[] words=sentence.split(" ");
		int len=words.length;
		for (int i=0;i<len;i++) {
			if (i%2==0) {
				output+=words[i];
			}
			else {
				output+=words[i].toUpperCase();
			}
            output+=" ";
		}
		return output;
	}
	
	String q2(String sentence) {
		String[] words=sentence.split(" ");
		String longest=words[0];
		int longlen=words[0].length();
		
		for (String word : words) {
			int len=word.length();
			if (len > longlen) {
				longest=word;
				longlen=len;
			}
		}
		
		return longest;
		
	}
	
	public static void main(String[] args) {
		Practical7 p5=new Practical7();
		String a1=p5.q1("Make alternate words in this sentence UpperCase.");
		System.out.println("Answer Q1:\n"+a1);
		String a2=p5.q2("Find the longest word from this sentence.");
		System.out.println("Answer Q2:\n"+a2);
	}
	
}
