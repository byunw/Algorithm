import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class SoftSoda{
       public static void main(String[] args) throws IOException{
              
              BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
              StringTokenizer st = new StringTokenizer(br.readLine());
              int possessCan = Integer.parseInt(st.nextToken());
              int pickCan = Integer.parseInt(st.nextToken());
              int payCanAmount = Integer.parseInt(st.nextToken());
              int drankNum = 0;
              int currentEmptyCan = possessCan + pickCan;
               
              while(currentEmptyCan >= payCanAmount){
                    drankNum += (currentEmptyCan/payCanAmount);
                    currentEmptyCan = (currentEmptyCan/payCanAmount)+(currentEmptyCan%payCanAmount);
              }
              
              System.out.println(drankNum);
               
       }
  
}
