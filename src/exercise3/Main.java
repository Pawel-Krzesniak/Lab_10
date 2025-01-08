package exercise3;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        String inputFile = "src/exercise3/lorem.txt";
        String outputFile = "src/exercise3/output.txt";

        FileReaderWriter fileReaderWriter = new FileReaderWriter();
        FileProcessor fileProcessor = new FileProcessor();

        try {
            String fileContent = fileReaderWriter.readFile(inputFile);

            String processedContent = fileProcessor.replaceSpacesWithHyphens(fileContent);

            fileReaderWriter.writeFile(outputFile, processedContent);

            System.out.println("Plik został skopiowany i przetworzony.");
        } catch (IOException e) {
            System.out.println("Wystąpił błąd podczas pracy z plikami: " + e.getMessage());
        }
    }
}
