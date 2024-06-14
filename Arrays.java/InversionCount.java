public class InversionCount {
    public static int merge(int [] array, int si, int mid , int ei){
        int temp[]=new int[ei-si+1];
        int invCount=0;
        int i=si;
        int j=mid;
        int k=0;
        while(i<mid && j<=ei){
          if(array[i]<array[j]){
            temp[k]=array[i];
            i++;
            k++;
          }else{
            temp[k]=array[j];
            invCount+=(mid-i);
            k++;
            j++;
          }
        }
        while(i<mid){
            temp[k]=array[i];
            i++;
            k++;
        }
        while(j<=ei){
            temp[k]=array[j];
            j++;
            k++;

        }
        for(i=si,k=0;k<temp.length;k++,i++){
            array[i]=temp[k];
        }
        return invCount;
    }
    public static int mergeSort(int[] array,int si, int ei){
        int invCount=0;
        if(ei>si){
            int mid=si+(ei-si)/2;

            invCount=mergeSort(array, si, mid);
            invCount+=mergeSort(array, mid+1, ei);
            invCount+=merge(array,si,mid,ei);


        }
        return invCount;
    }
    public static int getInversionCount(int[] array){
        int n=array.length;
        return mergeSort(array,0,n-1);

    }
    public static void main(String[] args) {
        int[] array={2,3,4,5,6};
        System.out.print(getInversionCount(array));
    }
}




