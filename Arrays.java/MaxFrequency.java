import java.util.ArrayList;

public class MaxFrequency {
    public static void main(String[] args) {
        // Example usage:
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(2);
        nums.add(3);
        nums.add(2);
        nums.add(4);
        nums.add(2);
        nums.add(5);
        nums.add(2);
        nums.add(5);
        nums.add(2);
        nums.add(5);
        System.out.println(mostFrequent(nums, 2)); // Output should be 3
    }

    public static int mostFrequent(ArrayList<Integer> nums, int key) {
        int[] count = new int[1001];
        for (int i = 0; i < nums.size(); i++) {
            if (i < nums.size() - 1 && nums.get(i) == key) {
                count[nums.get(i + 1)]++;
            }
        }
        int max = 0;
        int target = 0;
        for (int i = 0; i < count.length; i++) {
            if (count[i] >= max) {
                max = count[i];
                target = i;
            }
        }
        return target;
    }
}
