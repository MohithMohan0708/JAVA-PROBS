public class Twodimarr 
{
 public static void main(String args[])
 {
    int i,j;
    int nums[][]=new int[3][4];
    for(i=0;i<3;i++)
    {
        for(j=0;j<4;j++)
        {
            nums[i][j]=(int)(Math.random()*10);
        }
    }
    for(i=0;i<3;i++)
    {
        for(j=0;j<4;j++)
        {
            System.out.print(nums[i][j]+" ");
        }
        System.out.println();
    }
 }    
}
