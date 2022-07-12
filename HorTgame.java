import java.util.Random;
import java.util.Scanner;

public class HorTgame {
    
    HorTgame()
    {
    }

    public static void main( String[] args)
    {
	Scanner sc = new Scanner(System.in);

	System.out.println("Who are you?");
	String name = sc.nextLine();
	System.out.println("Hello, " + name);
       
	System.out.println("Tossing a coin...");

	Random random = new Random();
	int randomValue = random.nextInt(2);
	int i;
	
	for( i = 1 ; i <= 3; i++ )
	{
	    System.out.print("Round " + i + ": ");

	    if(random.nextInt(2)+1 == 1)
	    {
		System.out.println("Heads");
	    }
	    else
	    {
		System.out.println("Tails");
	    }

	}

	System.out.println("Heads: 1, Tails: 2");
	
    }
}
	    
