class Solution {
    public boolean checkIfExist(int[] arr) {
        HashSet<Integer> set=new HashSet<>();
        int count=0;
        for(int i:arr){
            if(i==0){
                count++;
            }
            set.add(i);
        }
        if(count>=2){
            return true;
        }
        set.remove(0);
        for(int val:arr){
            if(set.contains(2*val)){
                return true;
            }
        }
        return false;
    }
}
