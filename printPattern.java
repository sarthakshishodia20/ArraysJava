import java.util.* ;
import java.io.*; 

public class Solution {
	public static String[] printPatt(int n) {

		// Write your code here
		int times=n;
		String[] arr=new String[n];
		int index=0;
		for(int i=0;i<n;i++){
			String pat=getPattern(times);
			arr[index++]=pat;
			times--;
		}
		return arr;
	}
	public static String getPattern(int times){
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<times;i++){
			sb.append('*');
		}
		return sb.toString();
	}

}
