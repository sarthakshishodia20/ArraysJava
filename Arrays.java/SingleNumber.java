public class SingleNumber {
    public static int Unique(int[] array){
        int single=array[0];
        for(int i=1;i<array.length;i++){
            single=single^array[i];
        }
        return single;
    }
    public static void main(String[] args) {
        int[] array={1,2,3,2,1};
        System.out.println(Unique(array));
    }
    
}
