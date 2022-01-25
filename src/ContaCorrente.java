
public class ContaCorrente extends Conta {

	public ContaCorrente(Banco banco, Cliente cliente, double saldo) {
		super(banco, cliente, saldo);
	}

	public void imprimirExtratoCC() {
		System.out.println("=== Extrato Conta Corrente ===");
		super.imprimirExtrato();
	}

}
