/**
 * Author: Antonio
 * Problem: 3n+1 
 * Judge: UVA
 * Status: Acepted
 * P2 from Sheet 'Entrenamiento 0' from ahmed-aly.com
 * http://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&page=show_problem&problem=36
 * */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Tresn {

    static int secuencia(int numero){
        int contador = 1;
        while(numero>1)
        {
    		if(numero%2==0)
            {
   				numero=numero/2;
   			}
            else
            {
  				numero=numero * 3 + 1;
   			}
   			contador++; 
     	}
        return contador;
    }

	static int encontrarCongeturaMayor(int min, int max){
		int congetura = 0, mayor = 0;
		for (int i = min; i <= max; i++)
        {
    		congetura=secuencia(i);
    		if(congetura>=mayor)
    			mayor=congetura;
        }
		return mayor;
	}
	
  public static void main(String[] args) throws Exception{
    //BufferedReader es una de las clases de lectura más eficientes
    BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
    
    //StringTokenizer nos sirve para parsear las entradas que lee el BufferedReader
    StringTokenizer tokens;
    
    //StringBuild maneja una secuencia de caracteres mutables, el cual no ocurre con la clase String 
    StringBuilder solucion = new StringBuilder();
    
    int clonmin, clonmax, max, min, respuesta;

    //Leemos la primera linea
    String linea = scan.readLine();

    while(linea != null && !linea.isEmpty())
    {
    	tokens = new StringTokenizer(linea);
    	min = Integer.parseInt(tokens.nextToken());
    	max = Integer.parseInt(tokens.nextToken());
    	clonmin=min;
        clonmax=max;
    
        if(min>max)
        {
    		clonmin=max;
    		clonmax=min;
    	}
    	respuesta = encontrarCongeturaMayor(clonmin, clonmax);
        //apilamos la solución
    	solucion.append(min).append(" ").append(max).append(" ").append(respuesta).append("\n");

    	linea = scan.readLine();
    }
    //imprimimos una sola vez
    System.out.print(solucion);
  }
}
