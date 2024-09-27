import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadNumberFile1 {
    public static void main(String[] args) {
        // Specify the file path for reading numbers
        String filePath = "../txtFiles/Exercise1/numbers1.txt";  

        // Create a file object for the specified path
        File numberFile = new File(filePath);

        // Check if the file is available
        if (!numberFile.exists()) {
            System.out.println("File not found: " + filePath);
            return;  // Exit the program if file doesn't exist
        }

        try {
            // Open the file using Scanner
            Scanner fileReader = new Scanner(numberFile);

            // Read each line and display the numbers
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                int num = Integer.parseInt(line); 
                System.out.println(num);
            }

            // Close the scanner after reading
            fileReader.close();
        } catch (FileNotFoundException e) {
            // Handle case if file couldn't be found
            System.out.println("Unable to locate the file.");
        }
    }
}
