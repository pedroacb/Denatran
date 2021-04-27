import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		
		var veiculo = new Automovel(1500, 2010, "Ferrari", "Enzo", 1200000);
		
		var veiculo2 = new Automovel(3200, 2003, "Lamborghini", "Murciélago", 800000);
		

		
		var automoveis = new ArrayList<Automovel>();
		automoveis.add(veiculo);
		
		var automoveis2 = new ArrayList<Automovel>();
		automoveis2.add(veiculo2);
		
		veiculo.addProprietario("108.253.758-87");
		veiculo.addProprietario("253.112.556-30");
		System.out.println(veiculo);
		veiculo.exibirProprietario();
		
		veiculo2.addProprietario("115.254.984-50");
		veiculo2.addProprietario("114.153.556-74");
		System.out.println(veiculo2);
		veiculo2.exibirProprietario();
			
		System.out.println();
		
		veiculo.removerProprietario("108.253.758-87");
		System.out.println(veiculo);
		veiculo.exibirProprietario();
		
		veiculo2.removerProprietario("115.254.984-50");
		System.out.println(veiculo2);
		veiculo2.exibirProprietario();
		
		
		
		
		
		
		
		
		
		

	}

}