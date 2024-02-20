public class Newswitch 
{
    public static void main(String args[])
    {
        String day= "monday";
        switch(day)
        {
            case "monday","tuesday"-> System.out.println("6am");
            case"wednesday","thursday"-> System.out.println("7am");
            case"friday","saturday"->System.out.println("8am");
            default->System.out.println("10am");
        }
    }
}
