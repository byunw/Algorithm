import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class HamburgerDistribution {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        String location = br.readLine();
        boolean[] visit = new boolean[n];
        int peopleNum = 0;

        for(int i=0;i<n;++i){
            
            if(location.charAt(i)=='H'){
                continue;
            }

            for(int j = Math.max(0,i-k);j<=Math.min(n-1,i+k);j++){
                if(visit[j] || location.charAt(j)=='P') continue;
                visit[j] = true;
                ++peopleNum;
                break;
            }
            
        }

        System.out.println(peopleNum);


    }
}
