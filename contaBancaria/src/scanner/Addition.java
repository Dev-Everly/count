package scanner;

import java.util.Scanner;
//ctrl + shift + o importa direto

public class Addition {
	
	//metodo main inicia a execucao do aplicativo java
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		// variaveis 
		int number1;  
		int number2;  
		int soma;
		
		System.out.println("Insira o primeiro número inteiro: ");
		number1 = scanner.nextInt();
		
		System.out.println("Insira o segundo número inteiro: ");
		number2 = scanner.nextInt();
		
		soma = number1 + number2;
		
		System.out.printf("A soma é %d%n ", soma );
		
	}

}
