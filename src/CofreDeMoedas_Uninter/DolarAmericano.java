package CofreDeMoedas_Uninter;

public class DolarAmericano extends Moeda {
	
	public DolarAmericano(double valor) {
		this.valor = valor;
	}

	@Override
	public void info() {
		System.out.println("Dólar - " + valor);
	}

	@Override
	public double converter() {
		// Valor (R$5,00) em 24/03/2024.
		double taxaDeCambio = 5.00;
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
		
		DolarAmericano objDolar = (DolarAmericano) obj;
		
		return Double.compare(objDolar.valor, valor) == 0;
	}
}
