import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class DogTreat{
      
       public static void main(String[] args) throws IOException{
              
              int S;
              int M;
              int L;
            
              BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
              S = Integer.parseInt(br.readLine());
              M = Integer.parseInt(br.readLine());
              L = Integer.parseInt(br.readLine());
              
              if(10<=(S*1+M*2+L*3)){
                System.out.println("happy");
              }
         
              else{
                System.out.println("sad");
              }
         
       }
  
}
