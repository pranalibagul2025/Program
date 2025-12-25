package PQDate211225;

public class WordCount {
    public static void main(String[] args)
    {
        String str = "Hellow word is a comman";
        String[] words = str.trim().split("//s+");
        int WordCount = words.length;
        System.out.println("Numbers of wordscount:"+words);
    }
}
