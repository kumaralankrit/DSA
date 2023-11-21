public class MisingNumber {
    public static void main(String[] args) {
        int arr[]={1,2,3,5,6};
        missingNo(arr);
    }
    private static void missingNo(int[] arr) {
        int n = arr.length + 1; //6
        int additionOfAllNumbers = (n*(n+1))/2;
        int sum = 0;
        for(int i=0;i<arr.length;i++) {
            sum+=arr[i];
        }
        int difference = additionOfAllNumbers - sum;
        System.out.println("Missing No: "+ difference);
    }
}