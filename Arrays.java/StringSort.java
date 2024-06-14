public class StringSort{
    public static void printArray(String[] array){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]);
            System.out.print(" ");
        }
    }
    public static String[] mergeSort(String [] array,int si,int ei){
        if(si>=ei){
            String[] A={array[si]};
            return A;
        }
        int mid=si+(ei-si)/2;
        String[] arr1=mergeSort(array, si, mid);
        String[] arr2=mergeSort(array, mid+1, ei);
        String[] arr3=merge(arr1,arr2);

        return arr3;
    }

    public static String[] merge(String[] arr1,String[] arr2){
        int m=arr1.length;
        int n=arr2.length;
        String[] arr3=new String[m+n];
        int k=0;
        int i=0;
        int j=0;
        while(i<m && j<n){
            if(isAlphanumerically(arr1[i],arr2[j])){
                arr3[k]=arr1[i];
                k++;
                i++;

            }
            else{
                arr3[k]=arr2[j];
                k++;
                j++;
            }

        }
        while(i<m){
            arr3[k++]=arr1[i++];

        }
        while(j<n){
            arr3[k++]=arr2[j++];
        }

        return arr3;
        
    }
    public static boolean isAlphanumerically(String str1,String str2){
        if(str1.compareTo(str2)<0){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
       String[] array={"sarthak","shishodia","sun","moon","tatiana"} ;
       String[] arr=mergeSort(array,0,array.length-1);
       printArray(arr);
    }
}