public class DeleteElementInArray {
    public static void main(String[] args) {
        int arr[]= {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int delete=6;
        deleteElement(arr, delete);
        for (int i = 0; i < arr.length-1; i++) {
            System.out.print(arr[i] +" ");
        }
}

    private static void deleteElement(int[] arr, int delete) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == delete) {
                for (int j = i; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                break;
            }
        }
    }
}
