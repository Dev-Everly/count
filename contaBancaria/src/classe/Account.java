package classe;

public class Account {
	
	private String nome; // variavel de instancia
	private double balance;
	
	//construtor que recebe dois parametros
	
	public Account(String nome, double balance) {
		this.nome = nome; // atribui nome a variavel de instancial nome
		
		// valida que balance é maior que 0
		
		if(balance > 0.0) 
			this.balance = balance;
	}
	
	
	// metodo que deposita apenas quantida valida ao saldo
	
	public void deposit(double depositAmount) {
		if(depositAmount > 0.0) 
		 balance = balance + depositAmount;	
	}
	
	//metodo que retorna o saldo da conta 
	
	public double getBalance () {
		return balance;
	}
	
	
	//metodo para definir o nome do objeto
	
	public void setNome(String nome) {
		
		this.nome = nome; // armazena o nome
	}
	
	// metodo para retornar o nome do objeto
	public String getNome() {
		return nome;
	}

} // fim da classe Account
