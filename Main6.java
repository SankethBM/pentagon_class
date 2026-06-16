import java.io.*;

class EmptyFileException extends Exception {
    EmptyFileException(String msg) {
        super(msg);
    }
}

class FileProcessor {

    void writeFile(String fileName, String data) throws IOException {
        FileWriter fw = new FileWriter(fileName);
        fw.write(data);
        fw.close();
        System.out.println("Data written successfully.");
    }

    void readFile(String fileName) throws IOException, EmptyFileException {
        File file = new File(fileName);

        if (file.length() == 0) {
            throw new EmptyFileException("File is empty.");
        }

        BufferedReader br = new BufferedReader(new FileReader(file));
        String line;

        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }

        br.close();
    }
}

public class Main6 {
    public static void main(String[] args) {

        FileProcessor fp = new FileProcessor();

        try {
            fp.writeFile("sample.txt", "");
            fp.readFile("sample.txt");

        } catch (FileNotFoundException e) {
            System.out.println("File not found.");

        } catch (EmptyFileException e) {
            System.out.println(e.getMessage());

        } catch (IOException e) {
            System.out.println("I/O Error occurred.");
        }
    }
}
