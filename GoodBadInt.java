import java.util.Scanner;
class GoodBadInt
{
    public static void main(String args[])
    {
        int i,j;
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int b[]=new int[n];
        for(i=1;i<=n;i++)
        {
         int num = scan.nextInt();
           (new int[n])[i]=num;
        }
        for(i=1;i<=n;i++)
        {
            b[i]=(new int[n])[i];
        }
        for(i=0;i<n-1;i++)
        {
            for(j=0;j<n-i-1;j++)
            {
                if((new int[n])[j]>(new int[n])[j+1])
                {
                    int temp=(new int[n])[j];
                    (new int[n])[j]=(new int[n])[j+1];
                    (new int[n])[j+1]=temp;
                }
            }
        }
        int sum1=0,sum2=0;
        for(i=1;i<=n;i++)
        {
            if((new int[n])[i]==b[i])
             sum1 +=(new int[n])[i];
            else
             sum2 +=(new int[n])[i]; 
        }
        System.out.println(sum1-sum2);    
        scan.close();
    }
}