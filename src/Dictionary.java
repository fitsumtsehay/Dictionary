/* The code asks user to enter words and then the output will be printed out in the original and alphabetical order*/

import java.util.Arrays;
import java.util.Scanner;

public class Dictionary
{
    public static void main(String[] args)
    {
        int count;
        String temp;
        Scanner scan = new Scanner(System.in);

        //User will be asked to enter the count of strings
        System.out.print("Enter number of strings : ");
        count = scan.nextInt();


        String str[] = new String[count];
        Scanner scan2 = new Scanner(System.in);

        //User is entering the strings and they are stored in an array
        System.out.println("Enter the Strings one by one:");
        for(int i = 0; i < count; i++)
        {
            str[i] = scan2.nextLine();
        }
        scan.close();
        scan2.close();
        System.out.print("Original Order: " + Arrays.toString(str));
        System. out. println();
        //Sorting the strings
        for (int i = 0; i < count; i++)
        {
            for (int j = i + 1; j < count; j++)
            {
                if (str[i].compareTo(str[j]) > 0)
                {
                    temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
            }
        }

        //Displaying the strings after sorting them based on alphabetical order
        System.out.print("Alphabetical Order: " + Arrays.toString(str));
        {
        }}
}
