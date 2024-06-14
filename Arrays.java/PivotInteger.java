public class PivotInteger {
    public static int pivot(int n){
        for(int i=1;i<=n;i++){
            int leftSum=(i*(i+1))/2;
            int rightSum=(n*(n+1))/2-(i*(i-1))/2;
            if(leftSum==rightSum){
                return i;
            }
            
        }
        return -1;
    }
    public static void main(String[] args) {
        int n=8;
        System.out.println(pivot(n));
    }
    
}
