public class DuplicatesInArrayOfNPlusOneIntegers {
    public static void main(String[] args) {
        int arr[]={2,1,3,4,5,6,4};
        System.out.println(findDuplicate(arr));
    }

    private static int findDuplicate(int[] arr) {
        int slow = arr[0];
        int fast = arr[0];
        do {
            slow = arr[slow];
            fast = arr[arr[fast]];
        }while (slow!=fast);

        fast = arr[0];
        while (slow!=fast){
            slow = arr[slow];
            fast = arr[fast];
        }
        return slow;
    }
}
