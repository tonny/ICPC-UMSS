/**
 * Autor    : Antonio Mamani
 * Email    : antonio.mq@gmail.com
 * Problema : http://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&page=show_problem&problem=2493
 * Estado   : Accepted
 * */
import java.util.Scanner;
public class Division {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k, n, m, x, y;
		k = sc.nextInt();
		while(k!=0){
			n = sc.nextInt();
			m = sc.nextInt();
			for(int i=0; i< k;i++){
				x = sc.nextInt();
				y = sc.nextInt();
				
				if (x == n || y == m) {
					System.out.println("divisa");
			    } else{
			    	if (x > n) 
			    	{
			    		if (y < m)
			    			System.out.println("SE");
			    		else 
			    			System.out.println("NE");
				     } else {
				          if (y < m)
				            System.out.println("SO");
				          else
				            System.out.println("NO");
				     }
			    }
			}
			k = sc.nextInt();
		}
	}
}
