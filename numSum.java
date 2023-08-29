package codeSignal;

public class numSum {
	public static int solution(String inputString) {
	    String[] parts =inputString.split("\\D+");
	    int result=0;
	    for(String str:parts){
	        result+=Integer.valueOf(str);
	    }
	 return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="there are some (12) digits 5566 in this 770 string 239";
		System.out.println(solution(str));

	}

}
