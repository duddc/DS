import java.util.Scanner;

public class Ex05 {
	
	public static void main(String[] args) {
		Scanner leia= new Scanner (System.in);
		int h, b, area, perimetro;
		
		System.out.println("Digite o valor da altura do ret�ngulo: ");
		h = leia.nextInt();
		
		System.out.println("Digite o valor da base do ret�ngulo: ");
		b = leia.nextInt();
		
		area = h*b;	
		perimetro = (h*2)+(b*2);
		
		System.out.println("O valor da �rea �: " +area);
		System.out.println("O valor do perimetro �: " +perimetro);
	}
}
