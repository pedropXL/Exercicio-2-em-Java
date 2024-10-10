//Uma lanchonete possui vários produtos. Cada produto possui um código e um preço. Você deve fazer um 
//programa para ler o código e a quantidade comprada de um produto (suponha um código válido), e daí 
//informar qual o valor a ser pago, com duas casas decimais, conforme o diagrama de produtos a baixo.


import java.util.Locale;
import java.util.Scanner;

public class lanchonete {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigo, quantidade;
		double valor, valorTotal;
		
		System.out.print("Codigo do produto comprado: ");
		codigo=sc.nextInt();
		System.out.print("Quantidade comprada: ");
		quantidade=sc.nextInt();
		
		if (codigo==1) {
			valor=5.00;
		}
		else if (codigo==2) {
			valor=3.50;
		}
		else if (codigo==3) {
			valor=4.80;
		}
		else if (codigo==4) {
			valor=8.90;
		}
		else {
			valor=7.32;
		}
		
		valorTotal=valor*quantidade;
		
		System.out.println("Valor a pagar: R$ " + String.format("%.2f", valorTotal));
		
		sc.close();
	}
}
