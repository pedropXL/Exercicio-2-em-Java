//Fazer um programa para ler dois números inteiros, e dizer se um número é múltiplo do outro. 
//Os números podem ser digitados em qualquer ordem. 


import java.util.Scanner;

public class multiplos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x, y, z;
		
		System.out.println("Digite dois numeros inteiros:");
		x=sc.nextInt();
		y=sc.nextInt();
		
		if (x<y) {
			z=y;
			y=x;
			x=z;
		}
		
		if (x%y==0){
			System.out.println("Sao multiplos");
		}
		else {
			System.out.println("Nao sao multiplos");
		}
		sc.close();
	}
}
