import java.util.HashSet;
import java.util.Set;

public class DuplicateNumber {
    public static void main(String[] args) {
        int arr[]={2,1,3,4,5,6,4};
        int ans = duplicateNo(arr);
        System.out.println("Duplicate Number: "+ ans);
    }

    private static int duplicateNo(int[] arr) {
        //base check
        if(arr==null || arr.length==0) {
            return 0;
        }

        //Using Sum formula(sum of n-1 natural no is [n*(n-1)/2] )
        int sum=0;
        for(int i=0; i<arr.length; i++){
            sum+=arr[i];
        }
        return sum- (arr.length*(arr.length-1)/2);


        //Hashing Technique
        /*Set<Integer> set = new HashSet<>();

        int ans = 0;
        for(int i=0;i<arr.length;i++) {
            if(set.contains(arr[i])) {
                ans = arr[i];
                //System.out.println(arr[i]);
            } else {
                set.add(arr[i]);
            }
        }
        return ans;
        */
    }
}
