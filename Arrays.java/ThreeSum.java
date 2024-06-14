import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static List<List<Integer>> print(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        if (nums.length < 3) {
            return result; // Return an empty list if the input array has less than three elements
        }

        Arrays.sort(nums); // Sort the array

        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue; // Skip duplicates
            }
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                    while (left < right && nums[left] == nums[left - 1]) {
                        left++; // Skip duplicates
                    }
                    while (left < right && nums[right] == nums[right + 1]) {
                        right--; // Skip duplicates
                    }
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return result; // Return the list of triplets
    }

    public static void main(String[] args) {
        int[] array = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> triplets = print(array);
        for (List<Integer> triplet : triplets) {
            System.out.println(triplet);
        }
    }
}
