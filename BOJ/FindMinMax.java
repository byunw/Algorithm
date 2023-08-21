// 백준 20053번 
// 문제 유형: 구현 
// 풀이 소요 시간: ~20분 

import java.util.Scanner;

public class FindMinMax {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i=1;i<=t;++i){

           int n = sc.nextInt();
           int numbers[] = new int[n];

           //어레이에 숫자 넣기
           for(int y=0;y<n;++y){
               numbers[y] = sc.nextInt();
           }

           //최소 값 찾고 출력
           int min = numbers[0];
           for(int y=0;y<n;++y){
               if(numbers[y]<=min){
                   min = numbers[y];
               }
           }
           System.out.print(min);
           
           //공백 출력   
           System.out.print(" ");

           //최대 값 찾고 출력
           int max = numbers[0];
           for(int y=0;y<n;++y){
               if(numbers[y]>=max){
                   max = numbers[y];
               }
           }
           System.out.println(max);

        }

    }

}
