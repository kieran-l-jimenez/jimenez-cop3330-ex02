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
        String input = in.nextLine();

        String output = input + " has " + input.length() + " characters.";

        System.out.println(output);

    }


}
