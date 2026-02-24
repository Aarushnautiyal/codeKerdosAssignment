package Assignment_2_Arrays;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int[] res = productExceptSelf(new int[]{1, 2, 3, 4});
        for (int num : res) {
            System.out.println(num);
        }
    }

    public static int[] productExceptSelf(int[] nums) {
        int prefix = 1, suffix = 1, n = nums.length;
        int[] prefixArray = new int[n];
        for (int i = 0; i < n; i++) {
            prefixArray[i] = prefix;
            prefix *= nums[i];
        }
        for (int i = n - 1; i >= 0; i--) {
            int val = nums[i];
            nums[i] = suffix * prefixArray[i];
            suffix *= val;
        }
        return nums;
    }

}
