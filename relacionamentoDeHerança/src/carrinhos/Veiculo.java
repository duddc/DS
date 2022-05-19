package carrinhos;

public class Veiculo {
	String cor;
	String modelo;
	
	/* set e get*/
	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	/*metodos do veiculo */ 
	public void locomover() {
		System.out.println("O veiculo se locomoveu");
	}
	
	public void frear() {
		System.out.println("O veiculo freou");
	}
}
