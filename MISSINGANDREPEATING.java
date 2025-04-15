import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {

    public static int[] missingAndRepeating(ArrayList<Integer> arr, int n) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int ele : arr){
            map.put(ele, map.getOrDefault(ele, 0) + 1);
        }

        int repeating = 0;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() == 2){
                repeating = entry.getKey();  
                break;
            }
        }

        int actualSum = 0;
        for(int ele : arr){
            actualSum += ele;
        }

        int expectedSum = n * (n + 1) / 2;
        int missing = expectedSum - (actualSum - repeating); 

        return new int[]{missing, repeating};
    }
}
