package defaultPackage;

import java.util.List;
import java.util.Scanner;


public class Banco {
	
	public String nome;
	private List<Conta> contas;
	Scanner scan = new Scanner(System.in);
	protected int opcao;

	public int getOpcao() {
		return opcao;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public List<Conta> getContas() {
		return contas;
	}


	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}

    public void exibeMenu(){
        
        System.out.println("\t Escolha a opcao desejada");
        System.out.println("1 - Consultar Extrato da Conta Corrente");
        System.out.println("2 - Consultar Extrato da Conta Poupança");
        System.out.println("3 - Sacar");
        System.out.println("4 - Depositar");
        System.out.println("5 - Transferir");
        System.out.println("6 - Sair\n");
        System.out.print("Opcao: ");
        int opcao = scan.nextInt();
        this.opcao = opcao;
    }
}
