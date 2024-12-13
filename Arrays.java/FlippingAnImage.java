class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for (int[] row : image) {
            reverse(row); 
            invert(row);
        }
        return image;
    }

    public static void reverse(int[] arr) {
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static void invert(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            // 0->1 and 1->0
            arr[i] = arr[i] ^ 1;
        }
    }
}
