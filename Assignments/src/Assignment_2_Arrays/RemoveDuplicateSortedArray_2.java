package Assignment_2_Arrays;

public class RemoveDuplicateSortedArray_2 {
    public static void main(String[] args) {
        int[] nums = new int[]{1,1,1,2,2,3};
        int j=2;
        for(int i=2;i< nums.length;i++){
            if(nums[i]!=nums[j-2]){
                nums[j++] = nums[i];
            }
        }
        for (int num: nums){
            System.out.println(num);
        }
    }
}
