public class CheckIfArrayIsSorted {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7,8};
        System.out.println(checkIfSorted(a));
    }

    private static boolean checkIfSorted(int[] a) {
        for(int i =1; i< a.length;i++){
            if(a[i]<a[i-1])
                return false;
        }
        return true;
    }
}
