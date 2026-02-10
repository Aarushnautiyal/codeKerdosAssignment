package Assignment_2_Arrays;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int[] num1 = new int[]{1, 2, 3, 0, 0, 0};
        int[] num2 = new int[]{2, 5, 6};
        int m = num1.length - 1, n = num2.length - 1;
        int i = m;
        int j = m - n - 1;
        int k = n;
        while (j >= 0 && k >= 0) {
            if (num1[j] > num2[k]) {
                num1[i--] = num1[j--];
            } else {
                num1[i--] = num2[k--];
            }
        }
        while (j > 0) {
            num1[i--] = num1[j--];
        }
        while (k > 0) {
            num1[i--] = num2[k--];
        }
        for (int num : num1) {
            System.out.println(num);
        }
    }
}
