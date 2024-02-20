import java.util.Scanner;

public class LetterCombinations {
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        String s=scan.nextLine();
        letter("",s);
        scan.close();
    }
    public static void letter(String emp,String p)
    {
        if(p.isEmpty())
        {
            System.out.println(emp);
            return;
        }
        int digit =p.charAt(0)-'1';
        for(int i=(digit-1)*3;i<digit*3;i++)
        {
            char c=(char)('a'+i);
            letter(emp+c,p.substring(1));
        }
    
    }
}
