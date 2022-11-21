import java.util.*;

public class SecretPassword {
    public static void main(String[] args){
        
        int Stringnum;
        Scanner sc = new Scanner(System.in);
        Stringnum = sc.nextInt();
        String trash = sc.nextLine();
        
        String currentString;

        for(int i=1;i<=Stringnum;++i){
            currentString = sc.nextLine();
         
            if(currentString.length()>=6 && currentString.length()<=9){
                System.out.println("yes");
            }
            else{
                System.out.println("no");
            } 
        }

    }

}
