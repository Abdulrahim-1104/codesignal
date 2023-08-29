package codeSignal;

public class messageEncp {
	public static char getChar(String stub){
	    int ch=0;
	    for(int i=stub.length()-1;i>=0;i--){
	        if(stub.charAt(i)=='1'){
	          ch+=Math.pow(2, (stub.length()-1)-i);  
	        }
	    }
	    return (char)ch;
	}
	public static String solution(String code) {
	String result="";
	for(int i=0;i<code.length();i=i+8){
	    String sub = code.substring(i,i+8);
	    result+=getChar(sub);
	}
	return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(solution("010010000110010101101100011011000110111100100001"));
	}

}
