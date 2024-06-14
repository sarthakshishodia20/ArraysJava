public class Merge {
    public static void main(String[] args) {
        int[] array1={2,3,4,6};
        int[] array2={1,2,3,5,6,7,8,9,10};
        merge(array1,array2);
        for(int i=0;i<array1.length;i++){
            System.out.print(array1[i]+" ");
        }
    }
    public static void merge(int[] array1,int[] array2){
        int[] array3=new int[array1.length+array2.length];
        int i=0;
        int j=0;
        int k=0;
        while(i<array1.length && j<array2.length){
            if(array1[i]<array2[j]){
                array3[k]=array1[i];
                i++;
                k++;
            }
            else{
                array3[k]=array2[j];
                k++;
                j++;
            }
        }
        while(i<array1.length){
            array3[k]=array1[i];
            i++;
            k++;
        }
        while(j<array2.length){
            array3[k++]=array2[j++];
        }
        for(i=0,k=0;k<array3.length;k++,i++){
            array1[i]=array3[k];
        }
    }
    
}
