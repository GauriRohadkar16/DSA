import java.util.Scanner;

public class minimumarr {


    public static void main(String[] args) {
        System.out.println("Enter the size of array:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter the values in array");
        for (int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        int temp = arr[0];

        for(int i= 0; i<n; i++){
            if (arr[i]<temp){
               temp = arr[i]; 
            }
        }
        System.out.println("The minimum value is: "+ temp);
    }
}
