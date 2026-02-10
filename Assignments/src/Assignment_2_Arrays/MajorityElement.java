package Assignment_2_Arrays;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = new int[]{3, 2, 3};
        freqWiseSolution(nums);
        int count = 0;
        int candidate = nums[0];
        for (int num : nums) {
            if (count == 0) candidate = num;
            count += candidate == num ? 1 : -1;
        }
        System.out.println(candidate);
    }

    private static void freqWiseSolution(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
            int curr = freq.get(num);
            if (curr >= nums.length / 2) {
                System.out.println("result -> " + num);
                break;
            }
        }
    }
}
