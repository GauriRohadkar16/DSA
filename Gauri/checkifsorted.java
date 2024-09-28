import java.util.*;

public class checkifsorted {

    public static boolean sorted(int arr[] , int n){
        for (int i = 0; i < n-1; i++){
            if (arr[i] > arr[i + 1]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++){
           arr[i] = sc.nextInt();
        }
        if (sorted(arr, n)) {
            System.out.println("The array is sorted.");
        } else {
            System.out.println("The array is not sorted.");
        }
    }
}

