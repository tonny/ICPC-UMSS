/**
 * Autor    : Antonio Mamani
 * Email    : antonio.mq@gmail.com
 * Problema : http://uva.onlinejudge.org/index.php?option=onlinejudge&page=show_problem&problem=2113
 * Estado   : Accepted
 * */

import java.util.Scanner;

class Operators{
    public static void main(String arg[])
    {    
        Scanner sc   = new Scanner(System.in);
        int tinteger = sc.nextInt();
        int a,b;
        for(int i=0;i<tinteger;i++)
        {
            a = sc.nextInt();
            b = sc.nextInt();
            if(a==b){
                System.out.println("=");
            }else{
                if(a>b) 
                    System.out.println(">");
                else
                    System.out.println("<");
            }
        }
    }
}
