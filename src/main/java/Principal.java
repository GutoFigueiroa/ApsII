
public class Principal {

	public static void main(String[] args) {
		
		Veiculo veiculo1 = new Veiculo("GM Celta", 2020);
		System.out.println(veiculo1.imprimirDetalhes());

		Carro carro1 = new Carro("Toyota Corolla", 2022, 4);
		System.out.println(carro1.imprimirDetalhes());

		Moto moto1 = new Moto("Honda CG 160", 2021, 160);
		System.out.println(moto1.imprimirDetalhes());

	}

}
