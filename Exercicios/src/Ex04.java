import java.util.Scanner;
public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia= new Scanner (System.in);
		int a[], b[], c[], i;
		
		a = new int[10];
		b = new int[10];
		c = new int[10];
		
		System.out.println("Digite o valor de A");
		for (i=0; i<10; i++) {
			a[i] = leia.nextInt();}
		
		System.out.println("Digite os valor de B");
		for (i=0; i<10; i++) {
			b[i] = leia.nextInt();
		}
		
		for (i=0; i<10; i++) {
			c[i]= a[i]+ b[i];
			System.out.println(c[i]);
		}
}
}
