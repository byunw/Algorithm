
#include <iostream>
using namespace std;

int n0;

int main(){

    ios_base::sync_with_stdio(0);
    cin.tie(0);

    char n1_status='z';
    int case_num=1;
    
    while(true){    

        cin >> n0;

        if(n0==0){
           break; 
        }

        int n1=(3*n0);
        int n2;
        if(n1%2==0){
           n1_status='e';
           n2=n1/2;
        }

        else{
            n1_status='o';
            n2=(n1+1)/2;          
        }

        int n3=(3*n2); 
        int n4=(n3/9);//n4값은 구해짐

        if(n1_status=='e'){
           cout << case_num;
           cout << ". ";
           cout << "even ";
           cout << n4 << '\n';
        }

        if(n1_status=='o'){
           cout << case_num;
           cout << ". ";
           cout << "odd ";
           cout << n4 << '\n';
        }

        case_num++; 

    }  

    return 0;
}