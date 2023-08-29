package codeSignal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class filingName {
	public static String[] solution(String[] names) {
	    HashMap<String,Integer> map = new HashMap<>();
	    for(int i=0;i<names.length;i++){
	        String str=names[i];
	        if(!map.containsKey(str)) {
	        	map.put(str,0);
	        }
	        else {
	        	map.put(str, map.get(str)+1);
	        	int val=0;
	        	String s=str;
	        	while(map.containsKey(str)) {
	        		str=s+"("+(map.get(s)+val)+")";
	        		val++;
	        	}
	        	map.put(str,0);
	        	names[i]=str;
	        }
	}
	    return names;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str[]= {"doc", 
				 "doc", 
				 "image", 
				 "doc(1)", 
				 "doc"};
		System.out.println(Arrays.toString(solution(str)));
		

	}

}
