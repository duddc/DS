import java.util.Scanner;
public class Ex01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int aulas;
		float hr, dsc, slr;
		System.out.println("Digite o valor da hora aula:");
		hr = input.nextFloat();
		System.out.println("Digite o número de aulas dadas: ");
		aulas = input.nextInt();
		System.out.println("Digite o percentual de desconto:");
		dsc = input.nextFloat();
		slr = hr*aulas;
		slr = slr-(slr/100*dsc);
		System.out.println(slr);
		input.close();
	}
}
