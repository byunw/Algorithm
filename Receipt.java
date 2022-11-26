import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;


//백준 영수증 문제
public class Receipt{
       public static void main(String[] args) throws IOException{
              
              BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
              StringTokenizer st;
              int receiptAmount = Integer.parseInt(br.readLine());
              int typeNum = Integer.parseInt(br.readLine());
              int calculatedPrice = 0;
               
              for(int i=0;i<typeNum;++i){
                  st = new StringTokenizer(br.readLine());
                  calculatedPrice += Integer.parseInt(st.nextToken()) * Integer.parseInt(st.nextToken());
              }
         
              System.out.println(calculatedPrice==receiptAmount?"Yes":"No");
      
       }
}
