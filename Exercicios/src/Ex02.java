import java.util.Scanner;
public class Ex02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int nm, tmp, inv;
		System.out.println("Digite um n�mero com tr�s algarismos: ");
		nm = input.nextInt();
		for(inv = 0;nm!=0;) {
			tmp = nm%10;
			inv = inv*10+tmp;
			nm = nm/10;
		}
		System.out.println("N�mero invertido: "+inv);
		input.close();
	}
}
