/**
 * Autor    : Antonio Mamani
 * Email    : antonio.mq@gmail.com
 * Problema : http://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&page=show_problem&problem=208
 * Estado   : Accepted
 ** */

#include <iostream>
#include <string>

using namespace std;

int main(){
    string lines, solution;
    bool open = true;
    while(getline(cin,lines))
    {
       for(int i=0;i<lines.length();i++)
       {
            if(lines[i]=='\"'){
                if(open){
                    solution += "``";
                    open = false;
                }else{
                    solution += "''";
                    open = true;
                }               
            }else{
                solution += lines[i];
            }
       }
       cout << solution << endl;
       solution = "";
    }
}
