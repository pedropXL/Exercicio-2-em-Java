//Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo 
//pode começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.


import java.util.Scanner;

public class tempo_de_jogo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x, y, duracao;
		
		System.out.print("Hora inicial: ");
		x=sc.nextInt();
		System.out.print("Hora final: ");
		y=sc.nextInt();
		
		if (x>=y) {
			duracao=(24-x)+y;
		}
		else {
			duracao=Math.abs(x-y);
		}
		
		System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
		
		sc.close();
	}

}
