import java.util.*;
public class Amstrong {
    public static void main(String[] args) {
        System.out.println("Enter a number for: ");
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int temp = A;

        int Amg = 0;

        while (A != 0){

            int digit = A % 10 ;
            Amg = Amg + (digit*digit*digit);

            A = A/10; 

        }

        if (Amg == temp){
            System.out.println("True");
        }
        
        else{
            System.out.println("False");
        }

    }
    
}
