package defaultPackage;

import java.util.Scanner;

public class Main {

	public Main() {
		
	}

	public static void main(String[] args) {
		
		double valor;
		Scanner scan = new Scanner(System.in);
		int tipoConta;
		int controle = 1;
		
		Cliente bruno = new Cliente();
		bruno.setNome("Bruno");
		
		Conta cc = new ContaCorrente(bruno);
		
			
		Conta poupanca = new ContaPoupanca(bruno);
		
		while (controle !=0) {
		cc.exibeMenu();
		
		switch( cc.getOpcao() ){
        case 1:    
                cc.imprimirExtrato();
                break; 
                
        case 2:    
        		poupanca.imprimirExtrato();
        		break;
       
        case 3: 
        		      		
			
			  if ((cc.numSaque<3) || (poupanca.numSaque<3)){
				  System.out.println("Digite 1- Conta Corrente ou 2- Poupanca \n");
				  tipoConta = scan.nextInt(); 
				  if (tipoConta == 1) {
					  System.out.println("Quanto deseja sacar da C/C: "); 
					  valor = scan.nextDouble();
					  cc.sacar(valor); 
				  } else if (tipoConta == 2) {
					  System.out.println("Quanto deseja sacar poupanca: "); 
					  valor = scan.nextDouble();
					  poupanca.sacar(valor); 
				  } else{
					  	System.out.println("Opção inválida.\n"); 
					  	break; 
			  } } else{
				  		System.out.println("Limite de 3 saques diários atingidos.\n");
				  		
		}; break;
			 
                
        case 4:
	        	System.out.println("Digite 1- Conta Corrente ou 2- Poupanca \n");
	            tipoConta = scan.nextInt();
	            if (tipoConta == 1) {
	            	System.out.println("Quanto deseja depositar na C/C: ");
	            	valor = scan.nextDouble();
	            	cc.depositar(valor);
	            } else if (tipoConta == 2) {
	            	System.out.println("Quanto deseja depositar na poupanca: ");
	                valor = scan.nextDouble();
	                poupanca.depositar(valor);
	            } else{
	                System.out.println("Opção inválida.\n");
	                break;
	            }
	            break;
	            
	   case 5:
		       	System.out.println("Digite 1- Conta Corrente ou 2- Poupanca \n");;
		        tipoConta = scan.nextInt();
	            if (tipoConta == 1) {
	            	System.out.println("Quanto deseja transferir da C/C para poupança: ");
	            	valor = scan.nextDouble();
	            	cc.transferir(poupanca, valor);
	            } else if (tipoConta == 2) {
	            	System.out.println("Quanto deseja transferir da poupanca para C/C: ");
	            	valor = scan.nextDouble();
	            	poupanca.transferir(cc,valor);
		        } else{
		            System.out.println("Opcao invalida.\n");
		            break;
		        }
	            break;
	        	
        case 6: 
                System.out.println("App encerrado.");
                controle = 0;
                continue;
		default:
                System.out.println("Opcao invalida.\n");
			}
		
		System.out.println("\n Digite 0- Sair ou 1- Retornar ao menu:");
		  controle = scan.nextInt(); 
		
	} while (controle !=0);
	}
}	
