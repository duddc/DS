
public class contaSimplificada {
	int numeroConta;
	String nomeCorrentista;
	double saldo;
	double deposito;
	double saque;
	
	//METODOS
	// abre conta
	public void abreConta(int numeroConta, String nomeCorrentista, double saldo) {
		this.numeroConta = numeroConta;
		this.nomeCorrentista = nomeCorrentista;
		this.saldo = saldo;
	}
	
	// depositar valor
	public void depositaValor(double valor) {
		System.out.println("O valor depositado é igual a: "+ valor);
	}
	
	//retirar valor 
	public void retiraValor(double valor) {
		this.saque = saque;
		if(this.saldo > this.saque) {
			this.saldo = this.saldo - this.saque;
			System.out.println("O saque foi efetuado com sucesso! ");
		}else{
			System.out.println("Seu saldo é menor que o valor de saque");
		}
	}
	//retira o valor
	//retorna o saldo
		public double retiraValorRetornaSaldo(double valor) {
			if(this.saldo > this.saque) {
				this.saldo = this.saldo - valor;
				System.out.println("O saque foi efetuado com sucesso! O saldo atual é: " +this.saldo);
			}else{
				System.out.println("Seu saldo é menor que o valor de saque");
			}
			
			return this.saldo;
		}
		
		//exibirSaldo
		public void exibirSaldo() {
			System.out.println("Seu saldo atual é de: R$"+ this.saldo);
		}
		
	public void exibirDados (){
		
		System.out.println("Número da conta: " +this.numeroConta);
		System.out.println("Nome Correntista: " +this.nomeCorrentista);
		System.out.println("Saldo: " +this.saldo);
	}
}
