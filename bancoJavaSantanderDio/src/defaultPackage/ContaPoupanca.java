package defaultPackage;

public class ContaPoupanca  extends Conta {

	

	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Poupança ===");
		super.imprimirinfosComuns();
	}

	@Override
	public void oferecerEmprestimo() {
		// TODO Auto-generated method stub
		
	}
	
}	
