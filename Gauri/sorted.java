import java.util.*;


public class sorted {
    public static void main(String[] args) {

        
        System.out.print("Enter the number elements in array: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }


        for (int i = 0 ; i < n; i++){
                for (int j = 0; j < n-1 ; j++){
                    if (arr [j] > arr[j + 1]){
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j +1] = temp ;
                    }
                }

            }

        for (int j= 0 ; j < n ; j++){
            System.out.print(arr[j]);
        }
    }
}
