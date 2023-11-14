package Array;

import java.util.Scanner;

public class ArrayVetor {

	public static void main(String[] args) {
		
		
		int vetor[] = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 };

		float posicao = 0;

		int numeroDigitado = 0, n1;

		Scanner leia = new Scanner(System.in);

		System.out.println("\nDigite o numero que deseja encontrar:");
		numeroDigitado = leia.nextInt();


		for (n1 = 0; n1 < vetor.length; n1++) {
			if (vetor[n1] == numeroDigitado) {
				posicao = n1;
			}
		}
		
		if (posicao != 0) {
			System.out.println("\nO numero "+numeroDigitado+" foi Encontrado e está na Posição: " + posicao);
		} else {
			System.out.println("\nO numero não foi encotrado ");

		}
	}
}