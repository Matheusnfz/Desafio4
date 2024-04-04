package entities;

public class Banco {
	
	private int numero;
	private String nome;
	private double saldo;
	
	public Banco() {
		
	}
	
	public Banco(int numero, String nome, double saldo) {
		super();
		this.numero = numero;
		this.nome = nome;
		this.saldo = saldo;
			
	}
	public Banco(int numero, String nome) {
		super();
		this.numero = numero;
		this.nome = nome;
	
	}

	public int getNumero() {
		return numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}
	public void deposito(double quantia) {
		this.saldo += quantia;
	}
	public void saque(double quantia) {
		this.saldo -=  quantia + 5;
	}

	@Override
	public String toString() {
		return "Banco [numero= " + numero + ", nome= " + nome +  String.format(", saldo= %.2f", saldo) + "]";
	}

	

}
