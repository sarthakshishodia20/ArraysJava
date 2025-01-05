class Solution {
    // Baari baari map mein se ek ek character nikalkr dekho ki equal ho rhi ya nahi agr nahi ho rhi toh vapas se frequency bdha kr map mein daal do vrna toh check krte rho hrr letter ke liye jb tk ki pura iterate nahi ho jata hashmap
    public boolean equalFrequency(String word) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(char c:word.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(char c:word.toCharArray()){
            map.put(c,map.get(c)-1);
            if(map.get(c)==0){
                map.remove(c);
            }
            if(allFrequenciesAreEqual(map)){
                return true;
            }
           map.put(c,map.getOrDefault(c,0)+1);
        }
        return false;
    }
    public boolean allFrequenciesAreEqual(HashMap<Character,Integer> map){
        int freq=-1;
        for(int count:map.values()){
            if(freq==-1){
                freq=count;
            }
            else if(freq!=count){
                return false;
            }
        }
        return true;
    }
}
