

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadNumberFile4 {
    public static void main(String[] args) {
        // Specify the path to the file that contains the numbers
        String path = "../txtFiles/Exercise1/numbers6.txt";  

        // Create a File object for the specified path
        File inputFile = new File(path);

        // Verify whether the file exists
        if (!inputFile.exists()) {
            System.out.println("Error: The file " + path + " was not found.");
            return;  // Exit the program if the file is missing
        }

        try {
            // Open the file for reading using Scanner
            Scanner fileScanner = new Scanner(inputFile);

            // Variable to track the number of printed items
            int itemCounter = 0;

            // Read each line from the file
            while (fileScanner.hasNextLine()) {
                String currentLine = fileScanner.nextLine();
                Scanner lineReader = new Scanner(currentLine);

                // Process each text in the current line
                while (lineReader.hasNext()) {
                    String textValue = lineReader.next();
                    System.out.print(textValue + " "); // Print the text followed by a space

                    itemCounter++;

                    // Print a new line after every three items
                    if (itemCounter % 3 == 0) {
                        System.out.println();  // Move to the next line after printing three items
                    }
                }

                // Close the line reader
                lineReader.close();
            }

            // Close the file scanner
            fileScanner.close();
        } catch (FileNotFoundException e) {
            // Handle the case where the file is not found
            System.out.println("Error: Unable to locate the specified file.");
        } catch (NumberFormatException e) {
            // Handle cases where the file does not contain valid data
            System.out.println("Error: The file contains invalid data.");
        }
    }
}
