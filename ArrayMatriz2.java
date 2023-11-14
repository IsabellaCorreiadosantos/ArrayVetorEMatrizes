package Array;

import java.util.Scanner;

public class ArrayMatriz2 {

	public static void main(String[] args) {
		
		
		float part[][] = new float[10][4];
		float media[] = new float[10];
		int x,y;
		
		
		float somanota=0;
		
		Scanner leia = new Scanner(System.in);
		
		for(x=0;x<10;x++) {
			for(y=0;y<4;y++) {
				System.out.println("\nEntre com a "+(y+1)+"a. nota: ");
				part[x][y] = leia.nextFloat();
				somanota += part[x][y];
			}
			media[x] = somanota/4;
			somanota = 0;
		}
		for(x=0;x<10;x++) {
			System.out.println("\nMedia do participante "+(x+1)+"foi de: "+media[x]);
		}
		

	}

}
