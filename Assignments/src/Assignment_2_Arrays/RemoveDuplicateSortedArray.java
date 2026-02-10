package Assignment_2_Arrays;

public class RemoveDuplicateSortedArray {
    public static void main(String[] args) {
        int[] nums = new int[]{1,1,2};
        int j=1;
        for(int i=1;i< nums.length;i++){
            if(nums[i]!=nums[i-1]){
                nums[j++] = nums[i];
            }
        }
        for (int num: nums){
            System.out.println(num);
        }
    }
}
