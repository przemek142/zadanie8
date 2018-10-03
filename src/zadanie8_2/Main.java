package zadanie8_2;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TableContent[] tableContents = new TableContent[3];
        Scanner scanner = new Scanner(System.in);

        tableContents[0] = createTableContent(scanner, 0);
        System.out.println(displayArray(tableContents));

        for (int i = 1; i < tableContents.length; i++) {
            tableContents[i] = createTableContent(scanner, i);
            while (isInside(tableContents, tableContents[i], i)) {
                System.out.println("Object exist, once again:\n" + displayArray(tableContents));
                tableContents[i] = createTableContent(scanner, i);
            }
            System.out.println(Arrays.toString(tableContents));
        }
    }

    static boolean isInside(TableContent[] tableContects, TableContent tableContect, int current) {
        boolean ret = false;
        for (int i = 0; i < current; i++) {
            if (tableContect.equals(tableContects[i]))
                ret = ret || true;
        }
        return ret;
    }

    static TableContent createTableContent(Scanner scanner, int curent) {
        String str1="";
        int int1=0;
        boolean notOK;

        do {
            notOK = false;

            try {
                System.out.println("enter int(" + curent + "):");
                int1 = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Not an int");
                notOK = notOK || true;
            }
            scanner.nextLine();

            if (!notOK) {
                try {
                    System.out.println("enter string(" + curent + "):");
                    str1 = scanner.nextLine();
                } catch (InputMismatchException e) {
                    System.out.println("Not a String");
                    notOK = notOK || true;
                }
            }
        } while (notOK);
        return new TableContent(str1, int1);
    }

    static String displayArray(TableContent[] tableContents) {
        String str = "";
        for (int i = 0; i < tableContents.length; i++) {
            if (i == 0)
                str = tableContents[i].toString();
            else if (tableContents[i] == null) {
                str += ", null";
            } else
                str += ", " + tableContents[i].toString();
        }
        return str;
    }
}
