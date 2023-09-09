import java.util.Scanner;

public class ArrayRotaion {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        System.out.println("Input array: ");
        for(int i=0; i< arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        Scanner sc= new Scanner(System.in);
        System.out.println();
        System.out.println("Enter how many times you want to rotate the array");
        int n= sc.nextInt();
        for(int i=0; i<n; i++) {
            int firstElementOfArray = arr[0];
            for (int j = 0; j < arr.length; j++) {
                arr[j] = arr[j - 1];
            }
            arr[arr.length - 1] = firstElementOfArray;
        }
        System.out.println();
        System.out.println("Output Array: ");
        for(int i=0; i< arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
