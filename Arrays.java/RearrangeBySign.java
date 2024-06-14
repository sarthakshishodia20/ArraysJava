import java.util.*;

public class RearrangeBySign {
    public static int[] rearrangeArray(int[] nums) {
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        
        // Separate positive and negative numbers
        for (int num : nums) {
            if (num > 0) {
                pos.add(num);
            } else {
                neg.add(num);
            }
        }
        
        // Combine positive and negative numbers maintaining original order
        int index = 0;
        for (int num : pos) {
            nums[index++] = num;
        }
        for (int num : neg) {
            nums[index++] = num;
        }
        
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {3, 1, -2, -5, 2, -4};
        int[] result = rearrangeArray(nums);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
