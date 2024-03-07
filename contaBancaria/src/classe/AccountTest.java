package classe;

import java.util.Scanner;

public class AccountTest {

	public static void main(String[] args) {
		
		Account  conta1 = new Account("Jane Green", 50.00);
		Account  conta2 = new Account("John Blue", -7.53);
		
		//exibe valor inicial de cada objeto
		System.out.printf("%s saldo R$ %.2f %n",
				conta1.getNome(),  conta1.getBalance());
		
		System.out.printf("%s saldo R$ % .2f %n",
				conta2.getNome(), conta2.getBalance());
		
		//criando scanner para obter entrada
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Qual quantida deseja depositar na conta 1: ");
		double depositAmount = input.nextDouble();
		
		System.out.printf("%n adicionando %.2f na conta1 saldo %n%n",
				depositAmount);
		conta1.deposit(depositAmount); // adicionando o saldo a conta
		
		//exibe os saldos
		
		System.out.printf(" %s saldo: R$ %.2f %n",
				conta2.getNome(), conta2.getBalance());
		
		
		System.out.println("Qual quantida deseja depositar na conta 2: ");
		 depositAmount = input.nextDouble();
		
		System.out.printf("%n adicionando %.2f na conta2 saldo %n%n",
				depositAmount);
		conta2.deposit(depositAmount); // adicionando o saldo a conta
		
		//exibe os saldos
		
		System.out.printf(" %s saldo: R$ %.2f %n",
				conta2.getNome(), conta2.getBalance());
		
		
		 
	 

}
}