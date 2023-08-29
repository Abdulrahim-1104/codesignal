package codeSignal;

public class productNum {
public static int solution(int product) {
	if(product==1) return 1;
	if(product==0) return 10;
	if(product/10==0) return product;
	int i=9;
	String result="";
	while(product/10!=0 && i!=1) {
		if(product%i==0) {
			result=String.valueOf(i)+result;
			product/=i;
			if(product/10==0) result=String.valueOf(product)+result;
			i=9;
		}
		else i--;
	}
	if(product/10!=0) return -1;
	if(result.isEmpty())return -1;
	return Integer.valueOf(result);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution(10));
		System.out.println("7"+9);
		String s="daljfdlfa(";
		System.out.println(s.contains("(")); 9
	}

}
