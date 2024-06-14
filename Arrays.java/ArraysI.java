// import javax.sound.sampled.Line;
import java.util.Arrays;
// import java.util.*;

public class ArraysI{
    public static void main(String[] args){
        // int[] array=new int[]{2,4,6,8,10,12,14};
        // int key=10;
        // String[] MenuList=new String[]{"Aloo","Poori","Chole","Bhature","Samosa","Rasmalai"};
        // String k=new String("Samosa");
        // sumofsubarray(array);
        // subarray(array);
        // getPairs(array);
        // MenuList(MenuList,k);
        // System.out.println(Largest(array));
        // printElements(array);
        // System.out.println(smallest(array));
        // reverse(array);
        // System.out.println();
        // System.out.println(LinearSearch(array, key));
        // System.out.println(binarySearch(array,key));
    }
    public static void printElements(int[] a){
           for(int i=0;i<a.length;i++){
            System.out.print(" | "+a[i]+" | ");
           }
    }
    public static int LinearSearch(int[] a,int key){
     for(int i=0;i<a.length;i++){
        if(a[i]==key){
            return i;
        }
     }
     return -1;
    }
    public static void MenuList(String[] arr,String k){
        for(int i=0;i<arr.length;i++){
            if(arr[i]=="Samosa"){
                System.out.print("Found at Index "+i);
                break;
            }
        }
       
    }
    public static int Largest(int[] a){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        return max;
    }
    public static int smallest(int[] a){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++){
            if(a[i]<min){
                min=a[i];
            }
        }
        return min;
    }
    public static void reverse(int[] a){
        int first=0;
        int last=a.length-1;
        while(first<last){
            int temp=a[first];
            a[first]=a[last];
            a[last]=temp;
            first++;
            last--;
        }
        System.out.print(Arrays.toString(a));
    }
    public static int binarySearch(int[]a,int key){
        int start=0;
        int last=a.length-1;
        while(start<=last){
            int mid=(start+last)/2;
            if(a[mid]==key){
                return mid;
            }
            else if(a[mid]>key){
                last=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }
    public static void getPairs(int[]a){
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                System.out.print("("+a[i]+","+a[j]+")");
            }
            System.out.println();
        }
    }
    public static void subarray(int[]a){
        for(int i=0;i<a.length;i++){
            int start=i;
            for(int j=i;j<a.length;j++){
               int end=j;
               for(int k=start;k<=end;k++){
                System.out.print(a[k]+" | ");
               }
               System.out.println();
            }
          System.out.println();
        }
    }
    public static void sumofsubarray(int[]a){
        int maxsumsubarray=Integer.MIN_VALUE;
        int minsumsubarray=Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++){
            int start=i;
            for(int j=i;j<a.length;j++){
                int end=j;
                int sum=0;
                for(int k=start;k<=end;k++){
                    System.out.print(a[k]+" | ");
                    sum=sum+a[k];
                }
                if(sum>maxsumsubarray){
                    maxsumsubarray=sum;
                }
                if(sum<minsumsubarray){
                    minsumsubarray=sum;
                }
                System.out.print(" = "+"["+sum+"]");
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("MAXIMUM SUM IS = "+maxsumsubarray);
        System.out.println("MINIMUM SUM IS ="+minsumsubarray);
    }
}