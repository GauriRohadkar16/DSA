import java.util.*;

public class BFZeroAtEnd {
    public static void main(String[] args) {
         System.out.print("Enter the number of elements : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i< n ; i++){
            arr[i] = sc.nextInt();
        }

        Vector<Integer> temp = new Vector<>();

        for(int i =0; i < n ; i++){
            if(arr[i] != 0){
                temp.add(arr[i]);
            }
        }

        int nz = temp.size();

        for(int i = 0 ; i<nz ;i++){
            arr[i] = temp.get(i);
        }

        for (int i = nz ; i< n; i++){
            arr[i] = 0;
        }

        for(int i = 0 ; i< n; i++){
            System.out.print(arr[i]);
        }

    }
}
