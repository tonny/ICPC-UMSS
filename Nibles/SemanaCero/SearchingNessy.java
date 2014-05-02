/**
 * Autor    : Antonio Mamani
 * Email    : antonio.mq@gmail.com
 * Problema : http://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&page=show_problem&problem=1985
 * Estado   : Accepted
 * */
import java.util.Scanner;
public class SearchingNessy {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int n,m;
		for (int j = 0; j < i; j++) {
			n = sc.nextInt();
			m = sc.nextInt();
			System.out.println((n/3)*(m/3));
		}
	}
}
