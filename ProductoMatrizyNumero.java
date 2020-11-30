package EjerciciosTablas;

import java.util.Scanner;

public class ProductoMatrizyNumero
{

	public static void main(String[] args)
	{
		final int FILAS = 3;
		final int COLUMNAS = 3;
		int numero, i,j;
		int matriz[][] = new int[FILAS][COLUMNAS];
		int matriz2[][] = new int[FILAS][COLUMNAS];
		Scanner teclado = new Scanner(System.in);
		
//		Pedimos numero por teclado
		System.out.println("Dame un número: ");
		numero = teclado.nextInt();
		
//		Realizamos bucle para rellenar la matriz por teclado:
		for(i=0;i<FILAS;i++) {
			for(j=0;j<COLUMNAS;j++) {
				System.out.println("Dame la posición ["+ i +"][" + j + "] = ");
				matriz[i][j] = teclado.nextInt();
			}
		}
		teclado.close();
		
//		Hacemos bucle para matriz2 y multiplicamos cada valor de matriz por el numero otorgado anteriormente.
		for(i=0;i<FILAS;i++) {
			for(j=0;j<COLUMNAS;j++) {
				matriz2[i][j] = (matriz[i][j] * numero);
			}
		}
		
//		Mostramos resultado de la matriz2:
		for(i=0;i<FILAS;i++) {
			for(j=0;j<COLUMNAS;j++) {
				System.out.print("\t" + matriz2[i][j]);
			}
			System.out.println();
		}
		
		
	}

}
