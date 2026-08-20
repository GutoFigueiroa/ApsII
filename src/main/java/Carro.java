
public class Carro extends Veiculo{
	
	protected int numPortas;
	
	public Carro(String modelo, int ano, int numPortas) {
		super(modelo, ano);
		this.numPortas = numPortas;
	}

	public String imprimirDetalhes() {
		return super.imprimirDetalhes() + ", Número de portas: " + numPortas;
	}

}
