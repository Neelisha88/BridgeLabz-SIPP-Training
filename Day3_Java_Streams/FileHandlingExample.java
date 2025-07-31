package Day3_Java_Streams;

import java.io.*;

public class FileHandlingExample {
    public static void main(String[] args) {
        String sourcePath = "source.txt";
        String destinationPath = "destination.txt";

        try (
            FileInputStream fis = new FileInputStream(sourcePath);
            FileOutputStream fos = new FileOutputStream(destinationPath)
        ) {
            int byteData;
            while ((byteData = fis.read()) != -1) {
                fos.write(byteData);
            }
            System.out.println("File copied successfully.");
        } catch (FileNotFoundException e) {
            System.out.println("Source file not found: " + sourcePath);
        } catch (IOException e) {
            System.out.println("An error occurred while reading or writing the file.");
            e.printStackTrace();
        }
    }
}