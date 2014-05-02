/**
 * Autor    : Antonio Mamani
 * Email    : antonio.mq@gmail.com
 * Problema : http://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&page=show_problem&problem=2542
 * Estado   : Accepted
 * */
import java.util.Scanner;
public class Automatic {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int n, sol;
		for (int j = 0; j < t; j++) {
			n = sc.nextInt();
			sol = (((((n*567)/9)+7492)*235)/47)-498;
			System.out.println( Math.abs((sol/10)%10));
		}
	}
}
