public class longZeroArray {
    public static void main(String[] args) {
        // int[] array=new int[]{1,2,3,4,5,6,7,-8,9,10};
        // int[] arr={-1,-2,-3,-4};
        // System.out.println(kadanes(arr));
        // System.out.println(Prefixsum(array));
        // System.out.println(kadanes(array));
        // long [] array={0,0,5,5,0,0};
        // int n=array.length;
        // int[] arr=new int[]{0,0,5,5,0,0};
        // System.out.println(findSubarray(array, n));
        // System.out.println(subArraySum(arr, 6, 0));
    }
    public static long findSubarray(long[] arr ,int n) 
    {
        //Your code here
        long count=0;
        for(long i=0;i<n;i++){
            long start=i;
            for(long j=i+1;j<=n;j++){
                long end=j;
                long sum=0;
                for(long k=start;k<end;k++){
                    sum=sum+arr[(int)k];
                }
                if(sum==0){
                    count++;
                }
            }
        }
        return count;
    }
    public static int subArraySum(int[] arr, int n, int sum)
    { 
        //code here.
        int count=0;
        for(int i=0;i<n;i++){
            int start=i;
            for(int j=i+1;j<=n;j++){
                int end=j;
                int Sum=0;
                for(int k=start;k<end;k++){
                    Sum=Sum+arr[k];
                }
                if(Sum==sum){
                    count++;
                }
            }
        }
        return count;
    }
    public static int Prefixsum(int[]n){
        int size=n.length;
        int maxsum=Integer.MIN_VALUE;
        
        int[] prefix=new int[size];
        prefix[0]=n[0];
        for(int k=1;k<size;k++){
            prefix[k]=prefix[k-1]+n[k];
        }
       for(int i=0;i<size;i++){
        int start=i;
        int currentsum=0;
        for(int j=i;j<size;j++){
            int end=j;
            
            
            currentsum=start==0?prefix[end]:prefix[end]-prefix[start-1];
        }
        if(currentsum>maxsum){
            maxsum=currentsum;
        }
       }
       return maxsum;
    }
    public static int kadanes(int[]b){
        int cs=0;
        int ms=Integer.MIN_VALUE;
        for(int i=0;i<b.length;i++){
            cs=cs+b[i];
            if(cs<0){
                cs=0;
            }
            ms=Math.max(cs,ms);
        }

        boolean isAllnegative=true;
        int smallestnumber=Integer.MAX_VALUE;
        // int small=0;
        for(int num:b){
            if(num>=0){
                isAllnegative=false;
                break;
            }
            else{
                 smallestnumber=Math.min(smallestnumber,num);
            }
        }
        if(isAllnegative){
            return smallestnumber;
        }
        return ms;
        
        
    }
}
