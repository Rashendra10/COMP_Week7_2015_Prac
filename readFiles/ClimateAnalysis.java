import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ClimateAnalysis {
    public static void main(String[] args) {
        // Specify the file path to read temperature data
        String dataFilePath = "../txtFiles/Exercise2/TempChange_1961-2022.txt";

        // Create a File object to access the file
        File dataFile = new File(dataFilePath);

        // Verify if the file exists
        if (!dataFile.exists()) {
            System.out.println("Error: The file " + dataFilePath + " was not found.");
            return;  // Exit if the file is missing
        }

        try {
            // Open the file for reading using Scanner
            Scanner fileScanner = new Scanner(dataFile);

            // Print the file header information
            System.out.println("Processing File: TempChange_1961-2022.txt\n");
            System.out.println("---------------------------------------");
            System.out.printf("%-18s %-12s %s\n", "Country", "Code", "Avg Temp Change");

            // Read each line of the file
            while (fileScanner.hasNextLine()) {
                String dataLine = fileScanner.nextLine();

                // Split the line into parts based on spaces or tabs
                String[] dataParts = dataLine.split("\\s+");

                // Ensure there are enough parts to process (Country, Code, Numbers)
                if (dataParts.length > 2) {
                    String countryName = dataParts[0];
                    String countryCode = dataParts[1];

                    // Calculate the sum of numeric values and the count
                    double totalTempChange = 0;
                    int valueCount = 0;
                    
                    for (int i = 2; i < dataParts.length; i++) {
                        try {
                            totalTempChange += Double.parseDouble(dataParts[i]);
                            valueCount++;
                        } catch (NumberFormatException e) {
                            System.out.println("Skipping invalid value: " + dataParts[i]);
                        }
                    }

                    // Compute the average temperature change
                    double avgTempChange = (valueCount > 0) ? totalTempChange / valueCount : 0;

                    // Display the processed results
                    System.out.printf("%-18s %-12s %.3f\n", countryName, countryCode, avgTempChange);
                }
            }

            // Close the file scanner
            fileScanner.close();
        } catch (FileNotFoundException e) {
            // Handle missing file exception
            System.out.println("Error: Unable to locate the file.");
        }
    }
}
