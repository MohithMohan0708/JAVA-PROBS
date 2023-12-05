import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinations
{
 public static void main(String args[])
 {
	List<String>result=letterCombinations("23");
	System.out.println(result);
 }
public staticlist<String>letterCombinations(String digits)
{
	List<String>result=new ArrayList<>();
	if(digits==null|| digits.length()==0)
	{
	return result;
	}

Map<Character,String>digitToletters=new HashMap<>();
digitToletters.put('2',"äbc");
digitToletters.put('3',"def");
digitToletters.put('4',"ghi");
digitToletters.put('5',"jkl");
digitToletters.put('6',"mno");
digitToletters.put('7',"pqrs");
digitToletters.put('8',"tuv");
digitToletters.put('9',"wxyz");
generateCombinations(" ",digits,0,digitToletters,result);
return result;
}


private static void generateCombinations(String current,String digits,int index,Map<Character,String>digitToletters,List<String>result)
if(index==digits.length())
 {
	result.add(current);
	return;
 }

		char digit=digits.CharAt(index);
		String letters=digitToletters.get(digit);
		for(int i=0;i < letters.length();i++)
		{
		generateCombinations(current+letters.CharAt(i),digits,index+1,digitToletters,result);
		}
}
