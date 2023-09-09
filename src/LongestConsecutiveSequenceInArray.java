import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequenceInArray {
    public static void main(String[] args) {
        int a[]={100, 200, 1, 3, 2, 4};
        System.out.println(longestConsecutive(a));
    }

    private static int longestConsecutive(int[] a) {
        Set<Integer> set= new HashSet<Integer>();
        for(int num:a){
            set.add(num);
        }
        int longestStreak=0;
        for(int num:a){
            if(!set.contains(num-1)){
                int currentNum=num;
                int currentStreak=1;
                while (set.contains(currentNum+1)){
                    currentNum+=1;
                    currentStreak+=1;
                }
                longestStreak=Math.max(longestStreak,currentStreak);
            }
        }
        return longestStreak;
    }
}
