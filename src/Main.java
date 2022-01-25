
public class Main {

	public static void main(String[] args) {
		//criando um novo cliente
		Cliente c1 = new Cliente("Ayrton");
		
		//gerando o banco
		Banco banco = new Banco();
		
		//criando uma conta corrente para o cliente 
		ContaCorrente cc = new ContaCorrente(banco, c1, 10000);
		//imprimindo as informações atuais da conta corrente
		cc.imprimirExtratoCC();
		
		//criando uma conta poupança para o cliente
		ContaPoupanca cp = new ContaPoupanca(banco, c1, 0);
		//imprimindo informações atuais da conta poupança
		cp.imprimirExtratoPoupanca();
		
		//realizando movimentações na conta corrente
		cc.sacar(1000);
		cc.depositar(2000);
		cc.transferir(1000, cp);
		//imprimindo as informações atuais da conta corrente
		cc.imprimirExtratoCC();
		
		//imprimindo informações da conta poupança
		cp.imprimirExtratoPoupanca();
	}

}
