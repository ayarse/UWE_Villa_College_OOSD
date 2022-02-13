package test4a;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Ayas Nasih - S1600655
 */
public class Test4A {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner scan = new Scanner(new File("input.txt"));
        ArrayList<String> moreThanEight = new ArrayList(),
                startingWithE = new ArrayList(),
                withDigit = new ArrayList();
        int lnNo = 1;

        while (scan.hasNextLine()) {
            String line = scan.nextLine();

            // Size and line number of each word in the file
            System.out.printf("Line %d - %s %d Characters. \n", lnNo, line, line.length());

            // List of words more than eight characters
            if (line.length() > 8) {
                moreThanEight.add(line);
            }

            // List of words starting from letter ‘E’
            if (line.matches("^(e|E).*$")) {
                startingWithE.add(line);
            }

            // List of words with a digit (a number)
            if (line.matches(".*\\d.*")) {
                withDigit.add(line);
            }

            lnNo++;
        }

        System.out.println("\nWords With More Than Eight Characters");
        System.out.println("---------------");
        for (String s : moreThanEight) {
            System.out.println(s);
        }

        System.out.println("\nWords Starting with `E`");
        System.out.println("---------------");
        for (String s : startingWithE) {
            System.out.println(s);

        }

        System.out.println("\nWith Digits");
        System.out.println("---------------");
        for (String s : withDigit) {
            System.out.println(s);
        }

    }

}
