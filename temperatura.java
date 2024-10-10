//Deseja-se converter uma medida de temperatura da escala Celsius para Fahrenheit ou vice-versa. 
//Para isso, você deve construir um programa que leia a letra "C" ou "F" indicando em qual escala vai 
//ser informada uma temperatura. Em seguida o programa deve mostrar a temperatura na outra escala com 
//duas casas decimais. A seguir é dada a fórmula para converter de Fahrenheit para Celsius 
//(você deve deduzir a fórmula de Celsius para Fahrenheit): C=5/9 (F −32)


import java.util.Locale;
import java.util.Scanner;

public class temperatura {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double c, f;
		char temperatura;
		
		System.out.print("Voce vai digitar a temperatura em qual escala (C/F)? ");
		temperatura=sc.next().charAt(0);
		
		if (temperatura=='F') {
			System.out.print("Digite a temperatura em Fahrenheit: ");
			f=sc.nextDouble();
			c=5.0/9.0*(f-32);
			System.out.println("Temperatura equivalente em Celsius: " + String.format("%.2f", c));
		}
		else {
			System.out.print("Digite a temperatura em Celsius: ");
			c=sc.nextDouble();
			f=32+9.0/5.0*c;
			System.out.println("Temperatura equivalente em Fahrenheit: " + String.format("%.2f", f));
		}
		sc.close();
	}

}
