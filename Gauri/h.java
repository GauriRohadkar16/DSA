import java.util.Scanner;

public class h {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter Two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int n;


        do{
            System.out.println("**Menu**");
            System.out.println("1.Addition");
            System.out.println("2.Multiplication");
            System.out.println("3.Subtraction");
            System.out.println("4.Division");
            System.out.println("5.Exit");

            System.out.print("Enter your choice: ");
            n = sc.nextInt();


            switch(n){
                case 1:
                    int c = a+b;
                    System.out.println("Addition:" + c);
                    break;
                
                case 2:
                    int d = a*b;
                    System.out.println("Multiplication:" + d);
                    break;

                case 3:
                    int e = a-b;
                    System.out.println("Subtration:" + e);
                    break;

                case 4:
                    int f = a/b;
                    System.out.println("Division:" + f);
                    break;
                case 5:
                    break;        
            }
        }
        while (n<5);
    }
}
