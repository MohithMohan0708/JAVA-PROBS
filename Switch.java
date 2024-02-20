public class Switch 
{
    public static void main(String args[])    
    {
        String day= "wednesday";
        switch(day)
        {
            case "monday","tuesday":
            System.out.println("6am");
            break;
            case"wednesday","thursday":
            System.out.println("7am");
            break;
            case"friday","saturday":
            System.out.println("8am");
            break;
            default:
            System.out.println("10am");
            break;
        }
    }
}
