package codeSignal;

import java.util.Arrays;

public class election {
 public static int solution(int votes[],int k) {
	 Arrays.sort(votes);
	 int count=0;
	 int max=votes[votes.length-1];
	 boolean equal=false;
	 for(int i=0;i<votes.length;i++) {
		 if((votes[i]+k)>max) count++;
		 if(i!=(votes.length-1) && max==votes[i]) {
			 equal=true;
			 count=0;
		 }
	 }
	 if(equal && count!=0) return 1;
	 return count;
	 
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[]= {1,1, 1, 3, 3};
		int k=2;
		System.out.println(solution(ar,k));
	}

}
