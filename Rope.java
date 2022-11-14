import java.util.Scanner;
import java.util.Arrays;

public class Rope{
       
       public static void main(String[] args){
              
              Scanner sc = new Scanner(System.in);
              int ropeNumber = sc.nextInt();
              int[] ropeCapability = new int[ropeNumber];
         
              for(int i=0;i<ropeNumber;++i){
                  ropeCapability[i] = sc.nextInt();
              }
            
              int maxWeight = 0;
              Arrays.sort(ropeCapability);
              for(int i=0;i<ropeNumber;++i){
                  if(maxWeight<ropeCapability[i]*(ropeNumber-i)){
                     maxWeight = ropeCapability[i]*(ropeNumber-i);
                  }
              }
          
              System.out.println(maxWeight);
         
       }

}
        
