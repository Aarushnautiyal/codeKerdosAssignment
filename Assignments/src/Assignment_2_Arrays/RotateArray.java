package Assignment_2_Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,5,6,7};
        int target = 3;
//        for (int i = 0; i < target; i++) {
//            rotateArrayLoop(nums);
//        }
        rotateArrayLoop(nums,target);
        for (int num: nums){
            System.out.print(num);
        }
    }
//    static void rotateArrayLoop(int[] nums){
//        int replace = nums[nums.length-1];
//        for (int i= nums.length-2;i>=0;i--){
//             nums[i+1]=nums[i];
//        }
//        nums[0]=replace;
//    }

    static void rotateArrayLoop(int[] nums, int target){
        target%= nums.length;
        reverse(nums,0, nums.length-target-1);
        reverse(nums, nums.length-target, nums.length-1);
        reverse(nums, 0, nums.length-1);

    }
    static void reverse(int[] nums, int start,int end){
        while (start<end){
            int temp = nums[start];
            nums[start]= nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
}
