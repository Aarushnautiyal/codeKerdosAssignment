package Assignment_2_Arrays;

public class JumpGame {
    public static void main(String[] args) {
        System.out.println(canJump(new int[]{2, 3, 1, 1, 4}));
    }

    public static boolean canJump(int[] nums) {
        int furthest = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (furthest < i) {
                return false;
            }
            furthest = Math.max(furthest, nums[i] + i);

        }
        return true;
    }
}
