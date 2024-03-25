package CofreDeMoedas_Uninter;

import java.util.ArrayList;
import java.util.List;

public class Cofre {
	
	private List<Moeda> listaMoedas; // Lista para armazenar as moedas.
	
	public Cofre() {
		this.listaMoedas = new ArrayList<>(); // Inicializa a lista de moedas.
	}
	
	public void adicionar(Moeda moeda) {
		this.listaMoedas.add(moeda); // Adiciona uma moeda na lista.
	}
	
	public void remover(Moeda moeda) {
		this.listaMoedas.remove(moeda); // Remove uma moeda da lista.
	}
	
	public void listarMoedas() {
		if (this.listaMoedas.isEmpty()) {
			System.out.println("Cofre Vazio :("); // Mensagem se o cofre estiver vazio.
			return;
		}
		
		for (Moeda moeda : this.listaMoedas) {
			moeda.info(); // Mostra informações de cada moeda.
		}
	}
	
	public double calcularTotalConvertido() {
		if (this.listaMoedas.isEmpty()) {
			return 0; // Retorna 0 se o cofre estiver vazio.
		}
		double valorAcumulado = 0; // Variável para armazenar o valor total convertido.
		
		for (Moeda moeda : this.listaMoedas) {
			valorAcumulado += moeda.converter(); // Soma o valor convertido de cada moeda.
		}
		return valorAcumulado; // Retorna o valor total acumulado convertido em R$.
	}
}
