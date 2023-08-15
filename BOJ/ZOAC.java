import java.util.Scanner;

//백준 16719번 

public class ZOAC{

  static String input;
  static boolean[] index = new boolean[100];

  public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        input = sc.nextLine();
        foo(0,input.length()-1);
  }

  static void foo(int l,int r){
      char fastChar = '{';
      int idx = -1;

      for(int i=l;i<r+1;++i){
          if(!index[i] && fastChar>input.charAt(i)){
              fastChar = input.charAt(i);
              idx = i;
          }
      }

      if(idx==-1){
         return;
      }

      index[idx] = true;
      for(int i=0;i<=99;++i){
          if(index[i]==true){
              System.out.print(input.charAt(i));
          }
      }

      System.out.println();
      foo(idx+1,r);
      foo(l,idx-1);
  }

}
