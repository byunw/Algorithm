// 백준 10815번 
import java.util.Scanner;
import java.util.HashMap;

public class NumberCard{

       public static void main(String[] args){
              Scanner sc = new Scanner(System.in);
              int cardAmount = sc.nextInt();
              HashMap<Integer,Integer> cards = new HashMap<Integer,Integer>();
              for(int i=0;i<cardAmount;++i){
                 cards.put(sc.nextInt(),1);
              }

              int M = sc.nextInt();
              for(int i=0;i<M;++i){
                  //숫자가 존재하는 경우
                  if(cards.get(sc.nextInt())!=null){
                     System.out.print("1 ");
                  }
                  //숫자가 존재하지 않는 경우  
                  else{
                       System.out.print("0 ");
                  }
              }
       }
       
}
                  

