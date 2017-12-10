public class Driver
{
	public static void main(String [] args)
	{
		Dice oneDice = new Dice();
		TrippleDice tripDice = new TrippleDice();
		TrippleDiceE threeDice = new TrippleDiceE();
		
		System.out.println(oneDice.toString());
		System.out.println(tripDice.toString());
		System.out.println(threeDice.toString());
	}
}
