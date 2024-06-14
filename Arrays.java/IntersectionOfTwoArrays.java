import java.util.ArrayList;
import java.util.HashSet;

public class IntersectionOfTwoArrays {
    public static int[] Intersection(int[] array1,int[] array2){
        HashSet<Integer> set=new HashSet<>();
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<array1.length;i++){
            set.add(array1[i]);
        }
        for(int i=0;i<array2.length;i++){
            if(set.contains(array2[i])){
                ans.add(array2[i]);
                set.remove(array2[i]);
            }
        }
        int[] arr=new int[ans.size()];
        for(int i=0;i<arr.length;i++){
            arr[i]=ans.get(i);
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] array1={1,2,3,4,5};
        int[] array2={3,4,5,6,7};
        int[] finaled=Intersection(array1,array2);
        for(int i=0;i<finaled.length;i++){
            System.out.print(finaled[i]+" ");
        }
    }
    
}
