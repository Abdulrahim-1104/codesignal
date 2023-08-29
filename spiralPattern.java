package codeSignal;

import java.util.Arrays;

public class spiralPattern {
	public static int[][] solution(int n) {
		int arr[][]=new int[n][n];
		int start=0;
		int end=n-1;
		int val=1;
		while(val<=n*n) {
			//right
			for(int i=start;i<=end;i++) {
				arr[start][i]=val++;
			}
			//down
			for(int i=start+1;i<=end;i++) {
				arr[i][end]=val++;
			}
			//left
			for(int i=end-1;i>=start;i--) {
				arr[end][i]=val++;
			}
			//up
			for(int i=end-1;i>=start+1;i--) {
				arr[i][start]=val++;
			}
			start++;
			end--;
		}
		return arr; 
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]=solution(3);
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println("");
		}
	}

}
