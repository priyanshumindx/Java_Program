import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Assignment4{

    public static void main(String[] args) {

        String filePath = "sample.txt";


        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;

            System.out.println("Reading File Content");

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {

            System.err.println("Error: The file '" + filePath + "' was not found.");

        } catch (IOException e) {

            System.err.println("Error: An unexpected I/O error occurred while reading the file.");
        }
    }
}
