package codeSignal;

public class string {
public static String solution(String text) {
    String result="";
    String current="";
    for(int i=0;i<text.length();i++){
        if((text.charAt(i)>=97 && text.charAt(i)<=122) ||(text.charAt(i)>=65 && text.charAt(i)<=90)){
            current+=text.charAt(i);
        }
        else{
            if(current.length()>result.length()) {
            result=current;
             current="";
            }
            else current="";
        }
    }
    if(result.length()==0) result=text;
    if(current.length()>result.length()) result=current;
    return result;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution("aa bbb ccc dddd eeeee"));
	}

}
