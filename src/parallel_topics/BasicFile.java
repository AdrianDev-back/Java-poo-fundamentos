package parallel_topics;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BasicFile {

	public static void main(String[] args) {
		
		File file = new File("C:\\Intel\\in.txt.txt");
		Scanner sc = null;
		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		}
		catch (FileNotFoundException e) {
			System.out.println("Error opening file: " + e.getMessage());
		}
		finally {
			if (sc != null) {
				sc.close();
			}
		}

	}

}
