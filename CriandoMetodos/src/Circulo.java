
public class Circulo {
	double raio;
	String cor;
	
	//METODOS
		public void exibirDados() {
			System.out.println("O raio do circulo é: " +this.raio);
			System.out.println("A cor do circulo é: " +this.cor);
		}
		
		public double calcularArea() {
			return 3.14 * (this.raio * this.raio);
		}
		
		public void atribuirExibir(double raio, String cor) {
			this.raio = raio;
			this.cor = cor;
			
			System.out.println("O raio do circulo é: " +this.raio);
			System.out.println("A cor do circulo é: " +this.cor);
		}
		public double atribuirCalcularExibir(double raio, String cor) {
			this.raio = raio;
			this.cor = cor;
			
			System.out.println("O raio do circulo é: " +this.raio);
			System.out.println("A cor do circulo é: " +this.cor);
			return 3.14 * (this.raio * this.raio);
		}
}
