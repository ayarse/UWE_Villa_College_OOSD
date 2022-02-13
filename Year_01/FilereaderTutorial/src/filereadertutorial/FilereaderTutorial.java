package filereadertutorial;

import java.io.FileReader;
import java.util.Scanner;

/**
 *
 * @author Ayas Nasih - S1600655
 */
public class FilereaderTutorial {

    public static void main(String[] args) {

        Scanner scan;

        try {

            String strCurLine;
            int curLineNo = 0;

            scan = new Scanner(new FileReader("Names.txt"));
            while (scan.hasNext()) {
                strCurLine = scan.next();
                System.out.println("Line " + curLineNo + " : " + strCurLine);
                curLineNo++;
            }

        } catch (Exception e) {
            System.out.println(e.toString());
        } finally {
            System.out.println("============== End Of File! ==============");
        }

    }

}
