import java.util.Stack;

public class ValidParanthesis
{
 public static void main(String args[])
{
System.out.println(isValid("()"));
System.out.println(isValid("({)}"));
}
public static boolean isValid(String s)
{
Stack<Character>Stack=new Stack<>();
for(char c:s.toCharArray())
  {
 	if(c=='('||c=='{'||c=='[')
	{
		Stack.push(c);
	}
	else if(c==')'&&!Stack.isEmpty()&& Stack.peek()=='(')
	{
	  	Stack.pop();
	}
	else if(c=='}'&&!Stack.isEmpty()&& Stack.peek()=='{')
	{
		Stack.pop();
	}
	else if(c==']'&&!Stack.isEmpty()&& Stack.peek()=='[')
	{	
		Stack.pop();
	}
	else
	{
		return false;
	}
  }
return Stack.isEmpty();
}
}   
