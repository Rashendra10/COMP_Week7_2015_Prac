import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadNumberFile2 {
    public static void main(String[] args) {
        // Define the path of the file with numbers 
        String path = "../txtFiles/Exercise1/numbers3.txt";  

        // Create a File object for the specified file path
        File numberFile = new File(path);

        // Check if the file is present
        if (!numberFile.exists()) {
            System.out.println("File not found: " + path);
            return;  // Terminate the program if the file is absent
        }

        try {
            // Open the file for reading with Scanner
            Scanner fileReader = new Scanner(numberFile);

            // Variable to keep track of how many numbers have been output
            int counter = 0;

            // Read each line and process the numbers
            while (fileReader.hasNextLine()) {
                String currentLine = fileReader.nextLine();
                Scanner lineReader = new Scanner(currentLine);

                // Extract numbers from each line
                while (lineReader.hasNext()) {
                    int value = Integer.parseInt(lineReader.next());
                    System.out.print(value + " ");  // Output the number with a space

                    counter++;

                    // Start a new line after printing two numbers
                    if (counter % 2 == 0) {
                        System.out.println();  // New line every two numbers
                    }
                }

                // Close the line-level scanner
                lineReader.close();
            }

            // Close the main file scanner
            fileReader.close();
        } catch (FileNotFoundException e) {
            // Handle file not found scenario
            System.out.println("Unable to find the specified file.");
        } catch (NumberFormatException e) {
            // Handle invalid number format scenario
            System.out.println("Error: The file contains invalid number format.");
        }
    }
}
