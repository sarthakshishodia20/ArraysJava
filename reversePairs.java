class Solution {
    // Striver Sheet Explaination Sheet
    public int reversePairs(int[] nums) {
        return mergeSort(nums, 0, nums.length - 1);
    }

    private int mergeSort(int[] arr, int low, int high) {
        int count = 0;
        if (low >= high) {
            return count;
        }
        int mid = low + (high - low) / 2;
        count += mergeSort(arr, low, mid);       
        count += mergeSort(arr, mid + 1, high); 
        count += countPairs(arr, low, mid, high);
        merge(arr, low, mid, high);             
        return count;
    }

    private void merge(int[] arr, int low, int mid, int high) {
        int[] newArr = new int[high - low + 1]; 
        int left = low, right = mid + 1, index = 0;

        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                newArr[index++] = arr[left++];
            } else {
                newArr[index++] = arr[right++];
            }
        }

        while (left <= mid) {
            newArr[index++] = arr[left++];
        }

        while (right <= high) {
            newArr[index++] = arr[right++];
        }
        for (int i = 0; i < newArr.length; i++) {
            arr[low + i] = newArr[i];
        }
    }

    private int countPairs(int[] arr, int low, int mid, int high) {
        int count = 0;
        int right = mid + 1;

        for (int left = low; left <= mid; left++) {
            while (right <= high && arr[left] > 2L * arr[right]) {
                right++;
            }
            count += (right - (mid + 1));
        }

        return count;
    }
}
