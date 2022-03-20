
public class Triangulo {
	double base;
	double altura;
	String cor;
	
	public void exibirDados() {
		System.out.println("A base do ret�ngulo �: " +this.base);
		System.out.println("A altura do ret�ngulo �: " +this.altura);
		System.out.println("A cor do ret�ngulo �: " +this.cor);
	}
	
	public double calcularArea() {
		return (this.base* this.altura) / 2;
	}
	
	public void atribuirExibir(double base, double altura, String cor) {
		this.base = base;
		this.altura = altura;
		this.cor = cor;
		
		System.out.println("A base do ret�ngulo �: " +this.base);
		System.out.println("A altura do ret�ngulo �: " +this.altura);
		System.out.println("A cor do ret�ngulo �: " +this.cor);
	}
	public double atribuirCalcularExibir(double base, double altura, String cor) {
		this.base = base;
		this.altura = altura;
		this.cor = cor;
		
		System.out.println("A base do ret�ngulo �: " +this.base);
		System.out.println("A altura do ret�ngulo �: " +this.altura);
		System.out.println("A cor do ret�ngulo �: " +this.cor);
		return (this.base * this.altura) /2;
	}
}
