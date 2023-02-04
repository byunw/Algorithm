public class InternetCodingTest{
  
    public static void main(String[] args){
        Solution s = new Solution();
        long answer = s.solution(3L);
        System.out.println(answer);
    }
     
}

class Solution{
    
       public long solution(long n){      
               long sumOfNumberRightBeforeN = ((n*(n+1))/2-n);
               long answer = n*sumOfNumberRightBeforeN+sumOfNumberRightBeforeN;
               return answer;
       } 
       
}         
