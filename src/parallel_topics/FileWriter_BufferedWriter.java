package parallel_topics;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriter_BufferedWriter {

	public static void main(String[] args) {
		
		String[] lines = new String[] {"Good morning", "Good afternoon", "Good night"};
		
		String path = "C:\\Intel\\out.txt";
		
		// Para adicionar no arquivo sem apagar o conteúdo ja existente basta adicionar TRUE.
		// new FileWriter(path, true)
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
			
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}
			
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
