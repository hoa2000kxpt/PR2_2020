package Tut_01;

import utils.TextIO;

public class Ex3_5_CORE {
    public static void main(String[] args) {
        // Open file for reading; if it can't be opened, exit the program
        try {
            TextIO.readFile ("src\\utils\\sales.dat");
        } catch (IllegalArgumentException e) {
            System.out.println ("Can't open file \"sales.dat\" for reading!");
            System.exit (1);  // Terminates the program.
        }

         // Read the file, keeping track of total sales and missing data
        double salesTotal = 0;
        int missingCount = 0;

        while ( ! TextIO.eof() ) {

            char ch = ' ';
            double sales = 0;

            do {
                ch = TextIO.getChar();
            } while (ch != ':');

            String dataString = TextIO.getln();

            try {
                sales = Double.parseDouble(dataString);
                salesTotal += sales;
            }
            catch (NumberFormatException e) {

                missingCount++;
            }
        }

        // Report the results
        System.out.printf("Total sales recorded from all cities: $%1.2f\n\n", salesTotal);
        if (missingCount == 0)
            System.out.println("Data was received from all cities.");
        else if (missingCount == 1)
            System.out.println("Data was missing from 1 city.");
        else
            System.out.printf("Data was missing from %d cities.\n", missingCount);
    }
}

