package carros;

import java.util.ArrayList;
import java.util.List;

public class Estrada {
	
	private String nome;
	private double extensao;
	private double veloMax;
	
	private List<Carro> carros = new ArrayList<Carro>();
	
	
	/*métodos de controle*/
	
	public void start() {
		acelerarTodosCarros();
	}
	
	
	private void acelerarTodosCarros() {
		
		
	}












	public void addCarro(Carro carro) {
		this.carros.add(carro);
	}
	
	public void removeCarro(Carro carro) {
		this.carros.remove(carro);
	}
	
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getExtensao() {
		return extensao;
	}

	public void setExtensao(double extensao) {
		this.extensao = extensao;
	}

	public double getVeloMax() {
		return veloMax;
	}

	public void setVeloMax(double veloMax) {
		this.veloMax = veloMax;
	}

	public List<Carro> getCarros() {
		return carros;
	}

	public void setCarros(List<Carro> carros) {
		this.carros = carros;
	}
	
	

}
