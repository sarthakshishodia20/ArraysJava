public class Majority {
    public static void main(String[] args) {
     int[] array={2,2,1,1,100,100,100,100,200};
        int count=0;
        int r=0;
        for(int i:array){
            if(count==0){
                r=i;
            }
            if(i!=r){
                count--;
            }
            else{
                count++;
            }
        }
        System.out.println(r);
    }
    
}
