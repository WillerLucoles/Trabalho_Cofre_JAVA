package CofreDeMoedas_Uninter;

public class Real extends Moeda {
	
	public Real(double valor) {
		this.valor = valor;
	}

	@Override
	public void info() {
		System.out.println("Real - " + valor);
	}

	@Override
	public double converter() {
		// A conversão de R$ para R$ é 1:1, retornará o próprio valor.
		return this.valor;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null || getClass() != obj.getClass()) {
			return false;
		}
		
		Real objReal = (Real) obj;
		
		return Double.compare(objReal.valor, valor) == 0;
	}
}
