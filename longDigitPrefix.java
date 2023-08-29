package codeSignal;

public class longDigitPrefix {
public static String solution(String str) {
String result="";
String current="";
for(int i=0;i<str.length();i++) {
	if(!((str.charAt(i)>=48 && str.charAt(i)<=57) || str.charAt(i)>=97 && str.charAt(i)<=112)){
		current="";
	}
	else if(str.charAt(i)>=48 && str.charAt(i)<=57) {
		current+=str.charAt(i);
	}
	else {
		if(current.length()>result.length()) result=current;
	}
}
	return result;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String str="111111)1111111111)a"; 
       System.out.println(solution(str));
	}

}
