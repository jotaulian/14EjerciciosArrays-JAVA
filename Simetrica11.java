package EjerciciosTablas;

import java.util.Scanner;

public class Simetrica11
{
	public static void main(String[] args)
	{
		int tabla[][] = new int[3][3];
		int i, j, contador=0;
		Scanner teclado = new Scanner(System.in);
		for(i=0;i<3;i++) {
			for(j=0;j<3;j++) {
				System.out.println("Dame la posición ["+ i +"][" + j + "] = ");
				tabla[i][j] = teclado.nextInt();
			}
		}
		teclado.close();
		for(i=0;i<3;i++) {
			for(j=0;j<3;j++) {
				if(tabla[i][j] == tabla[j][i]) {
					contador++;
			}else {
				contador--;
			}
		}
	}
		if(contador==9) {
			System.out.println("La tabla es simétrica");
		} else {
			System.out.println("La tabla no es simétrica");
		}
		
		//Muestro el resultado de la suma en una nueva matriz:
				System.out.println("El resultado de la suma de ambas tablas queda así: ");
				for(i=0;i<3;i++) {
					for(j=0;j<3;j++) {
						System.out.print("\t" + " " + tabla[i][j]);
					}
					System.out.println("");
				}
	}

}
