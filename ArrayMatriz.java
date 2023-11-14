package Array;

import java.util.Scanner;

public class ArrayMatriz {

	public static void main(String[] args) {
		
		int matriz[][] = new int[3][3];
		int DiagonalPrincipal=0,DiagonalSecundaria=0,EleDiagonalPrin=0,EleDiagonalSecun=0;
		Scanner leia = new Scanner(System.in);
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.println("\ninforme: ");
				matriz[i][j] = leia.nextInt();
			}
		}
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.println("["+matriz[i][j]+"]");
				
		
			}
		}
		
		
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				
				if(i==j) {
					DiagonalPrincipal = DiagonalPrincipal + matriz[i][j];
				}
			}
		}
		
		System.out.println("\nElementos da Diagonal Principal:"+DiagonalPrincipal);
		
		

		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				
				if(i==j) {
					DiagonalSecundaria = DiagonalSecundaria + matriz[i][j];
				}
			}
		}
		
		System.out.println("\nElementos da Diagonal Principal:"+DiagonalSecundaria);
				
				
	
		
	}
}


