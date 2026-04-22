package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ProgramMap {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter file full path: ");
		String path = sc.nextLine();
		
		Map<String, Integer> votes = new HashMap<>();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			String line = br.readLine();
			while (line != null) {
				String[] fields = line.split(",");
				String name = fields[0];
				int quantity = Integer.parseInt(fields[1]);
				
				if (votes.containsKey(name)) {
					int total = votes.get(name);
					votes.put(name, total + quantity);
				} else {
					votes.put(name, quantity);
				}
				line = br.readLine();
				
			}
			
		} catch (IOException e ) {
			System.out.println("Error: " + e.getMessage());
		}
		
		for (String key : votes.keySet()) {
			System.out.println(key + ": " + votes.get(key));
		}
	
		sc.close();
	}

}
