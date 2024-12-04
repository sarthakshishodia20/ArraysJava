class Solution {
    public int minOperations(String s) {
        int count40 = 0;
        int count41 = 0;
        for (int i = 0; i < s.length(); i += 2) {
            if (s.charAt(i) != '0') {
                count40++;
            }
        }
        for (int i = 1; i < s.length(); i += 2) {
            if (s.charAt(i) != '1') {
                count41++;
            }
        }
        
        int altCount40 = 0;
        int altCount41 = 0;
        for (int i = 0; i < s.length(); i += 2) {
            if (s.charAt(i) != '1') {
                altCount40++;
            }
        }
        for (int i = 1; i < s.length(); i += 2) {
            if (s.charAt(i) != '0') {
                altCount41++;
            }
        }
        
        return Math.min(count40 + count41, altCount40 + altCount41);
    }
}
