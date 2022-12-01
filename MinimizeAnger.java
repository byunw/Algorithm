import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;

public class MinimizeAnger{
       
       public static void main(String[] args) throws IOException{
          
              BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
              StringTokenizer st = new StringTokenizer(br.readLine());
              int N = Integer.parseInt(st.nextToken());
              int[] wantRanks = new int[N];
              long anger = 0;
             
              for(int i=0;i<N;++i){
                  wantRanks[i] = Integer.parseInt(br.readLine());
              }
           
              Arrays.sort(wantRanks);
              int realRank = 1;
              for(int i=0;i<N;++i){
                  anger+=Math.abs(wantRanks[i]-realRank);
                  ++realRank;
              }
              
              System.out.println(anger);
       }
        
}
              
