import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Kieran Jimenez
 */

public class App
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("What is the input string? ");
        String name = in.nextLine();

        String output = name + " has " + name.length() + " characters.";

        System.out.println(output);

    }


}
