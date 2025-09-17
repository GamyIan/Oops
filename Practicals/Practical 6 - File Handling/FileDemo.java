import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.BufferedWriter;

public class FileDemo {

	public static void main(String[] args) {
		try {
			// Reading from File
			File f = new File("D:/Virus/Java/text.txt.txt");
			Scanner sc = new Scanner(f);
			while(sc.hasNext()) {
				System.out.println(sc.nextLine());
			}
			
			// Writing to File
			File file = new File("trialwrite.txt");
			if (!file.exists()) {
				file.createNewFile();
			}
			FileWriter fw=new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw=new BufferedWriter(fw);
			bw.write("Hello World");
			bw.close();
			System.out.println("Done");
			
			// Reading processing and Writing
			sc.close();
			Scanner c = new Scanner(f);
			File output = new File("processed.txt");
			File input = new File("D:/Virus/Java/text.txt.txt");
			System.out.println(output.getAbsolutePath());
			if (!output.exists()) {
				file.createNewFile();
			}
			PrintWriter pr=new PrintWriter(output);
			while(c.hasNextLine()) {
				String sentence = c.nextLine();
				if (!sentence.contains("the")) {
					String sen = sentence.replace("the","");
					pr.write(sen+"\n");
				}
				else {
					pr.write(sentence+"\n");
				}
			}
			pr.flush();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
