package codeSignal;

public class digitDegree {
public static int solution(int n) {
	int temp=n;
	int count=0;
	while(temp/10!=0) {
		int num=0;
		while(temp!=0) {
			num+=temp%10;
			temp/=10;
		}
		temp=num;
		count++;
	}
	return count;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		System.out.println(solution(n));
	}

}
