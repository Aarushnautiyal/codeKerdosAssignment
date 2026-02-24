package Assignment_2_Arrays;

public class JumpGameII {
    public static void main(String[] args) {
        System.out.println(jump(new int[]{2, 3, 1, 1, 4}));
    }

    public static int jump(int[] nums) {
        int furthest = 0, current = 0, jump = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            furthest = Math.max(nums[i] + i, furthest);
            if (i == current) {
                jump++;
                current = furthest;
            }
        }
        return jump;


    }
}
