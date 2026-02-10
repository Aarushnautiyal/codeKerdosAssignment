package Assignment_2_Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        int[] nums =new int[]{3,2,2,3};int val = 3;
        System.out.println(removeElement(nums,val));
    }
    static int removeElement(int[] nums,int target){
        int k=0;
        for (int i=0;i< nums.length;i++){
            if(nums[i]!=target){
                nums[k++]= nums[i];
            }
        }
//        Anything works as long as starting values are the one that are not the target ones with correct length that is being returned
        for (int num: nums){
            System.out.print(num);
        }
        return k;
    }
}
