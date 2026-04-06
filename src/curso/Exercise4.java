package curso;

import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		//Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode 
		//começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.

		Scanner sc = new Scanner (System.in);
		
		int X, Y, duration;
		
		X = sc.nextInt();
		Y = sc.nextInt();
		
		if(X < Y ) {
			duration = Y - X;
		}
		else {
			duration = 24 - X + Y;
		}
		
		System.out.println("The game lasted for " + duration + " hours");
		
		sc.close();
	}

}
