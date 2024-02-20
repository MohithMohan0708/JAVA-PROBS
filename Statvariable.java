
public class Statvariable
{
public static void main(String args[])
{
    Mobile obj=new Mobile();
    obj.price=1000;
    obj.brand="apple";
    Mobile.name="mobile phone"; //here we use class name as reference becaause name is static variable
   
    Mobile  obj1=new Mobile();
    obj1.price=1020;
    obj1.brand="moto";
    Mobile.name="keypad";


    Mobile.name="phone";    //both the objects name data will be changed
    obj.show();
    obj1.show();
}
}    

class Mobile
{
    int price;
    String brand;
    static String name;
    void show ()
    {
        System.out.println(brand+":"+price+":"+name);
    }
}
