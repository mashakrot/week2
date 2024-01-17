package main;

public class Hedgehog 
{
    private String name;
    private int age;

    public Hedgehog() {
        name = "Pikseli";
        age = 5;
    }

    public String printName(){
        // System.out.println(name);
        return name;
    }

    public Hedgehog(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void printString(){
        System.out.println("I am " + name + " and my age is " + age + ", but could you still give me input values?");
    }
}

