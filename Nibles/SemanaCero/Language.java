/**
 * Autor    : Antonio Mamani
 * Email    : antonio.mq@gmail.com
 * Problema : http://uva.onlinejudge.org/index.php?option=onlinejudge&page=show_problem&problem=3402
 * Estado   : Accepted
 * */
import java.util.Scanner;
import java.util.TreeMap;

public class Language {

	public static void main(String[] args) 
	{
		TreeMap<String,String> languages=new TreeMap<String,String>();
		languages.put("HELLO", "ENGLISH");
		languages.put("HOLA", "SPANISH");
		languages.put("HALLO", "GERMAN");
		languages.put("BONJOUR", "FRENCH");
		languages.put("CIAO", "ITALIAN");
		languages.put("ZDRAVSTVUJTE", "RUSSIAN");
		
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();

		int cases = 1;
	    while(line.compareTo("#")>0)
	    {
	    	if(languages.containsKey(line)){
	    		System.out.println("Case "+cases+": "+languages.get(line));
	    	}else{
	    		System.out.println("Case "+cases+": "+"UNKNOWN");
	    	}
			cases++;
			line = sc.nextLine();
		}
	}
}
