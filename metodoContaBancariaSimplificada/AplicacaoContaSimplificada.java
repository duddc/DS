
import java.util.Scanner;
	public class AplicacaoContaSimplificada {	
		public static void main(String [] args) {
		
			Scanner in = new Scanner(System.in);
			contaSimplificada contaSimplificada1 = new contaSimplificada();
			
			//METODO Abre Conta
			contaSimplificada1.abreConta(12345, "Nata", 500.00);
			contaSimplificada1.exibirDados();
			
			System.out.println("=====================================");
		
			// Deposita Valor
			contaSimplificada1.depositaValor(200.00);
			
			System.out.println("=====================================");
			
			// Retira Valor
			contaSimplificada1.retiraValor(200.00);
			
			System.out.println("=====================================");
			
			//retira o valor
			//retorna o saldo
			contaSimplificada1.retiraValorRetornaSaldo(200.00);
			System.out.println("O saldo atual é de: R$"+ contaSimplificada1.saldo);
			
			System.out.println("=====================================");
			
			//Exibe o saldo
			contaSimplificada1.exibirSaldo();
		}
			
			
			
	}

