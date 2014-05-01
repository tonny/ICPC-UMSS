import java.util.Scanner;
class TexQuotes{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        String lines, solution = "";
        char verify;
        boolean open = true;
        while(sc.hasNext()){
            lines = sc.nextLine();
            for(int i=0; i< lines.length();i++){
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
