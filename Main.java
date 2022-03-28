public class Main {
    public static void main(String[] args){
        RandomCharacter rc = new RandomCharacter(); //create a RandomCharacter object

        for (int i = 0; i < 15; i++) { //iterate through loop 15 times and print 
            System.out.println(rc.getRandomLowerCaseLetter());
            System.out.println(rc.getRandomUpperCaseLetter());
            System.out.println(rc.getRandomDigitCharacter());
            System.out.println(rc.getRandomCharacter());
        }
    }
}
