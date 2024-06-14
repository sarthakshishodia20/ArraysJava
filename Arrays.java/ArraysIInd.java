import java.util.Scanner;

// import javax.sound.sampled.Line;
public class ArraysIInd{
    
    public static boolean StaircaseSearch(int[][] matrix,int key){
        int row=0;
        int col=matrix[0].length-1;
        while(row<matrix.length && col>=0)
        {
            if(matrix[row][col]==key){
                System.out.println("Value found at "+"["+row+","+col+"]");
                return true;
    
            }
            else if(matrix[row][col]>key){
                col--;

            }
            else{
                row++;
            }
            
        }
        return false;
    }
    public static void LinearDiagonal(int[][] array){
        int sump=0;
        int sums=0;
        for(int i=0;i<array.length;i++){
            sump=sump+array[i][i];
            if(i!=array.length-i-1){
                sums=sums+array[i][array.length-i-1];
            }
        }
        System.out.println("Primary diagonal sum "+sump);
        System.out.println("Secondary diagonal sum excluding overlapped element is "+ sums);
    }
    public static void diagonalsum(int[][] matrix){
        int sum=0;
        int sumd=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++)
            {
                if(i==j){
                sum=sum+matrix[i][j];
                }
                if(i+j==matrix.length-1){
                    sumd=sumd+matrix[i][j];
                }

            }
           
            }
            System.out.println("Primary diagonal sum is "+ sum);
            System.out.println("Secondary Diagonal sum is "+ sumd);
        }
 public static void spiral(int[][] array){
        int startrow=0;
        int startcol=0;
        int endrow=array.length-1;
        int endcol=array[0].length-1;
        while(startrow<=endrow && startcol<=endcol){
            // top
            for(int i=startcol;i<=endcol;i++){
                System.out.print(array[startrow][i]+" ");
            }
            // right   
            for(int i=startrow+1;i<=endrow;i++){
                System.out.print(array[i][endcol]+" ");
            }
            // bottom
            for(int i=endcol-1;i>=startcol && startrow!=endrow;i--){
                System.out.print(array[endrow][i]+" ");
            }
            // left
            for(int i=endrow-1;i>startrow && startcol!=endcol;i--){
                System.out.print(array[i][startcol]+" ");
            }
            startcol++;
            startrow++;
            endcol--;
            endrow--;
        }
    }
    public static void largestSmallest(int[][] array){
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[0].length;j++){
                if(array[i][j]>max){
                    max=array[i][j];
                }
                if(array[i][j]<min){
                    min=array[i][j];
                }
            }
        }
        System.out.println("Maximum element is "+ max);
        System.out.println("Minimum element is "+min);
    }
    public static void main(String[] args) {
        System.out.println("hello");
        Scanner obj=new Scanner(System.in);
        int n=4;
        int m=4;
        int[][] matrix=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=obj.nextInt();
            }
            System.out.println();
        }
        obj.close();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(" | "+matrix[i][j]+" | ");
            }
            System.out.println();
        }
        int key=5;
        search(matrix,key);
        System.out.println();
        largestSmallest(matrix);
        System.out.println();
        spiral(matrix);
        System.out.println();
        diagonalsum(matrix);
        System.out.println();
        LinearDiagonal(matrix);
        System.out.println();
        System.out.println(StaircaseSearch(matrix, key));
    }

    private static void search(int[][] matrix, int key) {
       for(int i=0;i<matrix.length;i++){
        for(int j=0;j<matrix[0].length;j++){
            if(matrix[i][j]==key){
                System.out.println("Element found at "+"("+i+","+j+")");
            }
        }
       }

    }
}