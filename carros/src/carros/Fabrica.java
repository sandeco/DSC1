package carros;

public class Fabrica {

	
	public static Carro criarNovoCarro(String modelo) {
		Carro carro = new Carro();
		carro.setModelo(modelo);
		
		Roda roda1  = new Roda();
		roda1.setAro(18);
		
		Roda roda2 = new Roda();
		roda2.setAro(18);
		
		Roda roda3 = new Roda();
		roda3.setAro(35);
		
		Roda roda4 = new Roda();
		
		Roda roda5 = new Roda();
		roda5.setAro(35);
		
		carro.addRoda(roda1);
		carro.addRoda(roda2);
		carro.addRoda(roda3);
		carro.addRoda(roda4);
		
		
		carro.removeRoda(roda4);
		
		
		carro.addRoda(roda5);
		
		

		Motor motor = new Motor();
		Banco banco = new Banco();
		Som som = new Som();
			
		carro.setMotor(motor);
		carro.setBanco(banco);
		carro.setSom(som);
		
		
		motor = null;
		som = null;
		banco = null;
		
		return carro;
		
	}
	
}
