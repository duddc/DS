package carrinhos;

public class Carro {
	
	String banco;
	String portaMalas;
	String estepe;
	
	public String getBanco() {
		return banco;
	}
	public void setBanco(String banco) {
		this.banco = banco;
	}
	public String getPortaMalas() {
		return portaMalas;
	}
	public void setPortaMalas(String portaMalas) {
		this.portaMalas = portaMalas;
	}
	public String getEstepe() {
		return estepe;
	}
	public void setEstepe(String estepe) {
		this.estepe = estepe;
	}
	
	public void infoCarro() {
		System.out.println("Qual o modelo do banco?" +getBanco());
		System.out.println("Qual o tamanho do porta malas (em litros)?" +getPortaMalas());
		System.out.println("Possui estepe?" +getEstepe());
	}
}
