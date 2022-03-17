1. Given a String with numbers and operators. Perform the operations on the numbers in their respective order. 
Input : "12345*+-+"
Output: 6
Explanation: [1*2+3-4+5 = 6] 


import java.util.*;
public class Main
{
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int res=Character.getNumericValue(s.charAt(0));
        int index=(s.length()/2)+1;
        String s1=s.substring(0,index),s2=s.substring(index);
        System.out.println(s1+" "+s2);
        for(int i=0;i<s2.length();i++){
            if(s2.charAt(i)=='+') res+=Character.getNumericValue(s1.charAt(i+1));
            else if(s2.charAt(i)=='-') res-=Character.getNumericValue(s1.charAt(i+1));
            else if(s2.charAt(i)=='*') res*=Character.getNumericValue(s1.charAt(i+1));
            else if(s2.charAt(i)=='/') res/=s1.charAt(i+1); 
        }
        System.out.println(res);
	}
}
