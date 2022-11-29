import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Hive {
        
    public static void main(String[] args) throws IOException{

        int roomNumber;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        roomNumber = Integer.parseInt(br.readLine());
         
        if(roomNumber==1){
            System.out.println(1);
        }
        
        else{

            int currentLayerLastNumber = 1;
            int currentLayer = 1;

            while(true){
                currentLayerLastNumber = currentLayerLastNumber+(6*currentLayer);
                if(currentLayerLastNumber>=roomNumber){
                    break; 
                }
                ++currentLayer;
            }

            System.out.println(1+currentLayer);

        }

    }
}
