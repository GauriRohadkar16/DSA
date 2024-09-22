import java.util.Scanner;

public class array1 {
    public static void main(String[] args) {
        System.out.println("Enter the size of array:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter the values in array");
        for (int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        for (int i=0; i<n; i++){
                arr[i] = arr[i]*arr[i];
                System.out.println(arr[i]);
            }
    }
}

