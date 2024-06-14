public class MergeSortArray {
    // Online Java Compiler
// Use this editor to write, compile and run your Java code online
    public static void main(String[] args) {
        int[] array = {3, 4, 5, 6, 7, 8, 1, 2, 10};
        int[] arr = mergeSort(array, 0, array.length - 1);
        printArray(arr);
    }

    public static int[] mergeSort(int[] array, int si, int ei) {
        if (si == ei) {
            int[] baseArray = new int[1];
            baseArray[0] = array[si];
            return baseArray;
        }
        int mid = si + (ei - si) / 2;
        int[] arr1 = mergeSort(array, si, mid);
        int[] arr2 = mergeSort(array, mid + 1, ei);
        int[] arr3 = merge(arr1, arr2);
        return arr3;
    }

    public static int[] merge(int[] array1, int[] array2) {
        int[] array3 = new int[array1.length + array2.length];
        int idx = 0;
        int i = 0;
        int j = 0;
        while (i < array1.length && j < array2.length) {
            if (array1[i] < array2[j]) {
                array3[idx] = array1[i];
                idx++;
                i++;
            } else {
                array3[idx] = array2[j];
                idx++;
                j++;
            }

        }
        while (i < array1.length) {
            array3[idx++] = array1[i++];
        }
        while (j < array2.length) {
            array3[idx++] = array2[j++];
        }
        return array3;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}

    

