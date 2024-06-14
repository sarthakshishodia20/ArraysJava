import java.util.*;

public class LonelyElement {
    public static ArrayList<Integer> findLonelyElement(ArrayList<Integer> nums) {
        ArrayList<Integer> result = new ArrayList<>();
        int n = nums.size();
        Collections.sort(nums);
        for (int i = 0; i < n; i++) {
            if ((i != 0 && nums.get(i - 1) == nums.get(i) - 1) || 
                (i != n - 1 && nums.get(i + 1) == nums.get(i) + 1)) {
                continue;
            }
            result.add(nums.get(i));
        }
        return result;
    }

    public static void main(String[] args) {
        ArrayList<Integer> result = new ArrayList<>();
        result.add(10);
        result.add(6);
        result.add(5);
        result.add(8);
        ArrayList<Integer> lonelyElements = findLonelyElement(result);
        System.out.println(lonelyElements);
    }
}
