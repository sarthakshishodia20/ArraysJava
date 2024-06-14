public class MajorityElement {
    public static int Major(int[] array){
        int count=0;
        int res=0;
        for(int i:array){
            if(count==0){
                res=i;
            }
            if(i!=res){
                count--;
            }
            else{
                count++;
            }
        }
        return res;

    }
    public static void main(String[] args) {
        int[] array={1,2,3,3,3,3,3,3,3,3,3,3,4,4,4,4,5,5,6};
        System.out.println(Major(array));
    }
    
}
