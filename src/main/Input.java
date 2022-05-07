package main;

import java.util.Scanner;

public class Input {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static String inputCarNameMessage() {
        Output.printNameInputMessage();
        return SCANNER.next();
    }

    public static int inputRepeatCountMessage() {
        Output.printNumberTimeInputMessage();
        return SCANNER.nextInt();
    }

}
