import java.util.Scanner;

public class WhichIsBetter{

       public static void main(String[] args){
              boolean cpp = false;
              boolean java = false;
              
              Scanner sc = new Scanner(System.in);
              String input = sc.nextLine();
              int size = input.length();
              char firstChar = input.charAt(0);
              
              if(Character.isUpperCase(firstChar) || firstChar=='_'){
                 System.out.print("Error!");
                 return;
              }

              for(int i=1;i<size;++i){
                 if(input.charAt(i)=='_'){
                   if(input.charAt(i-1)=='_' || i == size-1){
                      System.out.print("Error!");
                      return;
                   }
                   cpp = true;
                 } 
                 if(Character.isUpperCase(input.charAt(i))){
                    java = true;
                 }
              } 

              if(cpp && java){
                 System.out.print("Error!");
                 return;
              }
               
              if(java){
                for(int i=0;i<size;++i){
                   if(Character.isUpperCase(input.charAt(i))){
                       System.out.print("_");
                       System.out.print(Character.toLowerCase(input.charAt(i)));
                   }
                   else{
                     System.out.print(input.charAt(i));
                   }
                }
              }
              
              if(cpp){
                 for(int i=0;i<size;++i){
                     if(input.charAt(i)=='_'){
                        System.out.print(Character.toUpperCase(input.charAt(i+1)));
                        ++i;
                     }   
                     else{
                      System.out.print(input.charAt(i));
                     }
                 } 
              }

              if(cpp==false && java==false){
                 System.out.print(input);
              }

       }
}  
