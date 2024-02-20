import java.util.*;
class Defandparaconstructor 
{
    public static void main(String args[])
    {
        Human obj=new Human();
        System.out.println(obj.getName()+":"+obj.getAge());
        Human obj1=new Human(18,"mohan");
         System.out.println(obj1.getName()+":"+obj1.getAge());
        Human obj2=new Human();
         System.out.println(obj2.getName()+":"+obj2.getAge());
    }    
}
 public class Human
{
     private int age;
     private  String name;
    {
          public Human()  //default constructor
         {
           this.age=10;
           this.name="mohith";
         }

        public Human(int age,String name)
        {
            this.age=age;
            this.name=name;
        }

        public Human(int age)
        {
            this.age=age;
            name="kumar";
        } 
         
         public int getAge()
         {
            return age;
         }

         public String getName()
         {
            return name;
         }
    }
}
















