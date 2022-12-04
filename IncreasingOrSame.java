import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class IncreasingOrSame {
    public static void main(String[] args) throws IOException{
        
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
        String[] strNum = bi.readLine().split(" ");
        int[] inputArray = new int[strNum.length];
        
        for(int i=0;i<strNum.length;++i){
            inputArray[i] = Integer.parseInt(strNum[i]);
        }
        
        boolean good = true;
        for(int i=0;i<(strNum.length-1);++i){
            if(inputArray[i]>inputArray[i+1]){
               good = false;
               break;
            }
        }
        
        if(!good){
            System.out.println("Bad");
        }

        else{
            System.out.println("Good");
        }

    }

}
