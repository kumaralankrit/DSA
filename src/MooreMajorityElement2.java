import java.util.ArrayList;
import java.util.HashSet;

public class MooreMajorityElement2 {
    public static void main(String[] args) {
        int a[] = {1, 1, 1, 3, 3, 2, 2, 2};
        ArrayList < Integer > majority = majorityElement(a);
        HashSet< Integer > s = new HashSet < > (majority);
        for (int print: s) {
            System.out.print(print + " ");
        }
        System.out.println();
    }

    private static ArrayList < Integer > majorityElement(int[] a) {
        int num1 = -1, num2 = -1, count1 = 0, count2 = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == num1)
                count1++;
            else if (a[i] == num2)
                count2++;
            else if (count1 == 0) {
                num1 = a[i];
                count1 = 1;
            } else if (count2 == 0) {
                num2 = a[i];
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }
        ArrayList< Integer > ans = new ArrayList < Integer > ();
        count1=0;
        count2=0;
        for(int i=0; i< a.length;i++){
            if(a[i]==num1)
                count1++;
            else if(a[i]==num2)
                count2++;
        }
        if (count1> a.length/3)
            ans.add(num1);
        if (count2> a.length/3)
            ans.add(num2);
        return ans;
    }

}
