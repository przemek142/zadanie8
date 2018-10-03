package zadanie8_2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayContent[] arrayContents = new ArrayContent[3];
        Scanner scanner = new Scanner(System.in);

        arrayContents[0] = createArrayContent(scanner, 0);
        System.out.println(displayArray(arrayContents));

        for (int i = 1; i < arrayContents.length; i++) {
            arrayContents[i] = createArrayContent(scanner, i);
            while (isInside(arrayContents, arrayContents[i], i)) {
                System.out.println("Object exist, once again:\n" + displayArray(arrayContents));
                arrayContents[i] = createArrayContent(scanner, i);
            }
        }
    }

    static boolean isInside(ArrayContent[] arrayContects, ArrayContent arrayContect, int current) {
        boolean ret = false;
        for (int i = 0; i < current; i++) {
            if (arrayContect.equals(arrayContects[i]))
                ret = ret || true;
        }
        return ret;
    }

    static ArrayContent createArrayContent(Scanner scanner, int curent) {
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

        return new ArrayContent(str1, int1);
    }

    static String displayArray(ArrayContent[] arrayContents) {
        String str = "";
        for (int i = 0; i < arrayContents.length; i++) {
            if (i == 0)
                str = arrayContents[i].toString();
            else if (arrayContents[i] == null) {
                str += ", null";
            } else
                str += ", " + arrayContents[i].toString();
        }
        return str;
    }
}
