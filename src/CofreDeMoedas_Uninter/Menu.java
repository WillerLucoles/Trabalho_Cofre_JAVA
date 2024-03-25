package CofreDeMoedas_Uninter;

import java.util.Scanner;

public class Menu {

	private Scanner sc; // Objeto para leitura de entrada do usuário
	private Cofre cofre; // Objeto que representa o cofrinho com as moedas

	public Menu() {
		sc = new Scanner(System.in); // Inicializa o objeto de leitura
		cofre = new Cofre(); // Inicializa o objeto do cofrinho vazio
	}

	// Método que exibe o menu principal e lê a opção selecionada pelo usuário
	public void mostrarMenuPrincipal() {
		
	    System.out.println("---COFRE UNINTER---");
	    System.out.println("RU: 1351633\n");

	    System.out.println("Selecione uma das opções abaixo:");
	    System.out.println("1- Adicionar moeda");
	    System.out.println("2- Remover moeda");
	    System.out.println("3- Listar moedas");
	    System.out.println("4- Calcular valor total convertido para real");
	    System.out.println("0- Encerrar\n");
	    

		int opcaoSelec = sc.nextInt(); // Lê a opção digitada pelo usuário

		switch (opcaoSelec) {
			case 0:
				System.out.println("Sistema encerrado, obrigado!");
				return;

			case 1:
				adicionarMoeda();
				break;

			case 2:
				removerMoeda();
				break;

			case 3:
				cofre.listarMoedas();
				break;

			case 4:
				double valorTotalConvertido = cofre.calcularTotalConvertido();
				System.out.println("Valor total convertido para real: " + valorTotalConvertido);
				break;

			default:
				System.out.println("Opção inválida.");
				break;
		}
		mostrarMenuPrincipal(); // Volta ao menu principal
	}

	// Método para adicionar moeda
	private void adicionarMoeda() {
		
		System.out.println("Escolha a moeda:");
		System.out.println("1- Real(BLR)");
		System.out.println("2- Dólar(USD)");
		System.out.println("3- Euro(EUR) ");
		

		int tipoMoeda = sc.nextInt(); // Lê a opção de moeda digitada pelo usuário

		System.out.println("Digite o valor: ");

		double valorMoeda = sc.nextDouble(); // Lê o valor da moeda digitado pelo usuário

		Moeda moeda = criarMoeda(tipoMoeda, valorMoeda);

		if (moeda != null) {
			cofre.adicionar(moeda); // Adiciona a moeda criada no cofrinho
			System.out.println("Moeda adicionada!");
		} else {
			System.out.println("Opção de moeda inválida.");
		}
	}

	// Método para remover moeda
	private void removerMoeda() {
		
		System.out.println("Escolha a moeda:");
		System.out.println("1- Real(BLR)");
		System.out.println("2- Dólar(USD)");
		System.out.println("3- Euro(EUR) ");
		

		int tipoMoeda = sc.nextInt(); // Lê a opção de moeda digitada pelo usuário

		System.out.println("Digite o valor:");

		double valorMoeda = sc.nextDouble(); // Lê o valor da moeda digitado pelo usuário

		Moeda moeda = criarMoeda(tipoMoeda, valorMoeda);

		if (moeda != null) {
			cofre.remover(moeda); // Remove a moeda do cofre
			System.out.println("Moeda removida!");
		} else {
			System.out.println("Opção de moeda inválida.");
		}
	}

	// Método para criar objeto Moeda com base na opção do usuário
	private Moeda criarMoeda(int tipoMoeda, double valor) {
		switch (tipoMoeda) {
			case 1:
				return new Real(valor);
			case 2:
				return new DolarAmericano(valor);
			case 3:
				return new Euro(valor);
			default:
				return null;
		}
	}
}
