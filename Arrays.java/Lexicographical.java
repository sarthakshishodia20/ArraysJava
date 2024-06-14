import java.util.Scanner;

public class Lexicographical{
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        obj.close();
        for(int i=1;i<=9 && i<=n;i++){
            dfs(i,n);
        }
    }
    public static void dfs(int i,int n){
        if(i>n){
            return;
        }
        System.out.println(i);
        for(int j=0;j<10;j++){
            dfs(i*10 +j,n);
        }
    }
}