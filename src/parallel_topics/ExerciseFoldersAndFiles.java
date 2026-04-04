package parallel_topics;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ExerciseFoldersAndFiles {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a path: ");
		String strPath = sc.nextLine();

		boolean success = new File(strPath + "\\ExerciseFolder").mkdir();
		System.out.println("Folder created with successfuly: " + success);
		
		try {
			new FileWriter("C:\\Intel\\ExerciseFolder\\datas.csv");
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
		
	

		sc.close();
	}

}
