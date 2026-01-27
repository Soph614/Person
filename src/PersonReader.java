import javax.swing.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

import static java.nio.file.StandardOpenOption.CREATE;

public class PersonReader {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // name and initialize scanner
        String fileToRead;
        String line;
        String dataOutput;

        JFileChooser chooser = new JFileChooser();
        File workingDirectory = new File(System.getProperty("user.dir"));
        chooser.setCurrentDirectory(workingDirectory);

        try {
            if(chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
                File selectedFile = chooser.getSelectedFile();
                Path file = selectedFile.toPath();
                InputStream inputStream = new BufferedInputStream(Files.newInputStream(file, CREATE));
                BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
                String heading1 = String.format("%-8s %-20s %-20s %-6s %6s", "ID#", "FirstName", "LastName", "Title", "YOB");
                String heading2 = String.format("%064d", 0).replace("0", "=");
                System.out.print(heading1 + "\n");
                System.out.print(heading2 + "\n");
                while(reader.ready()) {
                    line = reader.readLine();
                    String [] dataElements;
                    dataElements = line.split(", ");
                    dataOutput = String.format("%-8s %-20s %-20s %-6s %6s", dataElements);
                    System.out.print(dataOutput);
                    System.out.println();
                }
                reader.close();
            }
            else {
                System.out.println("You did not choose a file. Program terminating. Rerun to try again.");
            }
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}