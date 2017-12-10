public class TrippleDiceE extends TrippleDice
{
private int total, roll;
	
	public int Throw()
	{
		do
		{
			for (int i = 0; i < 3; i++)
			{
				roll = 1 + (int) ( Math.random() * 6); //"rolls" a random number
				total = total + roll; // will add up the 3 rolls as it loops through the for loop
				//System.out.println(roll);
			}
			if (total!=18) //if the total didn't add up, the total will be made to equal zero so that in the next loop the number starts at zero instead of the result of the last loop
					total = 0;
		}while (total!=18);
		
		
		return total;
	}
	
	public String toString()
	{
		Throw(); //calls the Throw() method
		return "Your 3 rolls add up to " + total;
	}
}