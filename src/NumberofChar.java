import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class NumberofChar {
    public static void main(String[] args) throws IOException {
        int countWord = 0;
        int sentenceCount = 0;
        int characterCount = 0;
        int paragraphCount = 0;
        int whitespaceCount = 0;
        int blackspaceCount = 0;
        String line = "";

        String fileName = "testFileChar.txt";
        File newfile = new File(fileName);
        Scanner sc = null;

        try {
            sc = new Scanner(newfile);
            while (sc.hasNextLine()) {
                line = sc.nextLine();
                    paragraphCount++;

                    characterCount += line.length();

                    String[] words = line.split("\\s+");

                    countWord += words.length;
                    whitespaceCount += countWord - 1;

                    String[] snetenceList = line.split("[!?.:]+");
                    sentenceCount += snetenceList.length;

            }
        }
             catch(FileNotFoundException e){
                    e.printStackTrace(); }

        sc.close();
        blackspaceCount = characterCount - whitespaceCount;

        System.out.println("Ilośc słów to: " + countWord);
        System.out.println("Ilość zdań to: " + sentenceCount);
        System.out.println("Ilośc znkaów to: " + characterCount);
        System.out.println("Ilośc wierszy to: " + paragraphCount);
        System.out.println("Ilość białych znaków: " + whitespaceCount);
        System.out.println("Ilość czarnych znaków: " + blackspaceCount);
    }
}
