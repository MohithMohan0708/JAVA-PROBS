public class Jaggedarr 
{
  public static void main(String args[])
  {
    int i;
    int j;
    int nums[][]=new int[3][];
    for(i=0;i<nums.length;i++)
    {
        for(j=0;j<nums[i].length;j++)
        {
            nums[i][j]=(int)(Math.random()*10);
        }
    }
    for(i=0;i<nums.length;i++)
    {
        for(j=0;j<nums[i].length;j++)
        {
           System.out.print(nums[i][j]);
        }
         System.out.println();
    } 
  }    
}
