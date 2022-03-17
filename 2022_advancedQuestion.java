construct a family tree from that information and need to find the list of eligible people one can marry. The conditions were as follows:

For a male, a match will be his father’s sister’s daughter or his mother’s brothers’ daughter.
For a female, a match will be her father’s sister’s son or her mother’s brother’s son.
Names are unique.
Input format:
<person's name>, <gender>, <father's name>, <mother's name>

Input:
John, Male, Brad, Lisa
Emma, Female, Brad, Lisa
Alex, Male, John, Jenny
Emily, Female, Steve, Emma
Rachel, Female, Steve, Emma

Person name: Alex
Output: Emily, Rachel
I presented the UML diagram for the question and explained my approach. I was able to give a working solution in Java and the interviewer was satisfied with my solution. 

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String[][] arr=new String[n][4];
		
		for(int i=0;i<n;i++){
		    for(int j=0;j<4;j++){
		        arr[i][j]=sc.next();
		    }
		}
		Map<String, List<String>> parent=new HashMap<>();
		
		for(int i=0;i<n;i++){
		    parent.putIfAbsent(arr[i][2],new ArrayList<>());
		    parent.get(arr[i][2]).add(arr[i][0]);
		}
		System.out.print(parent);
	}
  
  
  NOT COMPLETED YET
}
