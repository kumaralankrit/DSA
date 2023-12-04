public class squareRoot {
    public static void main(String[] args) {
        int number = 99;
        System.out.println(sqRoot(number));
    }

    private static int sqRoot(int number) {
        if (number == 0 || number == 1) {
            return 1;
        }
        int left = 1, right = number, result = 0;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (mid <= number / mid) {
                left = mid + 1;
                result = mid;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }
}
