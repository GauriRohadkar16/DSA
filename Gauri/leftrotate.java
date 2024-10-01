import java.util.Scanner;

public class leftrotate { 
    public static void main(String[] args) {
        // int temp = arr[0];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++){
           arr[i] = sc.nextInt();
        }

        int temp = arr[0];

        for (int i = 0; i< n-1 ; i++){
            arr[i] = arr[i+1];
        }

        arr[n-1] = temp;

        for (int i = 0 ; i < n ; i++){
            System.out.print(arr[i]);
        }
    }
}
