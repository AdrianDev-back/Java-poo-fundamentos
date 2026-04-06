package parallel_topics;

import java.io.File;
import java.util.Scanner;

public class PathFiles {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a folder path: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		System.out.println("getName: " + path.getName());
		System.out.println("getParent: " + path.getParent());
		System.out.println("getName: " + path.getPath());
		
		sc.close();
	}

}
