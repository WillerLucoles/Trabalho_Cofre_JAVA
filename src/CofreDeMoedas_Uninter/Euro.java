package CofreDeMoedas_Uninter;

public class Euro extends Moeda {
	
	public Euro(double valor) {
		this.valor = valor;
	}

	@Override
	public void info() {
		System.out.println("Euro - " + valor);
	}

	@Override
	public double converter() {
		// Valor (R$5,41) em 24/03/2024.
		double taxaDeCambio = 5.41;
		return this.valor * taxaDeCambio;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null || getClass() != obj.getClass()) {
			return false;
		}
		
		Euro objEuro = (Euro) obj;
		
		return Double.compare(objEuro.valor, valor) == 0;
	}
}
