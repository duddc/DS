 package carrinhos;

public class Moto {
	
	String bau;
	String aro;
	String combustivel;
	
	public String getBau() {
		return bau;
	}
	public void setBau(String bau) {
		this.bau = bau;
	}
	public String getAro() {
		return aro;
	}
	public void setAro(String aro) {
		this.aro = aro;
	}
	public String getCombustivel() {
		return combustivel;
	}
	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}
	
	public void infoMoto() {
		System.out.println("Qual a capacidade do baú (em litros)?" +getBau());
		System.out.println("Qual o tamanho do aro" +getAro());
		System.out.println("Qual o tipo de combustivel" +getCombustivel());
	}
	
	public void grau() {
		System.out.println("BOLOLOLOLOLOLO");
	}
	
}
