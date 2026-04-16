package application;

import model.entities.Client;

public class ProgramCompare {

	public static void main(String[] args) {
	
		Client c1 = new Client("Maria", "Maria@gmail.com");
		Client c2 = new Client("Bob", "Bob@gmail.com");
		
		String s1 = "Teste"; // Se atribuir o conteudo na varialve dessa forma os comparadores trata como se tivesse a mesma
		String s2 = "Teste";// referencia de memoria, assim resultando em TRUE;
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2));
		System.out.println(c1 == c2); // Compara somente as refenrencias de memorias e não o conteudo.
		System.out.println(s1 == s2);
		
		
		
	}

}
