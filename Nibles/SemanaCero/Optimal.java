/**
 * Autor    : Antonio Mamani
 * Email    : antonio.mq@gmail.com
 * Problema : http://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&page=show_problem&problem=2349
 * Estado   : Accepted
 * */
import java.util.Scanner;
public class Optimal {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int n, x, min = 100, may = 0;
		for (int i = 0; i < t; i++) {
			n = sc.nextInt();
			min = 100; 
			may = 0;
			for (int j = 0; j < n; j++) {
				x = sc.nextInt();
				if (x > may) may = x;
				if (x < min) min = x;
			}
			System.out.println(2*(may-min));
		}
	}
}
