import java.util.Stack;

public class NextGreaterElement {

    public static void main(String[] args) {
        int arr[] = {5, 7, 1, 2, 6, 0};
        int arr2[] = nextGreaterElement(arr);
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }

    private static int[] nextGreaterElement(int[] arr) {
        int n = arr.length;
        int nge[] = new int[n];
        Stack<Integer> stack = new Stack<>();
        for (int i = 2 * n - 1; i >= 0; i--) {
            while (stack.isEmpty() == false && stack.peek() <= arr[i % n]) {
                stack.pop();
            }
            if (i < n) {
                if (stack.isEmpty() == false)
                    nge[i] = stack.peek();
                else nge[i] = -1;
            }
            stack.push(arr[i % n]);
        }
        return nge;
    }

}
