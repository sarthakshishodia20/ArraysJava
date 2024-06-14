// import java.util.Collections;
// import java.util.Arrays;
public class Sorting{
    public static void Bubble(int [] array){
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array.length-1-i;j++){
                if(array[j]>array[j+1]){
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
    }
    public static void selection(int [] array){
        for(int i=0;i<array.length;i++){
            int min=i;
            for(int j=i+1;j<array.length;j++){
                if(array[min]>array[j]){
                    min=j;
                }
            }
            int temp=array[i];
            array[i]=array[min];
            array[min]=temp;
        }
    }
    public static void Insertion(int[] array){
        for(int i=1;i<array.length;i++){
            int curr=array[i];
            int prev=i-1;
            while(prev>=0 && array[prev]>curr){
                array[prev+1]=array[prev];
                prev--;
            }
            // insertion 
            array[prev+1]=curr;
        }
    }
    public static void print(int[] array){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }

    }
    public static void countsort(int[] array){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<array.length;i++) 
        {
            largest=Math.max(largest,array[i]);
        }
        int count[] =new int[largest+1];
        for(int i=0;i<array.length;i++)
         
        {
            count[array[i]]++;
        }

        int j=0;

        for(int i=0;i<count.length;i++) 
        {
            while(count[i] >0) 
            {
                array[j] =i;
                j++;
                count[i]--;
            }
        }
    }
    public static void main(String[] args) {
        int[] array={5,4,1,2,3,};
        // int[] arr={2,3,4,3,1};
        // Arrays.sort(arr);
        // print(arr);
        countsort(array);
         print(array);



        // Integer[] arrays={1,23,4,34,35};
        // Arrays.sort(arrays,Collections.reverseOrder());
        

        
        // Bubble(array);
        // print(array);
        // System.out.println();
        // selection(array);
        // print(array);
        // System.out.println();
        // Insertion(array);
        // print(array);
    }
}