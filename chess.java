package codeSignal;

public class chess {
public static boolean solution(String bishop,String pawn) {
	int bi=bishop.charAt(0)-96;
	int bj=bishop.charAt(1)-48;
	int pi=pawn.charAt(0)-96;
	int pj=pawn.charAt(1)-48;
    int i=bi;
    int j=bj;
    //Left down
    while(i!=0 && j!=0) {
    	if(i==pi && j==pj) return true;
    	i--;
    	j--;
    }
    //Left up
    i=bi;
    j=bj;
    while(i!=0 && j!=9) {
    	if(i==pi && j==pj) return true;
    	i--;
    	j++;
    }
    //right down
    i=bi;
    j=bj;
    while(j!=0 && i!=9) {
    	if(i==pi && j==pj) return true;
    	i++;
    	j--;
    }
    //right up
    i=bi;
    j=bj;
    while( j!=9 && i!=9) {
    	if(i==pi && j==pj) return true;
    	i++;
    	j++;
    }
	return false;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          System.out.println(solution("a1","a1"));
	}

}
