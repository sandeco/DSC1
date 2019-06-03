package carros;

import java.util.ArrayList;
import java.util.List;

public class Carro {
	
	private String placa;
	private String marca;
	private String modelo;
	private double velocidadeAtual;
	private double velocidadeMaxima;
	private Motor motor;
	private List<Roda> rodas;
	
	
	public Carro() {
		 rodas = new ArrayList<Roda>();
	}
	
	/*métodos de ações*/ 
	public void acelerar() {
		System.out.println(modelo + " acelerando");
	}
	
	/*métodos de ações*/ 
	public void freiar() {
		System.out.println(modelo + " freiando");
	}
	
	
	

	
	public void addRoda(Roda roda) {		
		if(rodas.size()<4)
			rodas.add(roda);
	}
	
	public void removeRoda(Roda roda) {
		rodas.remove(roda);
	}
	
	
	public List<Roda> getRodas() {
		return rodas;
	}


	public void setRodas(List<Roda> rodas) {
		this.rodas = rodas;
	}


	
	











	private Banco banco;
	private Som som;
	
	
	

	
	
	
	


	public Banco getBanco() {
		return banco;
	}

	public void setBanco(Banco banco) {
		this.banco = banco;
	}

	public Som getSom() {
		return som;
	}

	public void setSom(Som som) {
		this.som = som;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
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

	public double getVelocidadeAtual() {
		return velocidadeAtual;
	}

	public void setVelocidadeAtual(double velocidadeAtual) {
		this.velocidadeAtual = velocidadeAtual;
	}

	public double getVelocidadeMaxima() {
		return velocidadeMaxima;
	}

	public void setVelocidadeMaxima(double velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}

	
	
	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}
	
	
	

}
