public class KokoBan {
    public static boolean isPossible(int mid,int[] piles ,int h){
        int hourspeed=0;
        for(int i:piles){
            hourspeed+=Math.ceil((double)i/mid);
        }
        return hourspeed<=h;
    }
    public static int minEatingTime(int[] piles,int h){
        int max=piles[0];
        for(int i=0;i<piles.length;i++){
            max=Math.max(piles[i],max);
        }
        int low=1;
        int high=max;
        int ans=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(isPossible(mid,piles,h)){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] piles={3,6,7,11};
        int h=8;
        System.out.println(minEatingTime(piles,h));
    }
    
}
