package main;
import java.util.Scanner;

public class App 
{
    public static void speak(String userInput, String name)
    {
        System.out.println(name + ": " + userInput);
        
    }


    public static void main( String[] args )
    {
        Hedgehog hedgehog1 = new Hedgehog();

        hedgehog1.name = "Pikseli";
        hedgehog1.age = 5;
        hedgehog1.display();

        Scanner myObj = new Scanner(System.in);
        System.out.println("What does hedgehog say?");

        String userInput = myObj.nextLine();
        speak(userInput, hedgehog1.name);
    }
}

