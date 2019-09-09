package javamavenexample;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String Doggo = "Woofy";
        Integer OldBoy = 11;
        System.out.println( "This is admittedly not the most complicated program" );
        Dog myDog = new Dog(Doggo,OldBoy);

        System.out.println("I have a dog called "+myDog.DogName+" and he is "+myDog.DogAge+" years old");
    }
}
