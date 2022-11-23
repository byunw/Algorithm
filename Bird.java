import java.util.Scanner;

public class Bird {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int birdNum = sc.nextInt();
        int second = 0;
        int currentNum = 1;

        while(birdNum>0){

            if(currentNum>birdNum){
                currentNum = 1;
            }

            else{
                ++second;
                birdNum-=currentNum;
                ++currentNum;
            }

        }

        System.out.println(second);

    }
}
