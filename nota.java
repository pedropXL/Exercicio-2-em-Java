//Problema "notas" Fazer um programa para ler as duas notas que um aluno obteve no primeiro
// e segundo semestres de uma disciplina anual. Em seguida, mostrar a nota final que o aluno obteve 
// (com uma casa decimal) no ano juntamente com um texto explicativo. Caso a nota final do aluno seja 
// inferior a 60.00, mostrar a mensagem "REPROVADO", conforme exemplos:



import java.util.Locale;
import java.util.Scanner;

public class nota {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double nota1, nota2, notaFinal;
		
		System.out.print("Digite a primeira nota: ");
		nota1=sc.nextDouble();
		System.out.print("Digite a segunda nota: ");
		nota2=sc.nextDouble();
		
		notaFinal=nota1+nota2;
		System.out.println("NOTA FINAL = " + String.format("%.1f", notaFinal));
		if (notaFinal<60) {
			System.out.println("REPROVADO");
		}
		sc.close();
	}

}
