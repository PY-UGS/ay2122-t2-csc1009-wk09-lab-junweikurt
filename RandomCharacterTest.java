import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;
import org.junit.jupiter.api.RepeatedTest;
public class RandomCharacterTest 
{
    RandomCharacter rc = new RandomCharacter(); //create a randomcharacter object
    // repeat test 15 times
    @RepeatedTest(value = 15)
    public void testGetRandomLowerCaseLetter()
    {
        int asciival = rc.getRandomLowerCaseLetter(); //get random lowercase letter
        assertTrue(asciival>=97&&asciival<=122); //test if random lowercase letter falls between 97 and 122 based on the ascii table as it represents lowercase letters
    }
    // repeat test 15 times
    @RepeatedTest(value=15)
    public void testGetRandomUpperCaseLetter()
    {
        int asciival = rc.getRandomUpperCaseLetter(); //get random uppercase letter
        assertTrue(asciival>=65&&asciival<=90);  //test if random uppercase letter falls between 65 and 90 based on the ascii table as it represents uppercase letters
    }
    // repeat test 15 times
    @RepeatedTest(value = 15)
    public void testGetRandomDigit()
    {
        int intval = rc.getRandomDigitCharacter(); //get random digit character from 0 to 9
        assertTrue(intval>=0 && intval<=9); //test if random digit character falls between 0 and 9
    }
    // repeat test 15 times
    @RepeatedTest(value=15)
    public void testGetRandomCharacter() 
    {
        int asciival = rc.getRandomCharacter(); //get random character
        assertTrue((asciival>=97&&asciival<=122)||(asciival>=65&&asciival<=90)); //test if random character falls between 97 and 122 OR between 65 and 90 based on the ascii table
    }
    @Test 
    public void testIsPrime()
    {
        int intval = rc.getRandomDigitCharacter(); //get random digit character
        boolean isPrime = true; //set boolean to true
        for(int i = 2; i < intval; i++) //iterate through loop
        {
            // if number is exactly divisble 
            if(intval%i==0)
            {
                isPrime = false;
                // check if results is true or false
                assertTrue(isPrime);
                return;
            }
        }
        // check if results if correct for true
        assertTrue(isPrime);
    }
}
