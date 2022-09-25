class Solution{
      
       public int solution(int n){
              
              int[] fiboSequence = new int[n+1];
              fiboSequence[0]=0;
              fiboSequence[1]=1;
              
              //0 1 1 2 3 5
              //문제에서 정의한 fibonacci 수열 생성  
              for(int i=2;i<=n;++i){
                  fiboSequence[i]=(fiboSequence[i-2]%1234567)+(fiboSequence[i-1]%1234567);
              }
              
              return (fiboSequence[n]%1234567);
              
       }
       
}
