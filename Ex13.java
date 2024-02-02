package metodos;


import java.util.Scanner;

public class Ex13 {

	static Scanner e = new Scanner(System.in);


	static String[][] arrayHDados = new String[5][2];
	static int[][] arrayHNumero = new int[5][2];

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] arrayNomeProduto = new String[] { "Refrigerante Lata", "Água sem gás", "Água com gás",
				"Suco de Laranja", "Barra de Chocolate" };

		double[] arrayPrecoProduto = new double[] { 2.80, 1.90, 2.10, 2.30, 4.90 };
		String[] arrayNomeServico = new String[] { "Lavanderia", "Sauna", "Almoço", "Café da Manhã", "Jantar" };
		double[] arrayPrecoServico = new double[] { 10.50, 60.80, 42.90, 35.60, 60.40 };

		for (int i = 0; i < 5; i++) {
			System.out.println("Digite o nome do " + (i + 1) + "° hospede");
			arrayHDados[i][0] = e.next();

			System.out.println("Digite o tipo de hospedagem do cliente: " + arrayHDados[i][0]);
			System.out.println("S - (Single)\nD - (Double)\nSL - (Suite Luxo)\nSr (Suite Presidencial)");
			arrayHDados[i][1] = e.next();

			while (!(arrayHDados[i][1].equalsIgnoreCase("S") || (arrayHDados[i][1].equalsIgnoreCase("D")
					|| (arrayHDados[i][1].equalsIgnoreCase("SL") || (arrayHDados[i][1].equalsIgnoreCase("SR")))))) {

				System.out.println("Tipo de hospedagem inválido, digite novamente:");
				System.out.println("S - (Single)\nD - (Double)\nSL - (Suite Luxo)\nSR (Suite Presidencial)");
				arrayHDados[i][1] = e.next();

			}

			arrayHNumero[i][0] = i + 1;
			System.out.println("Número do quarto " + arrayHNumero[i][0]);

			System.out.println("Digite a quantidade de diárias do cliente: " + arrayHDados[i][0]);
			arrayHNumero[i][1] = e.nextInt();

		}

		int consumo[][] = qtdConsumoDeProdutos(arrayNomeProduto);

		int servicos[][] = consumoServicos(arrayNomeServico);
		
		gerarRelatorioGerencial(consumo,servicos, arrayPrecoServico,
				arrayPrecoProduto, valorEstadia());

	}// main

	public static int[][] qtdConsumoDeProdutos(String[] arrayNomeProduto) {

		int consumo[][] = new int[5][5];

		for (int i = 0; i < 5; i++) {
			System.out.println("Hospede " + (i + 1));

			for (int j = 0; j < 5; j++) {
				System.out.println("Informe a quantidade consumida do produto: " + arrayNomeProduto[j]);
				consumo[i][j] = e.nextInt();

			}

		}
		return consumo;
	}

	public static int[][] consumoServicos(String[] arrayNomeServico) {

		int servicos[][] = new int[5][5];

		for (int i = 0; i < 5; i++) {
			System.out.println("Hospede " + (i + 1));

			for (int j = 0; j < 5; j++) {
				System.out.println("Informe a quantidade consumida do serviço: " + arrayNomeServico[j]);
				servicos[i][j] = e.nextInt();

			}

		}
		return servicos;

	}

	public static double[] valorEstadia() {

		double valorEstadia[] = new double[5];

		for (int i = 0; i < 5; i++) {
			if (arrayHDados[i][1].equalsIgnoreCase("S")) {
				valorEstadia[i] = 245;
			} else {
				if (arrayHDados[i][1].equalsIgnoreCase("D")) {
					valorEstadia[i] = 280;
				} else {
					if (arrayHDados[i][1].equalsIgnoreCase("SL")) {
						valorEstadia[i] = 310;
					} else {
						valorEstadia[i] = 400;
					}
				}
			}
		}

		return valorEstadia;
	}

	public static void gerarRelatorioGerencial(int[][] consumo, int[][] servicos, double[] arrayPrecoServico,
			double[] arrayPrecoProduto, double [] valorEstadia) {

		double totConsumo[] = new double[5];
		double totServico[] = new double[5];
		double totGeral [] = new double [5];
		double totDiaria [] = new double [5];

		System.out.println("Relatório gerencial diárias Hotel Boa Viagem");
		
		
			for (int i = 0; i < 5; i++) {
				System.out.println("Quarto " + arrayHNumero[i][0]);
				System.out.println("Nome do cliente " + arrayHDados[i][0]);
				System.out.println("Tipo de acomodação: " + arrayHDados[i][1]);
				System.out.println("Quantidade de diárias: " + arrayHNumero[i][1]);
				System.out.println("Valor total das diárias R$" + totGeral[i]);
			}
		
		
		System.out.println("--------------------------------------------------------------");

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				totConsumo[i] = consumo[i][j] * arrayPrecoProduto[i];
				System.out.println("O total do consumo de produtos do hospede: " + arrayHDados[i][0] );
				totServico[i] = servicos[i][j] * arrayPrecoServico[i];
				System.out.println("O total do consumo de serviços do hospede: " + arrayHDados[i][0] );
				totGeral[i] = totServico[i] + totConsumo[i] + valorEstadia[i];
				System.out.println("O total de diárias do hospede: " + arrayHDados[i][0] );
				totDiaria [i] = valorEstadia [i] * arrayHNumero[i][1]; 
				
			}

		}
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("QUARTO  |  CLIENTE |  TOTAL DIÁRIAS  |  TOTAL SERVIÇOS  | TOTAL PRODUTO ");
		
		for (int i = 0; i < 5; i++) {
			// QUARTO
			System.out.print(arrayHNumero[i][0]);
			
			//NOME CLIENTE 
			System.out.print("\t\t" + arrayHDados[i][0]);
			
			// TOTAL DIÁRIA 
			System.out.print("\t\t" + (totDiaria[i]));
			
			//TOTAL SERVIÇO
			System.out.print("\t\t" + (totServico[i]));
		
			//TOTAL GERAL 
			System.out.print("\t\t" + (totGeral[i]));
			System.out.print("");
			}
		}

	}


