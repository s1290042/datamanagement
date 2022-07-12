import java.util.Random;

public class HorTgame {
    
    HorTgame()
    {
    }

    public static void main( String[] args)
    {
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
	
    }
}
	    
