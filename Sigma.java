import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Sigma{
       
       public static void main(String[] args) throws IOException{
               
              BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
              StringTokenizer st = new StringTokenizer(br.readLine());
              long A = Long.parseLong(st.nextToken());
              long B = Long.parseLong(st.nextToken());
              long sum = 0;
              
              if(A<=B){
                 sum = (B-A+1) * (A+B) / 2;
              }
              
              else{
                  sum = (A-B+1) * (A+B) /2;
              }
              
              System.out.println(sum);
        
       }
  
}
