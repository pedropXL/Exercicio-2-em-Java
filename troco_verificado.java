//Fazer um programa para calcular o troco no processo de pagamento de um produto de uma mercearia. 
//O programa deve ler o preço unitário do produto, a quantidade de unidades compradas deste produto,
// e o valor em dinheiro dado pelo cliente. Seu programa deve mostrar o valor do troco a ser devolvido
// ao cliente. Se o dinheiro dado pelo cliente não for suficiente, mostrar uma mensagem informando 
//o valor restante conforme exemplo. 


import java.util.Locale;
import java.util.Scanner;

public class troco_verificado {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double preco, dinheiro, troco;
		int quantidade;
		
		System.out.print("Preço unitário do produto: ");
		preco=sc.nextDouble();
		System.out.print("Quantidade comprada: ");
		quantidade=sc.nextInt();
		System.out.print("Dinheiro recebido: ");
		dinheiro=sc.nextDouble();
		troco=dinheiro-(preco*quantidade);
		if (dinheiro>=preco*quantidade) {
			System.out.println("TROCO = " + String.format("%.2f", troco));
		}
		else {
			System.out.println("DINHEIRO INSUFICIENTE. FALTAM " + String.format("%.2f", Math.abs(troco)) + " REAIS");
		}
		sc.close();
	}

}
