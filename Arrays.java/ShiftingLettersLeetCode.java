class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        // Array bna li characters ki last se start kia hai usko shift kia using equation phle value nikali usko shhift se add kia fir usko mod kia 26 se jisse out of range na ho jaye and then usko convert kia character mein 
        // reverse loop isliye chlaya hai jisse saare moves calculate hote jaye hr ek steps mein isliye shift=shift+shifts[i] kia hai 
        char[] arr = s.toCharArray();
        int shift = 0;
        for (int i = shifts.length - 1; i >= 0; i--) {
            shift = (shift + shifts[i]) % 26; 
            arr[i] = (char)((arr[i] - 'a' + shift) % 26 + 'a'); 
        }
        return new String(arr);
    }
}
