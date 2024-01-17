package main;
import java.util.Scanner;
import java.util.ArrayList;

public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);

        Hedgehog newHedgehog = new Hedgehog();
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
                        if (line.isEmpty()){
                            newHedgehog.printString();
                        } else {   
                            String text =  newHedgehog.printName();
                            System.out.println(text + ": " + line);
                        }
                        break;
                    case 2:
                        try {
                            System.out.println("What is the name of the hedgehog:");
                            
                            String name = sc.nextLine();
                            System.out.println("What is the age of the hedgehog:");
                            String ageStr = sc.nextLine();
                            int age = Integer.parseInt(ageStr);
                            
                            newHedgehog = new Hedgehog(name, age);
                            break;
                        } 
                        catch(Exception e) {
                            System.out.println("Wrong input value");
                            break;
                        }
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

