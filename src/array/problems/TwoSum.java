package array.problems;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {1,2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(arr, target)));
    }

    public static int[] twoSum(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < arr.length; i++) {
            int remainingValue = target - arr[i];
            if(map.containsKey(remainingValue)) {
                return new int[] {map.get(remainingValue), i};
            }

            map.put(arr[i], i);
        }
        return new int[] {-1, -1};
    }
}
