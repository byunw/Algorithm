import java.util.Scanner;

public class TimeCalc{
    public static void main(String[] args){
        
      Scanner sc = new Scanner(System.in);
      int e;
      int s;
      int m;
      e = sc.nextInt();
      s = sc.nextInt();
      m = sc.nextInt();

      int currentE = 1;
      int currentS = 1;
      int currentM = 1;
      int decimalNumber = 1;

      while(true){
        
            if(currentE==e && currentS==s &&currentM==m){
              System.out.println(decimalNumber);
              break;
            }

            ++decimalNumber;

            //E값 증가
            if(currentE==15){
               currentE = 1;
            }
            else{
               ++currentE;
            }
            
            //S값 증가
            if(currentS==28){
              currentS = 1;
            }
            else{
               ++currentS;
            }
            //M값 증가
            if(currentM==19){
               currentM = 1;
            }
            else{
                ++currentM;
            }
      }
      
    }
}  
              
