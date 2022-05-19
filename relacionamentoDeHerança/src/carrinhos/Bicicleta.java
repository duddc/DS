package carrinhos;

public class Bicicleta {

	String selim;
	String garupa;
	String guidao;
	
	public String getSelim() {
		return selim;
	}
	public void setSelim(String selim) {
		this.selim = selim;
	}
	public String getGarupa() {
		return garupa;
	}
	public void setGarupa(String garupa) {
		this.garupa = garupa;
	}
	public String getGuidao() {
		return guidao;
	}
	public void setGuidao(String guidao) {
		this.guidao = guidao;
	}
	
	public void infoBicicleta() {
		System.out.println("Qual o modelo do selim?" +getSelim());
		System.out.println("Possui garupa" +getGarupa());
		System.out.println("Qual o modelo do guidão?" +getGuidao());
	}
	
}
