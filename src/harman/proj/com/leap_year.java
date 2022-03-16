package harman.proj.com;

import java.util.Scanner;

public class leap_year {

    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);

        System.out.println("Enter Year: ");
        int year = inp.nextInt();

        if (year % 4 == 0)
        {
            System.out.println("Given year is a leap year");
        }

        else
        {
            System.out.println("Given year is not a leap year");
        }

    }
}
