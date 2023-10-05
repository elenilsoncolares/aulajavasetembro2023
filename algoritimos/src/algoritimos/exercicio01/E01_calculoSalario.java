package algoritimos.exercicio01;

import java.util.Scanner;

public class E01_calculoSalario {

	public static void main(String[] args) {
		
double salarioInicial,salarioFinal,porcentagem;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite o salário inicial do funcionário");
		salarioInicial = leitor.nextDouble();
		
		salarioFinal = salarioInicial + (salarioInicial*25/100);

		System.out.println(salarioFinal);
		
		leitor.close();

	}

}
