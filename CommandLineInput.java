public class CommandLineInput
 {
    public static void main(String[] args) 
	{
        // Check if command line arguments are provided
        if (args.length < 4)
			{
            System.out.println("Please provide your name, age , gender , occupation as command line arguments.");
            return;
        }

        // Retrieve details from command line arguments
        String name = args[0];
        int age = Integer.parseInt(args[1]);
		String gender = args[2];
        String occupation = args[3];

        // Print the details
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("gender: " + gender);
		System.out.println("Occupation: " + occupation);
    }
}
