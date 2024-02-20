public class LongestSubString 
{
    public static void findLongestSubstring(String s)
    {
        int maxlength=0;
        int start=0;
        int startIndex=0;
        for(int end=0;end<s.length();end++)
        {
            char currentchar=s.charAt(end);
            for(int i=start;i<end;i++)
            {
                if(s.charAt(i)==currentchar)
                {
                    start=i+1;
                    break;
                }
            }
            if(end-start+1>maxlength)
            {
                maxlength=end-start+1;
                startIndex=start;
            }
        }
        String longestSubString=s.substring(startIndex, startIndex+maxlength);
        System.out.println("longestSubString: "+longestSubString);
        System.out.println("length of longest substring is: "+maxlength);
    }  
    
    public static void main(String args[])
    {
        String input1="abcabcbb";
        System.out.println("input is: "+input1);
        findLongestSubstring(input1);
        String input2="pwwkew";
        System.out.println("input is: "+input2);
        findLongestSubstring(input2);
    }
}
