import java.util.Random; //import the random class in java

public class RandomCharacter
{
    public char getRandomLowerCaseLetter()
    {
        Random rand = new Random(); //Create a random object
        return (char)(rand.nextInt(26)+'a'); //return a random lowercase letter using nextint which returns an integer from 0 to 26 as 26 is passed in as an argument. Eventually +'a' as it is determined from ascii table, making it a lowercase letter. 
    }

    public char getRandomUpperCaseLetter()
    {
        Random rand = new Random(); //Create a random object
        return (char)(rand.nextInt(26)+'A'); //return a random uppercase letter using nextint which returns an integer from 0 to 26 as 26 is passed in as an argument. Eventually +'A' as it is determined from ascii table, making it a uppercase letter. 
    }

    public int getRandomDigitCharacter()
    {
        Random rand = new Random(); //Create a random object
        return rand.nextInt(0, 9); //return a random digit character using nextint which returns an integer from 0 to 9 as 0 and 9 is passed in as an argument
    }
    
    public char getRandomCharacter()
    {
        Random rand = new Random(); //Create a random object
        int upperorlower = rand.nextInt(0,1); //obtain random digit character using nextin which returns either 0 or 1 as 0 and 1 is passed in as an argument
        if(upperorlower == 0) //if is 0
        {
            return getRandomLowerCaseLetter(); //return lowercase letter
        }
        else
        {
            return getRandomUpperCaseLetter(); //return uppercase letter
        }
    }
}
