package carrinhos;

public class RodarProjeto {
	public static void main(String[] args) {
		Carro carro1 = new Carro();
		Moto moto1 = new Moto();
		Bicicleta bicicleta1 = new Bicicleta();
		Veiculo veiculo1 = new Veiculo();
		Veiculo veiculo2 = new Veiculo();
		Veiculo veiculo3 = new Veiculo();
		
		veiculo1.setCor("Vermelho");
		veiculo1.setModelo("Evoque");
		carro1.setBanco("Couro");
		carro1.setEstepe("Sim");
		carro1.setPortaMalas("591 Litros");
		
		System.out.println("Informações do carro");
		System.out.println("Modelo:" +veiculo1.getModelo()+"\n"+
				"Cor:" +veiculo1.getCor()+ "\n"+
				"Revestiemnto do banco:" +carro1.getBanco()+"\n"+
				"Possui estepe:" +carro1.getEstepe()+"\n"+
				"Tamanho do porta malas:" +carro1.getPortaMalas()+"\n");
		
		veiculo1.locomover();
		
		System.out.println("----------------------------------------------");
		
		veiculo2.setCor("Preto");
		veiculo2.setModelo("F 750 GS");
		moto1.setBau("Não possui baú");
		moto1.setAro("21");
		moto1.setCombustivel("Gasolina");
		
		System.out.println("Informações de moto");
		System.out.println("Modelo:" +veiculo2.getModelo()+"\n"+
				"Cor:" +veiculo2.getCor()+ "\n"+
				"Possui baú" +moto1.getBau()+"\n"+
				"Tamanho aro:" +moto1.getAro()+"\n"+
				"Tipo combustivel:" +moto1.getCombustivel()+"\n");
		
		moto1.grau();
	  
		System.out.println("----------------------------------------------");
		
		veiculo3.setCor("Prata");
		veiculo3.setModelo("Sense Rock Evo");
		bicicleta1.setSelim("Selim Gios Pro-gi 1108");
		bicicleta1.setGarupa("Não");
		bicicleta1.setGuidao("Guidão Riser");
		
		System.out.println("Informações da Bicicleta");
		System.out.println("Modelo:" +veiculo3.getModelo()+"\n"+
				"Cor:" +veiculo3.getCor()+ "\n"+
				"Possui garupa:" +bicicleta1.getGarupa()+"\n"+
				"Modelo guidão:" +bicicleta1.getGuidao()+"\n"+
				"Modelo selim:" +bicicleta1.getSelim()+"\n");
		
		veiculo3.frear();
	}
}
