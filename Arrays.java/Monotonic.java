public class Monotonic {
    public static boolean isMono(int[] array){
        boolean inc=true;
        boolean dec=true;
        for(int i=0;i<array.length-1;i++){
            if(array[i]<array[i+1]){
                dec=false;
            }
            if(array[i]>array[i+1]){
                inc=false;
            }
        }
        return inc||dec;
    }
    public static void main(String[] args) {
        int[] array={1,2,3,4,5,6,7,8};
        int[] array2={9,8,7,6,5,4,3,2,1};
        System.out.println(isMono(array2));
        System.out.println(isMono(array));
    }
}
