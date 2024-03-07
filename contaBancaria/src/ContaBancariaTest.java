import java.util.Scanner;

public class ContaBancariaTest {
	
	public static void main(String[] args) {
		
		ContaBancaria conta1 = new ContaBancaria("Jane Green", 50.50);
		ContaBancaria conta2 = new ContaBancaria("Bruce Wayne", -7.00);
		
		//impressao de dados da conta
		System.out.printf("%s saldo R$ % .2f %n",
				conta1.getNome(), conta1.getSaldo());
		System.out.printf("%s saldo R$ % .2f %n",
				conta2.getNome(), conta2.getSaldo());
		
		//ler entrada usuario
		Scanner input = new Scanner (System.in);
		
		System.out.println("Qual quantia  deseja depositar na conta1: ");
 		double depositoValor = input.nextDouble();
 		
 		System.out.printf("%n adicionado %.2f na conta1 %n ",
 				depositoValor);
 		
 		conta1.deposito(depositoValor); // adicionando o saldo a conta 1 
 		
 		//exibir o saldo
 		
 		System.out.printf("%s saldo em conta R$ %.2f %n",
 				conta1.getNome(), conta1.getSaldo());
 		
 		
		System.out.println("Qual quantida deseja depositar na conta2: ");
			depositoValor = input.nextDouble();
			
		System.out.printf(" %n adicionado %.2f na conta2 %n ",
				depositoValor);	
		
		conta2.deposito(depositoValor); // adicionando saldo em conta2
		
		System.out.printf("%s saldo R$ %.2f %n",
				conta2.getNome(), conta2.getSaldo());
		
	}

}
