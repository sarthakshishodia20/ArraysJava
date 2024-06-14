import java.util.Arrays;

public class PlusOne {
    static int[] Pluss(int[] digits){
        int n=digits.length;
        for(int i=n-1;i>=0;i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }
        int[] newArray=new int[n+1];
        newArray[0]=1;
        return newArray;
    }
    public static void main(String[] args) {
        int[] digits={9,9,9};
        System.out.println(Arrays.toString(Pluss(digits)));
    }
    
}
