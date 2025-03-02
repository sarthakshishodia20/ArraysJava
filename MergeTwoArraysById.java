class Solution {
    static class Pair{
        int id;
        int value;
        public Pair(int id,int val){
            this.id=id;
            this.value=val;
        }
    }
   public static int getSum(ArrayList<Integer> list) {
        int sum = 0;
        for (int ele : list) {
            sum += ele;
        }
        return sum;
    }

    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        // TreeMap<Integer, ArrayList<Integer>> map = new TreeMap<>();
        // for (int i = 0; i < nums1.length; i++) {
        //     int id = nums1[i][0];
        //     int value = nums1[i][1];
        //     map.putIfAbsent(id, new ArrayList<>());
        //     map.get(id).add(value);
        // }
        // for (int i = 0; i < nums2.length; i++) {
        //     int id = nums2[i][0];
        //     int value = nums2[i][1];
        //     map.putIfAbsent(id, new ArrayList<>());
        //     map.get(id).add(value);
        // }
        // int[][] ans = new int[map.size()][2];
        // int index = 0;
        // for (Map.Entry<Integer, ArrayList<Integer>> entry : map.entrySet()) {
        //     int id = entry.getKey();
        //     int newValue = getSum(entry.getValue());
        //     ans[index][0] = id;
        //     ans[index][1] = newValue;
        //     index++;
        // }
        // return ans;
        int pointer01 = 0;
        int pointer02 = 0;
        ArrayList<Pair> result = new ArrayList<>();
        while (pointer01 < nums1.length && pointer02 < nums2.length) {
            int id1 = nums1[pointer01][0];
            int value1 = nums1[pointer01][1];
            int id2 = nums2[pointer02][0];
            int value2 = nums2[pointer02][1];
            if (id1 == id2) {  
                result.add(new Pair(id1, value1 + value2));
                pointer01++;
                pointer02++;
            } else if (id1 < id2) {  
                result.add(new Pair(id1, value1));
                pointer01++;
            } else { 
                result.add(new Pair(id2, value2));
                pointer02++;
            }
        }
        while (pointer01 < nums1.length) {
            result.add(new Pair(nums1[pointer01][0], nums1[pointer01][1]));
            pointer01++;
        }
        while (pointer02 < nums2.length) {
            result.add(new Pair(nums2[pointer02][0], nums2[pointer02][1]));
            pointer02++;
        }
        int[][] ans = new int[result.size()][2];
        for (int i = 0; i < result.size(); i++) {
            ans[i][0] = result.get(i).id;
            ans[i][1] = result.get(i).value;
        }
        return ans;
    }
}
