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
	int h_c=0;
	int t_c=0;
	
	for( i = 1 ; i <= 3; i++ )
	{
	    System.out.print("Round " + i + ": ");

	    if(random.nextInt(2)+1 == 1)
	    {
		System.out.println("Heads");
		h_c++;
	    }
	    else
	    {
		System.out.println("Tails");
		t_c++;
	    }

	}

	System.out.println("Heads: " + h_c +", Tails: " + t_c);

	if( h_c > t_c ) System.out.println( name + " won");
	else System.out.println(name + " lost");
	
    }
}
	    
