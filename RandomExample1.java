package EjerciciosTablas;

import java.util.Scanner;

public class RandomExample1
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		String[] tabla = new String [10];
		String respuesta1, respuesta2, respuesta3;
		
		tabla[0] = "¿Cuántos días tiene una semana?";
		tabla[1] = "¿Cuántos meses tiene un año?";
		tabla[2] = "¿Quién escribió La Odisea?";
		tabla[3] = "¿Quién escribió El Quijote?";
		tabla[4] = "¿Cuántos planetas hay en el Sistema Solar?";
		tabla[5] = "¿Qué país tiene forma de bota?";
		tabla[6] = "¿Qué moneda se utiliza en Reino Unido?";
		tabla[7] = "¿Cuántas patas tiene una araña?";
		tabla[8] = "¿Cual es el nombre de la lengua oficial en China?";
		tabla[9] = "¿Quién es el mejor profesor de GrupoStudium, además del más guapo y más gracioso?";
		
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
