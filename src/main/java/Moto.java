
public class Moto extends Veiculo {
	
	protected int cilindradas;
	
	public Moto(String modelo, int ano, int cilindradas) {
		super(modelo, ano);
		this.cilindradas = cilindradas;
	}
	
	public String imprimirDetalhes() {
		return super.imprimirDetalhes() + ", Cilindradas: " + cilindradas;
	}
	

}
