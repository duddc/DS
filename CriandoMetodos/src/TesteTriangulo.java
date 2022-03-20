import java.util.Scanner;
public class TesteTriangulo {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
			Triangulo t = new Triangulo();
			
			System.out.println("Insira a base: ");
			t.base = in.nextDouble();
			
			System.out.println("Insira a altura: ");
			t.altura = in.nextDouble();
			
			System.out.println("Digite a cor do triangulo: ");
			t.cor = in.next();
			
			System.out.println();
			
			//Exibe
			t.exibirDados();
			System.out.println("Apresentar a área: "+ t.calcularArea());
			
			System.out.println();
			
			//Atribui e exibe 
			t.atribuirExibir(40, 18, "Rosa");
			System.out.println("Apresentar a área: "+ t.calcularArea());
			
			System.out.println();
			
			//Atribui os valores, calcula e exibe
			System.out.println("Apresentar a área: "+ t.atribuirCalcularExibir(20, 10, "Prata"));
	}
}
