import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Random;
import java.util.Scanner;
import java.util.UUID;

public class CauHoi{
	private static String question;
	private static String key;
	
	public void initQuestion(Scanner scanner) throws IOException {
		UUID uuid=UUID.randomUUID();
		File file= new File("C:/Users/Admin/git/repository/BTL_OPP/src/resources/"+uuid+".txt");
		FileWriter fileWriter= new FileWriter(file);
		
		String dataQst="";
		System.out.println("Please enter your question...");
		dataQst=scanner.nextLine()+"\n";
		System.out.println("Enter 4 option and correct answer...");
		dataQst+=scanner.nextLine()+"\n";dataQst+=scanner.nextLine()+"\n";dataQst+=scanner.nextLine()+"\n";dataQst+=scanner.nextLine()+"\n";
		dataQst+=scanner.nextLine()+"\n";
		
		fileWriter.write(dataQst);
		try {
			if (!file.createNewFile()) {
				System.out.println("File creation successfully!!!");
			} else {
				System.out.println("Error while creating file...");
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.getMessage();
		}
		fileWriter.close();
	}
	
	public void test() throws IOException {
		File dirFile=new File("C:/Users/Admin/git/repository/BTL_OPP/src/resources/");
		File[] files = dirFile.listFiles();
		Random random=new Random();
		
		File file= files[random.nextInt(files.length)];
		FileReader fileReader=new FileReader(file);
		
		String dataQuestion= Files.readString(file.toPath());
		
		
		String queString="";
		String answerString="";
		Scanner scanner= new Scanner(dataQuestion);
		while (scanner.hasNextLine()) {
			String lineString =scanner.nextLine();
			if (lineString.equals("A") || lineString.equals("B")||lineString.equals("C")||lineString.equals("D")) {
				answerString+=lineString;
			} else {
				queString+=lineString;
			}
			
		}
		System.out.println("day la cau hoi"+queString);
		System.out.println("day la cau tra loi"+answerString);
	}
	
	
	public static String getQuestion() {
		return question;
	}
	public static void setQuestion(String question) {
		CauHoi.question = question;
	}
	
	
}