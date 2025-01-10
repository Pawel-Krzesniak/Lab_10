package exercise5;

import java.io.*;
import java.net.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        String firstThreeDigits = UserInput.requestDigits();
        if (firstThreeDigits.length() != 3) {
            System.out.println("Error: Enter exactly three digits.");
            return;
        }

        BankFile bankFile = new BankFile();
        bankFile.load(firstThreeDigits);
    }
}


