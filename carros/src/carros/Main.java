package carros;

public class Main {

	public static void main(String[] args) {

		Estrada estrada = new Estrada();
		
		estrada.addCarro(Fabrica.criarNovoCarro("Uno"));
		estrada.addCarro(Fabrica.criarNovoCarro("Fusca"));
		estrada.addCarro(Fabrica.criarNovoCarro("Ferrari"));
		estrada.addCarro(Fabrica.criarNovoCarro("Gol"));
		
		estrada.start();
	}

}
