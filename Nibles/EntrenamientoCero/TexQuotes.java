/**
 * Autor    : Antonio Mamani
 * Email    : antonio.mq@gmail.com
 * Problema : http://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&page=show_problem&problem=208
 * Estado   : Accepted
 * */
import java.util.Scanner;
class TexQuotes{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        String lines, solution = "";
        char verify;
        boolean open = true;
        while(sc.hasNext())
        {
            lines = sc.nextLine();
            for(int i=0; i< lines.length();i++)
            {
               verify = lines.charAt(i);
               if(verify == '\"'){
                    if(open){
                        solution+="``";
                        open = false;
                    }else{
                        solution+="''";
                        open = true;
                    }               
               }else{
                    solution+=verify+"";
               }
            }
            System.out.println(solution);
            solution = "";
        }
    }
}
