import lombok.Getter;
import lombok.Setter;

public abstract class Conta {

	private static final int AGENCIA = 1;
	private static int SEQUENCIAL_CONTA = 123456;

	@Getter
	private Banco banco;
	@Getter
	@Setter
	private Cliente cliente;
	@Getter
	private int agencia;
	@Getter
	private int conta;
	@Getter
	@Setter
	protected double saldo;

	public Conta(Banco banco, Cliente cliente, double saldo) {
		this.banco = banco;
		this.cliente = cliente;
		this.agencia = AGENCIA;
		this.conta = SEQUENCIAL_CONTA;
		this.saldo = saldo;
		SEQUENCIAL_CONTA++;
	}

	public void depositar(double valor) {
		this.saldo += valor;
	}

	public void sacar(double valor) {
		this.saldo -= valor;
	}

	public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}

	public void imprimirExtrato() {
		System.out.println("Banco: " + this.banco.getNome());
		System.out.println("Cliente: " + this.cliente.getNome());
		System.out.println("Agência: " + this.agencia);
		System.out.println("Conta: " + this.conta);
		System.out.println("Saldo: " + this.saldo);
	}

}
