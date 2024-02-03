package random;
import java.util.*;

public class Latihan {
    
    public static void main(String args[]){
        
        Scanner inputUser;
        char answer;
        
        inputUser = new Scanner(System.in);
        System.out.print("Are you still love her? (y/n): ");
        answer = inputUser.next().charAt(0);
        
         if (answer == 'y'){
            System.out.println("It almost 5 years ago, and you still didn't make it?");
        } else if (answer == 'n'){
            System.out.println("Don't lie. You still see her shadow in your mind, didn't you?");
        } else  {
            System.out.println("Please input the right option (y/n)");
        }
    }
}
    
