public class CyclicRotationArray {

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        cyclicRotation(arr); //function calling
    }

    private static void cyclicRotation(int[] arr) {
        int lastElementOfArray = arr[arr.length-1];
        for(int i=arr.length-2; i>=0; i--){
            arr[i+1] = arr[i];
        }
        arr[0] = lastElementOfArray;

        //print statement
        for(int tempArr:arr) {
            System.out.print(tempArr+" ");
        }
    }
}
