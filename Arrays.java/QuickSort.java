import java.util.Arrays;

public class QuickSort {
    public static void swap(int[] arr,int x,int y){

        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    public static int partition(int[] arr,int st,int end){
        int pivot = arr[st];
        int cnt = 0;
        for(int i=st;i<=end;i++){
            if(arr[i]<pivot)
            cnt++;
        }
        int pivotIndex = st + cnt;
        swap(arr,st,pivotIndex);

        int i = st,j = end;
        while(i<pivotIndex && j>pivotIndex){
            while (arr[i]<pivotIndex) {
                i++;
            }
            while (arr[j]>pivotIndex) {
                j--;
            }
            if(i<pivotIndex && j>pivotIndex){
                swap(arr, i, j);
                i++;
                j--;
            }
        }
        return pivotIndex;
    }

    public static void quickSort(int[] arr,int st,int end){
        if(st>=end)
        return;

        int pi = partition(arr,st,end);
        quickSort(arr, st, pi-1);
        quickSort(arr, pi+1, end);
    }
    public static void main(String[] args) {
        int[] arr = {10,5,3,1,2,4,6,8,7,9};

        System.out.println("Array before sort :");
        System.out.println(Arrays.toString(arr));

        quickSort(arr,0,arr.length-1);
        
        System.out.println();
        System.out.println("Array After sort :");
        System.out.println(Arrays.toString(arr));
    }
}