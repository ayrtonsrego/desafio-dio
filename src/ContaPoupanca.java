
public class ContaPoupanca extends Conta {

	public ContaPoupanca(Banco banco, Cliente cliente, double saldo) {
		super(banco, cliente, saldo);
	}

	public void imprimirExtratoPoupanca() {
		System.out.println("=== Extrato Conta Poupança ===");
		super.imprimirExtrato();
	}

}
