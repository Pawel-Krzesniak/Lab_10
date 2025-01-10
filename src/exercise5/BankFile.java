package exercise5;

import java.io.*;
import java.net.*;

public class BankFile {

    public void load(String firstThreeDigits) {
        try {
            URL url = new URL("https://ewib.nbp.pl/plewibnra?dokNazwa=plewibnra.txt");
            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));

            String line;
            boolean found = false;

            while ((line = reader.readLine()) != null) {
                if (line.startsWith("#") || line.trim().isEmpty()) {
                    continue;
                }

                String[] parts = line.split("\\s{2,}");
                if (parts.length >= 2) {
                    String bankCode = parts[0].trim();
                    String bankName = parts[1].trim();

                    if (bankCode.startsWith(firstThreeDigits)) {
                        System.out.println("Bank for account number starting with " + firstThreeDigits + ":");
                        System.out.println("Bank code: " + bankCode);
                        System.out.println("Bank name: " + bankName);
                        found = true;
                        break;
                    }
                }
            }
            reader.close();

            if (!found) {
                System.out.println("No bank found for the provided digits.");
            }

        } catch (MalformedURLException e) {
            System.out.println("Error: Invalid URL.");
        } catch (IOException e) {
            System.out.println("Error: Issue with connection or reading the file.");
        }
    }
}
