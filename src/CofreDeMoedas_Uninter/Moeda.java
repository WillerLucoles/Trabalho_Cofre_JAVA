package CofreDeMoedas_Uninter;

public abstract class Moeda {
	
	protected double valor; // Atributo para armazenar o valor da moeda.
	
	public abstract void info(); // Método abstrato para exibir informações da moeda.
	public abstract double converter(); // Método abstrato para converter o valor da moeda.

}
