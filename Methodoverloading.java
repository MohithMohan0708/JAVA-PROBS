public class Methodoverloading
  {
public static void main(String args[])
{
    Calculator obj= new Calculator();
    double result=obj.add(3,4,10);
    System.out.println(result);

}
  }
class Calculator
{
    public int add (int n1 ,int n2)
    {
        return n1+n2;
    }
    public int add(int n1,int n2,int n3)
    {
        return n1+n2+n3;
    }
    public double add(int n1,double n2)
    {
        return n1+n2;
    }
}