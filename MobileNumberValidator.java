public class MobileNumberValidator {
    public static void main(String args[])
    {
        try
        {
            ValidateMobileNumber("9491404526");
            ValidateMobileNumber("720757891@");
            ValidateMobileNumber("7275789181");
            ValidateMobileNumber("72075789@#");
        }
        catch(InvalidArrayIndexException e)
        {
            System.out.println("InvalidArrayIndexOutOfBounds Exception"+e.getMessage());
        }
        catch(LengthNotSufficientException e)
        {
            System.out.println("InvalidLengthNotSufficient Exception "+e.getMessage());
        }
        catch(NumberFormatException e)
        {
            System.out.println("NumberFormatException "+e.getMessage());
        }
    }   
    static void ValidateMobileNumber(String mobileNumber)throws InvalidArrayIndexException,LengthNotSufficientException,NumberFormatException
    {
        if(mobileNumber.length()<10)
        {
            throw new LengthNotSufficientException("less than length of 10");
        }
        else if(mobileNumber.length()>10)
        {
            throw new InvalidArrayIndexException("exceeds length of 10");
        }
        else if(!mobileNumber.matches("\\d+"))
        {
            throw new NumberFormatException("contains non-digit numbers");
        }
        else
        {
            System.out.println("Valid number");
        }
    }
}

class InvalidArrayIndexException extends Exception{
    public InvalidArrayIndexException(String message)
    {
        super(message);
    }
}

class LengthNotSufficientException extends Exception
{
    public LengthNotSufficientException(String message)
    {
        super(message);
    }
}
