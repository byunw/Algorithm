import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class GradeCalculate {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testNum = Integer.parseInt(br.readLine());

        for(int i=0;i<testNum;++i){
            
            String[] strGrade = br.readLine().split(" ");
            int[] intGrade = new int[5];

            for(int y=0;y<5;++y){
                intGrade[y] = Integer.parseInt(strGrade[y]);
            }
            
            Arrays.sort(intGrade);
             
             
            if(intGrade[3]-intGrade[1]>=4){
                System.out.println("KIN");
            }

            if(intGrade[3]-intGrade[1]<4){
                int sum = 0;   
                for(int y=1;y<=3;++y){
                    sum += intGrade[y];
                }
                System.out.println(sum);
            }
            
        }

    }
}   
