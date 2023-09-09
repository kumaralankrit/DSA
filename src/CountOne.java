public class CountOne {
    public static void main(String[] args) {
        int arr[] = {0,1,0,1,1,1,0,1,0,0,0,1,1,1,1,1,0,0};
        //int arr[] = {};
        int maxCount = findMaxCountOfOne(arr);
        System.out.println("final count of one: "+maxCount);
    }
    private static int findMaxCountOfOne(int[] arr) {
        //base check condition
        if(arr==null || arr.length==0) {
            return 0;
        }
        //Condition
        int countOne = 0, maxCount = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++) {
            countOne = 0;
            for(int j=i;j<arr.length;j++) {
                if(arr[j]==1) {
                    countOne++;
                } else {
                    break;
                }
            }
            if(countOne>maxCount) {
                maxCount = countOne;
            }
            System.out.println("count of One: "+maxCount);
        }
        return maxCount;
    }
}
