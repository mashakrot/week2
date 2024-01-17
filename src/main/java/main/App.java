package main;
import java.util.Scanner;
import java.util.ArrayList;

public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);

        Hedgehog newHedgehog = new Hedgehog();;
        boolean exit = false;
        while(!exit) {
            System.out.println("1) Make hedgehog talk, 2) Create new hedgehog, 3) Make hedgehog run, 0) Quit");
            
            if(sc.hasNext()) {
                int i = 0;
                String stringInput = sc.nextLine();
                i = Integer.parseInt(stringInput);

                switch (i) {
                    case 1:
                        System.out.println("What does hedgehog say?");
                        String line = sc.nextLine();
                        
                        String text =  newHedgehog.printName();
                        // text = text.concat(line);
                        System.out.println(text + ": " + line);
                        
                        break;
                    
                    case 0:
                        System.out.println("Thank you for using the program.");
                        exit = true;
                        break;

                    default:
                        System.out.println("Wrong input!");;
                        break;
                }

            }
            
        }
        

    }
}

