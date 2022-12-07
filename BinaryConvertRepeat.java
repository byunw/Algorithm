class BinaryConvertRepeatSolution {
    public int[] solution(String s) {
        
        int[] answer = {0,0};
        int deleteZeroNum = 0;
        int convertCount = 0;
        
        while(!s.equals("1")){
            
           String temp = "";
            
           for(int i=0;i<s.length();++i){
               
               if(s.charAt(i)=='0'){
                   deleteZeroNum++;
                   temp += "";
               }
               
               else{
                   temp += s.charAt(i);
               }
               
           }
           
           int newStringLength = temp.length();
           temp = Integer.toBinaryString(newStringLength);
           s = temp;
           ++convertCount;
            
        }
        
        answer[0] = convertCount;
        answer[1] = deleteZeroNum;
        return answer;

    }         
}

public class BinaryConvertRepeat{

    public static void main(String[] args){
        BinaryConvertRepeatSolution bcr = new BinaryConvertRepeatSolution();
        int[] ans = bcr.solution("1111111");
        System.out.println(ans[0]);
        System.out.println(ans[1]);
    }
    
}
