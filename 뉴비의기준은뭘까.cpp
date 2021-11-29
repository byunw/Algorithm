#include <iostream>
using namespace std;

int main(){
  
  int n,m;
  
  cin >> n >> m;
  
  //newbie
  if(m<=2){
     cout << "NEWBIE!" << '\n';
  }
  
  //oldbie
  else if(m>=3 && m<=n){
     cout << "OLDBIE!" << '\n'; 
  }
  
  //TLE
  else{
     cout << "TLE!" << '\n';
  }  
  
  return 0;
  
}
  
  
  
  

  
  
