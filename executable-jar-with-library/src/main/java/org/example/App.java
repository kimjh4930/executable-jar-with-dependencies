package org.example;

public class App 
{
    public static void main( String[] args )
    {
        Addition addition = new Addition();
        int result = addition.add(1, 2);

        System.out.println("result : " + result);
    }
}
