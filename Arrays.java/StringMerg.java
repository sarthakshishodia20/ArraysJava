public class StringMerg {
    public static void printArray(String[] array){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]);
            System.out.print(" "); 
        }
        System.out.println();
    }
    public static String[] mergeSort(String[] array,int si,int ei){
        if(si==ei){
            String[] A={array[si]};
            return A;
        }
        int mid=si+(ei-si)/2;
        String[] arr1=mergeSort(array, si, mid);
        String[] arr2=mergeSort(array, mid+1, ei);
        String [] arr3=merge(arr1,arr2);
        return arr3;
    }
    public static String[] merge(String[]arr1,String[]arr2){
        int m=arr1.length;
        int n=arr2.length;
        String[] arr3=new String[m+n];
        int idx=0;
        int i=0;
        int j=0;

          while(i<m && j<n){
           if(isSmaller(arr1[i],arr2[j])){
            arr3[idx]=arr1[i];
            i++;
            idx++;
           }
           else{
            arr3[idx]=arr2[j];
            j++;
            idx++;
           }
          }
          while(i<m){
            arr3[idx]=arr1[i];
            i++; idx++;

          }
          while(j<n){
            arr3[idx]=arr2[j];
            j++;
            idx++;
          }
          return arr3;
    }
    private static boolean isSmaller(String str1, String str2) {
        if(str1.compareTo(str2)<0){
            return true;
        }
        return false;

    }
    public static void main(String[] args) {
        String[] array={"sun","earth","mercury","venus"};
        String [] arr0=mergeSort(array,0,array.length-1);
        printArray(arr0);
    }
    
}
