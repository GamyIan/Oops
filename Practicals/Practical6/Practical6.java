/*
Q3. Write a program which has method display() which shows only the center word from the sentence.
Q4. (Tough) You are given a sentence. Filter out the following words (“the”,"these",”all”,”them”).
 */

public class Practical6 {
	String display(String sentence) {
		String output="";
		String[] words=sentence.split(" ");
		int len=words.length;
        if (len%2==0)
        {
            int mid=(len/2)-1;
            output+=words[mid]+", "+words[mid+1];
        }
        else {
            int mid=((len+1)/2)-1;
            output+=words[mid];
        }

		return output;
	}
	
	String q2(String sentence, String[] blacklist) {
        String replaced="";
        String[] words=sentence.split(" ");
        for (String word : words){
            boolean contains=false;
            for (String blackword : blacklist){
                if (word.equalsIgnoreCase(blackword)){
                    contains=true;
                    break;
                }
            }
            if (!contains){
                replaced+=word+" ";
            }

        }
		return replaced;
	}
	
	public static void main(String[] args) {
		Practical6 p6=new Practical6();
		String a1=p6.display("Get the Center word from this sentence.");
		System.out.println("Answer Q1:\n"+a1);
        String[] black={"the","these","all","them"};
		String a2=p6.q2("Remove certain words like the word the these them and all. All of these words are supposed to be in the blacklist",black);
		System.out.println("Answer Q2:\n"+a2);
	}
	
}
