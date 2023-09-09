import java.util.HashMap;

public class FindSingleElement {
    public static void main(String[] args) {
        int arr[]={1,1,2,2,3,3,4,4,5,6,6,7,7};
        int Element= findSingle(arr);
        System.out.println("Element occurring once in the Array: "+ Element);
    }

    //XOR Approach
    private static int findSingle(int[] arr) {
        int res = arr[0];
        for(int i=1; i<arr.length; i++) {
            res = res ^ arr[i];
        }
        return res;
    }


    //Hashing Approach
    /*private static int findSingle(int[] arr) {
        HashMap<Integer, Integer> m= new HashMap<>();
        int sum1=0, sum2=0;
        for (int i=0; i<arr.length; i++){
            if(!m.containsKey(arr[i])){
                sum1+=arr[i];
                m.put(arr[i],1);
            }
            sum2+=arr[i];
        }
        return (int)(2*(sum1)-sum2);
    }*/
}
