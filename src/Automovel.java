import java.util.ArrayList;

public class Automovel {
	
	
	private int km;
	private int ano;
	private String marca;	
	private String modelo;
	private float valor;
	
	public ArrayList<String>dono = new ArrayList();
	

	
	

	

	


	public Automovel(int km, int ano, String marca, String modelo, float valor) {
		super();
		this.km = km;
		this.ano = ano;
		this.marca = marca;
		this.modelo = modelo;
		this.valor = valor;
		
	}






	@Override
	public String toString() {
		return "Automovel [km=" + km + ", ano=" + ano + ", marca=" + marca + ", modelo=" + modelo + ", valor=" + valor
				+ ", dono=" + dono + "]";
	}






	public void addProprietario( String cpf) {
		dono.add(cpf);	       
        
	}
	

	public void removerProprietario(String cpf){
		dono.remove(cpf);
	} 
	
	public void exibirProprietario() {
		
		for(var j: dono) {
		
		System.out.println(j);
		}
		}



	public int getKm() {
		return km;
	}



	public void setKm(int km) {
		this.km = km;
	}



	public int getAno() {
		return ano;
	}



	public void setAno(int ano) {
		this.ano = ano;
	}



	public String getMarca() {
		return marca;
	}



	public void setMarca(String marca) {
		this.marca = marca;
	}



	public String getModelo() {
		return modelo;
	}



	public void setModelo(String modelo) {
		this.modelo = modelo;
	}



	public float getValor() {
		return valor;
	}



	public void setValor(float valor) {
		this.valor = valor;
	}



	public ArrayList<String> getDono() {
		return dono;
	}



	public void setDono(ArrayList<String> dono) {
		this.dono = dono;
	}	
	


	
	
	

}