package Pgm3;
import java.util.*;
public class MatchingParenthesis {
	public static void main(String[] args) {
		String expression="";
		System.out.println("Enter valid expression");
		Scanner sc=new Scanner(System.in);
		expression=sc.next();
		System.out.println(checkParenthesis(expression));
	}
	public static boolean checkParenthesis(String expression) {
		int count_curly=0;
		int count_square=0;
		int count_paren=0;
		for(int i=0;i<expression.length();i++) {
			char ch=expression.charAt(i);
			if(ch=='{')
				count_curly++;
			else if(ch=='[')
				count_square++;
			else if(ch=='(')
				count_paren++;
			
			
			else if(ch=='}') {
				count_curly--;
				if(count_curly<0)
					return false;
			}
				
			else if(ch==']') {
				count_square--;
				if(count_square<0)
					return false;
			}
				
			else if(ch==')') {
				count_paren--;
				if(count_paren<0)
					return false;
			}				
			
		}
		
		if(count_curly==0 && count_square==0 && count_paren==0)
			return true;
		else
			return false;
	}
}
