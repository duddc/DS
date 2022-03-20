import java.util.Scanner;
public class TesteCirculo {
	
		public static void main (String[] args) {
			
			Scanner in = new Scanner (System.in);
			Circulo circulo1 = new Circulo();
			
			System.out.println("Digite o raio do circulo:  ");
			circulo1.raio = in.nextDouble();
			
			System.out.println("Digite a cor do circulo:  ");
			circulo1.cor = in.next();
			
			//EXIBIR DADOS
			
				/*System.out.println("Dados do circulo:   ");
				System.out.println("raio:" +circulo1.raio);
				System.out.println("cor:  " +ciruclo1.cor);*/
				
				
			//METODOS
				// METODO COM RETORNO SEM PARAMETROS
				circulo1.exibirDados();
				System.out.println("A área do circulo é igual: "+circulo1.calcularArea());
				
				System.out.println("------------------------------------");
				
				
				// METODO SEM RETORNO COM PARAMETROS
				circulo1.atribuirExibir(5, "pretinho basico");
				
				System.out.println("------------------------------------");
				
				//METODO COM RETORNO E PARAMETROS
				
				System.out.println("A área do retângulo é igual: "+circulo1.atribuirCalcularExibir(2, "vermelhinho"));
		}
	}

