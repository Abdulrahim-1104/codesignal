package codeSignal;

import java.util.Arrays;
import java.util.Comparator;

public class arrayPackaging {
	static int solution(int a, int b) {
	    int num = b*(b+1)/2-((a-1)*(a)/2);
	    String result =Integer.toBinaryString(num);
	    result=result.substring(1,result.length());
	    if(result.length()==0) return 0; 
	    return Integer.parseInt(result,2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String tt="00010111";
//		String ff="00101101";
//		String tn="00100111";
//		String ss[]= {tn,ff,tt};
//		Arrays.sort(ss, Comparator.reverseOrder());
//		System.out.println(Arrays.toString(ss));
//		String s=tt+ff+tn;
//		System.out.println(s);
//		//int arr[]= {00011000,01010101,00000000};
//		//Arrays.sort(arr);
//		//System.out.println(Arrays.toString(arr));
//		//System.out.println(00000101); 
//		System.out.println(Integer.parseInt(s,2));
//		//System.out.println(Integer.toBinaryString(39));
//		String result =Integer.toBinaryString(27);
//		result=result.substring(1,result.length());
//		
//        System.out.println(Integer.parseInt(result,2));
//		System.out.println(solution(0,1));
//		 String bb = Integer.toBinaryString(10);
//		 String bbb = Integer.toBinaryString(-7);
//     	 System.out.println(bbb);
//     	 System.out.println(bb);
//         System.out.println("0000000000000000000000000000"+bb);
//		 System.out.println((5>>>1));
//		 int n= 1073741823;
//		 int e = n & 0xaa;
//		 int o = n & 0x55;
//		 int result = e>>1 | o<<1;
//		 System.out.println(result);
//		 System.out.println((n & 0xaa)>>1 | (n & 0x55)<<1);
//		 System.out.println("10101010101010101010101010101010".length());
//		 int n=28;
//		 int m=27;
//		 int a=n&m;
//		 int b=-(n&m);
//		 int val =  (n&m) & -(n&m);
//		 System.out.println(val);
//		 int v = -1;	
//		 System.out.println(Integer.toBinaryString(v));
//		 System.out.println(Integer.toBinaryString(v>>>1));
//		 v=v>>>1;
//		 System.out.println();
		char ch = (char)1;
		System.out.println(ch);
		String a ="a";
		a=ch+a;
		System.out.println(a);
		int n = -1;
		System.out.println(n>>>1);
		
	}

}
