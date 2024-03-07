
public class ContaBancaria {
	
	private String nome;
	private double saldo;
	
	//construtor 
	
	public ContaBancaria (String nome, double saldo) {
		this.nome = nome;
		
		if(saldo > 0.0)
		this.saldo = saldo;
	
	}	
	// metodo de deposito
	
	public void deposito (double depositoValor) {
		if(depositoValor > 0)
		saldo = saldo + depositoValor;	
	}

	
	
	//getters e setter
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	

}
