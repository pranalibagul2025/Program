package PQDate10122025;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class WordCount {
    public static void main(String[] args) {
        int WordCount = 0;

        try {
            BufferedReader br = new BufferedReader(new FileReader("Input.txt"));
            String line;

            while ((line = br.readLine()) != null)
            {
                String[] words = line.trim().split("\\s+");
                if (!line.trim().isEmpty()) {
                    WordCount += words.length;

                }

            }

            br.close();
            System.out.println("Total Words: " + WordCount);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
