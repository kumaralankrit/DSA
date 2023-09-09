import java.util.HashSet;
import java.util.Set;

public class TwoSum {
    public static void main(String[] args) {
        int arr[] = {12, 7, 2, 10, 16, 18};
        int sum = 26;
        sumOfTwoNumber(arr, sum);
    }

    //Pointer method
    /*private static void sumOfTwoNumber(int[] arr, int sum) {
        //base case
        if(arr ==null || arr.length==0){
            return;
        }
        Arrays.sort(arr);
        int left = 0, right = arr.length-1;
        int totalSum = 0;
        while(left<right){
            totalSum = arr[left] + arr[right];
            if(totalSum == sum) {
                System.out.println(arr[left]+" "+arr[right]);
                return;
            }
            if(totalSum<sum) {
                left++;
            } else {
                right--;
            }
        }
    }*/

    //Hashing Method
    private static void sumOfTwoNumber(int[] arr, int sum) {
        Set<Integer> set = new HashSet<Integer>();

        for(int i=0;i<arr.length;i++) {
            if(set.contains(sum-arr[i])) {
                System.out.println((sum-arr[i]) +" " + arr[i] );
            } else {
                set.add(arr[i]);
            }
        }
    }

}