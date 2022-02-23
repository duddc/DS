import java.util.Scanner;
public class Ex03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		float vlr, pr, vnd;
		String cont="S";
		while (! cont.equals("N")) {
			System.out.println("Digite o valor do produto:");
			vlr = input.nextFloat();
			System.out.println("Digite o valor da margem de lucro:");
			pr = input.nextFloat();
			pr = pr/100*vlr;
			vnd = vlr+pr;
			System.out.println("Valor da venda do produto: "+vnd);
			System.out.println("Deseja continuar? (S/N)?");
			cont = input.next();
		}
		input.close();
	}
}