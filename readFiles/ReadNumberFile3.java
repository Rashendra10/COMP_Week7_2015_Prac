import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadNumberFile3 {
    public static void main(String[] args) {
        // Path to the file containing numbers
        String pathToFile = "../txtFiles/Exercise1/numbers5.txt";  

        // Create a File object for the specified path
        File inputFile = new File(pathToFile);

        // Verify if the file exists
        if (!inputFile.exists()) {
            System.out.println("Error: File not found - " + pathToFile);
            return;  // Exit the program if the file is not found
        }

        try {
            // Open the file using Scanner for reading
            Scanner fileScanner = new Scanner(inputFile);

            // Variable to count how many numbers have been printed
            int numberCounter = 0;

            // Read each line and process the numbers
            while (fileScanner.hasNextLine()) {
                String currentLine = fileScanner.nextLine();
                Scanner lineReader = new Scanner(currentLine);

                // Process each number in the current line
                while (lineReader.hasNext()) {
                    double numberValue = Double.parseDouble(lineReader.next());
                    System.out.print(numberValue + " ");  // Print the number followed by a space

                    numberCounter++;

                    // Start a new line after printing three numbers
                    if (numberCounter % 3 == 0) {
                        System.out.println();  // Print a new line every three numbers
                    }
                }

                // Close the line scanner
                lineReader.close();
            }

            // Close the main file scanner
            fileScanner.close();
        } catch (FileNotFoundException e) {
            // Handle the scenario where the file is not found
            System.out.println("Error: Unable to locate the file.");
        } catch (NumberFormatException e) {
            // Handle invalid number format in the file
            System.out.println("Error: File contains invalid number format.");
        }
    }
}
