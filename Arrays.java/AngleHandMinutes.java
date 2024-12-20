class Solution {
    public double angleClock(int hour, int minutes) {
        // Same Formla used in Aptitudes 30h-11/2m;
    double ans=Math.abs((30*(hour%12))-(5.5*minutes));
    if(ans>180){
        return 360-ans;
    }
    else{
        return ans;
    }
    }
}
