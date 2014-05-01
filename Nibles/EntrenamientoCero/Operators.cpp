 /**
 * Autor    : Antonio Mamani
 * Email    : antonio.mq@gmail.com
 * Problema : http://uva.onlinejudge.org/index.php?option=onlinejudge&page=show_problem&problem=2113
 * Estado   : Accepted
 * */ 

#include <iostream>
using namespace std;

int main(){
    int tinteger, a, b;
    cin >> tinteger;
    for(int i = 0; i<tinteger; i++){
        cin >> a >> b;
        if(a==b){
            cout << "=" << endl;
        }else{
            if(a>b){
                cout << ">" << endl;
            }else{
                cout << "<" << endl;
            }
        }

    }
}
