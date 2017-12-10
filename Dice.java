public class Dice
{
    private int roll;
   
    public Dice()
    {
        roll = 1 + (int) ( Math.random() * 6); //initializes roll as a random number 
    }
   
    public int Throw()
    {
        return roll; //returns the one roll when called
    }
    
    public String toString()
    {
    	return "Your roll is " + roll;
    }
}