package defaultPackage;

public class ContaCorrente extends Conta{
	
	
	
	public ContaCorrente(Cliente cliente) {
		super(cliente);
		
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Corrente ===");
		super.imprimirinfosComuns();
	}

	@Override
	public void oferecerEmprestimo() {
		// TODO Auto-generated method stub
		
	}


}
