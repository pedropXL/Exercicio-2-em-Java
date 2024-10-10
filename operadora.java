//Uma operadora de telefonia cobra R$ 50.00 por um plano básico que dá direito a 100 minutos de telefone. 
//Cada minuto que exceder a franquia de 100 minutos custa R$ 2.00. Fazer um programa para ler a quantidade
// de minutos que uma pessoa consumiu, daí mostrar o valor a ser pago. 


import java.util.Locale;
import java.util.Scanner;

public class operadora {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int minutos;
		double valor;
		
		System.out.print("Digite a quantidade de minutos: ");
		minutos=sc.nextInt();
		
		valor=50;
		
		if (minutos>100) {
			valor=50+2*(minutos-100);
		}
		System.out.println("Valor a pagar: R$ " + String.format("%.2f", valor));
		
		sc.close();
	}

}
