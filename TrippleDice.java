public class TrippleDice extends Dice
{
	private int total, roll;
	
	public int Throw()
	{
		do
		{
			for (int i = 0; i < 3; i++)
			{
				roll = 1 + (int) ( Math.random() * 6); //"rolls" a random number
				total = total + roll;
				//System.out.println(roll);
			}
			if (total!=15) //if the total didn't add up, the total will be made to equal zero so that in the next loop the number starts at zero instead of the result of the last loop
					total = 0;
		}while (total!=15);
		
		
		return total;
	}
	
	public String toString()
	{
		Throw(); //calls the Throw() method
		return "Your 3 rolls add up to " + total;
	}
}