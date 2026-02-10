package Assignment_2_Arrays;

public class BestTimeToBuyAndSellStock_II {
    public static void main(String[] args) {
        int [] nums = new int[]{7,1,5,3,6,4};
        int profit = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                profit += nums[i] - nums[i - 1];
            }
        }
        System.out.println(profit);
    }
}
