package br.com.erickfreire.comissaodevendas;

import java.util.Scanner;

/**
 * Programa em Java que determina o valor da comissão de vendas
 * @author Erick Freire
 * @version 1 - Criado em 08-06-2021 as 14:16
 */

public class ComissaoDeVendas {
	public static void main(String[] args) {

		String[] tabelaDeGanhos = { "200-299", "300-399", "400-499", "500-599", "600-699", "700-799", "800-899",
				"900-999", "1000 ou mais" };
		int[] sal = new int[10];

		Scanner entrada = new Scanner(System.in);
		double vendas;
		int salarioFinal;

		System.out.print("Informe o valor total de vendas: ");
		vendas = entrada.nextDouble();

		salarioFinal = (int) (200 + (vendas * 0.09));

		System.out.println();

		for (String i : tabelaDeGanhos)
			System.out.printf("%s\t\t", i);
		
		System.out.println();

		if (salarioFinal <= 299)
			sal[0] = 1;

		if (salarioFinal > 299 && salarioFinal <= 399)
			sal[1] = 1;

		if (salarioFinal > 399 && salarioFinal <= 499)
			sal[2] = 1;

		if (salarioFinal > 499 && salarioFinal <= 599)
			sal[3] = 1;

		if (salarioFinal > 599 && salarioFinal <= 699)
			sal[4] = 1;

		if (salarioFinal > 699 && salarioFinal <= 799)
			sal[5] = 1;

		if (salarioFinal > 799 && salarioFinal <= 899)
			sal[6] = 1;

		if (salarioFinal > 899 && salarioFinal <= 999)
			sal[7] = 1;

		if (salarioFinal >= 1000)
			sal[8] = 1;
		
		for(int i : sal) {
			if(i == 1)
				System.out.print("*\t\t");
			else
				System.out.print("\t\t ");
		}

	}

}
