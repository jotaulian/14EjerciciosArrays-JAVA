package EjerciciosTablas;

import java.util.Scanner;

public class RandomExample1
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		String[] tabla = new String [10];
		String respuesta1, respuesta2, respuesta3;
		
		tabla[0] = "�Cu�ntos d�as tiene una semana?";
		tabla[1] = "�Cu�ntos meses tiene un a�o?";
		tabla[2] = "�Qui�n escribi� La Odisea?";
		tabla[3] = "�Qui�n escribi� El Quijote?";
		tabla[4] = "�Cu�ntos planetas hay en el Sistema Solar?";
		tabla[5] = "�Qu� pa�s tiene forma de bota?";
		tabla[6] = "�Qu� moneda se utiliza en Reino Unido?";
		tabla[7] = "�Cu�ntas patas tiene una ara�a?";
		tabla[8] = "�Cual es el nombre de la lengua oficial en China?";
		tabla[9] = "�Qui�n es el mejor profesor de GrupoStudium, adem�s del m�s guapo y m�s gracioso?";
		
		 // generate random numbers  
        int a = (int) Math.floor(Math.random()*(tabla.length));
        int b = (int) Math.floor(Math.random()*(tabla.length));
        int c = (int) Math.floor(Math.random()*(tabla.length));
        
       String pregunta1 = tabla[a];
       String pregunta2 = tabla[b];
       String pregunta3 = tabla[c];
        
//        for(int i=0;i<longitudTabla;i++) {
//        	respuesta1 = i * (int) Math.floor(Math.random());
//        	System.out.println(respuesta1);
//        }
        // Output is different every time this code is executed    
        System.out.println(pregunta1);  
        System.out.println(pregunta2); 
        System.out.println(pregunta3);
        teclado.close();
	}

}
