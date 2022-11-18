import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Library{
       
       public static void main(String[] args){
              
              int N;
              int M;
              Scanner s = new Scanner(System.in);
              String numbers = s.nextLine();
              String[] numberArray = numbers.split(" ");
              N = Integer.parseInt(numberArray[0]);
              M = Integer.parseInt(numberArray[1]);
              
              int bookLocation[] = new int[N];
              for(int i=0;i<N;++i){
                  bookLocation[i] = s.nextInt();
              }
             
              int negativeNum = 0;
              int positiveNum = 0;
              for(int i=0;i<N;++i){
                  if(bookLocation[i]<0){
                     ++negativeNum;
                  }
                  if(bookLocation[i]>0){
                    ++positiveNum;
                  }
               }
         
              ArrayList<Integer> positive = new ArrayList<Integer>();
              ArrayList<Integer> negative = new ArrayList<Integer>();
              
              for(int i=0;i<N;++i){
                 if(bookLocation[i]>0){
                    positive.add(bookLocation[i]);
                 }
                 if(bookLocation[i]<0){
                   negative.add(bookLocation[i]);
                 }
              }
         
              Collections.sort(negative,Collections.reverseOrder());
              Collections.sort(positive);
              
              int positiveMax = 0;
              if(positive.size()>0){
                 positiveMax = positive.get(positive.size()-1);
              }
              
              int negativeMax = 0;
              if(negative.size()>0){
                 negativeMax = Math.abs(negative.get(negative.size()-1));
              }
         
              int maxDistance = Math.max(positiveMax,negativeMax);
              int minSteps = 0;
            
              if(negative.size()>0){
                if(Math.abs(negative.get(negative.size()-1))==maxDistance){
                  int currentIndex = negative.size()-1;
                  minSteps+=Math.abs(negative.get(currentIndex));
                  currentIndex-=M;
                  while(currentIndex>=0){
                       minSteps+=(Math.abs(negative.get(currentIndex))*2);
                       currentIndex-=M;
                  }
                  
                  currentIndex = positive.size()-1;
                  while(currentIndex>=0){
                        minSteps+=(positive.get(currentIndex)*2);
                        currentIndex-=M;
                  }
                }
              }
             
              if(positive.size()>0){
                 if(positive.get(positive.size()-1)==maxDistance){
                    int currentIndex = positive.size()-1;
                    minSteps+=positive.get(currentIndex);
                    currentIndex-=M;
                    while(currentIndex>=0){
                         minSteps+=(positive.get(currentIndex)*2);
                         currentIndex-=M;
                    }
                    currentIndex = negative.size()-1;
                    while(currentIndex>=0){
                          minSteps+=(Math.abs(negative.get(currentIndex))*2);
                          currentIndex-=M;
                    }
                 }
              }
                    
              System.out.println(minSteps);
              
        }
}
           
      
