package Array;

import java.util.Scanner;

public class ArrayVetor2 {

	public static void main(String[] args) {
		
		int vet[] = new int[10];
		int somavetor=0,x;
		float mediavet;
		
		Scanner leia = new Scanner(System.in);
		
		for(x=0;x<10;x++) {
			System.out.println("\nEntre com um numero: ");
			vet[x] = leia.nextInt();
			somavetor += vet[x];
		}
		System.out.print("pares: ");
		for(x=0;x<10;x++) {
			if(vet[x]% 2 == 0) {
				System.out.print(vet[x]+ " ");
			}
			
		}
		System.out.print("\nimpares: ");
		for(x=0;x<10;x++) {
			if(vet[x]% 2 == 1) {
				System.out.print(vet[x]+ " ");
			}
		}
		mediavet = somavetor / 10;
		System.out.println("\nSoma dos elementos do vetor: "+somavetor);
		System.out.println("\nA media dos elementos do vetor é:"+mediavet);
	



	}

}
