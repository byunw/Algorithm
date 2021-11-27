
#include <iostream>
#include <algorithm>
using namespace std;

int main(){
    
    cin.tie(NULL);
    ios_base::sync_with_stdio(false);
        
    //반의 수 
    int K;

    cin >> K;

    for(int i=0;i<K;++i){
        
        //학생수 
        int N;

        cin >> N;
        
        //학생점수 담을 어레이
        int scores[N];

        //핵생 점수 어레이에 받기 
        for(int z=0;z<N;++z){
            cin >> scores[z];  
        }

        //최고점수 찾아내고 출력해주기
        int maximum=scores[0];
        for(int z=1;z<=N-1;z++){

            if(scores[z]>=maximum){
                maximum=scores[z];
            }

        }

        //최저점수 찾아내고 출력해주기 
        int minimum=scores[0];
        for(int z=1;z<=N-1;z++){

            if(scores[z]<=minimum){
                minimum=scores[z];
            }

        } 

        //어레이 내림차순으로 성적 정렬 
        sort(scores,scores+N,greater<int>());

        //가장 큰 인접 성적 차이 구하기 
        int max_adjdiff=scores[0]-scores[1];
        for(int z=0;z<=N-2;z++){

            int current_adjdiff=scores[z]-scores[z+1];

            if(current_adjdiff>=max_adjdiff){
                max_adjdiff=current_adjdiff;
            }

        }

        //최고 점수,최저점수 차이 찾아내고 출력해주기
        cout << "Class ";
        cout << (i+1) << '\n';
        cout << "Max ";
        cout << maximum;
        cout << ", ";
        cout << "Min ";
        cout << minimum;
        cout << ", ";
        cout << "Largest gap ";
        cout << max_adjdiff << '\n';



    }

    return 0;
}


