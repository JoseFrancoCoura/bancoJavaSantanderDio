package defaultPackage;

import java.util.Random;
import java.util.Scanner;

public abstract class Conta extends Banco implements IConta   {
	
	private static final int AGENCIA_PADRAO = 1;
	
	
	protected int agencia;
	protected int contaNumero;
	protected double saldo;
	protected Cliente cliente;
	Random numero = new Random();
	protected int numSaque;
		
	public Conta(Cliente cliente) {
		this.agencia = AGENCIA_PADRAO;
		this.cliente = cliente;
		this.contaNumero = numero.nextInt(9999);
	}

	@Override
	public void sacar(double valor) {
	     if(saldo >= valor){
	            saldo -= valor;
	            numSaque++;
	            System.out.println("Operacao realizada com sucesso.");
	        } else {
	            System.out.println("Saldo insuficiente. Faça um depósito\n");
	        }
	 }
			
	public int getNumSaque() {
		return numSaque;
	}

	@Override
	public void depositar(double valor) {
		saldo += valor;
		System.out.println("Operacao realizada com sucesso.");	
	}

	@Override
	public void transferir(Conta contaDestino, double valor) {
		this.sacar(valor);
		contaDestino.depositar(valor);
		System.out.println("Operacao realizada com sucesso.");
	}

	@Override
	public void imprimirExtrato() {
		
		
	}

	public int getAgencia() {
		return agencia;
	}
	
	public int getcontaNumero() {
		return contaNumero;
	}

	public double getSaldo() {
		return saldo;
	}
	
	protected void imprimirinfosComuns() {
		System.out.println(String.format("Titular: %s", this.cliente.nome));
		System.out.println(String.format("Agência: %d", this.agencia));
		System.out.println(String.format("Número: %d", this.contaNumero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}

}
