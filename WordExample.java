import java.util.*;
public class WordExample {
    private String strdata;

    WordExample(String str) {
        strdata = str.trim();     
	}

   boolean isVowel(char ch) {
        return ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
    }

    void countWord() {
        String sentence = strdata;
        if (sentence.endsWith(".") || sentence.endsWith("?") || sentence.endsWith("!")) {
            sentence = sentence.substring(0, sentence.length() - 1);
        }

        String[] words = sentence.split("\\s+");
        int count = 0;

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (!word.equals("")) {
                char first = word.charAt(0);
                char last = word.charAt(word.length() - 1);
                if (isVowel(first) && isVowel(last)) {
                    count++;
                }
            }
        }

        System.out.println("Number of words beginning and ending with a vowel: " + count);
    }

      void placeWord() {
        String sentence = strdata;
        if (sentence.endsWith(".") || sentence.endsWith("?") || sentence.endsWith("!")) {
            sentence = sentence.substring(0, sentence.length() - 1);
        }

        String[] words = sentence.split("\\s+");
        String vowelWords = "";
        String otherWords = "";

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (!word.equals("")) {
                char first = word.charAt(0);
                char last = word.charAt(word.length() - 1);
                if (isVowel(first) && isVowel(last)) {
                    vowelWords += word + " ";
                } else {
                    otherWords += word + " ";
                }
            }
        }

        String result = vowelWords + otherWords;
        System.out.println("Rearranged Sentence: " + result.trim());
    }

      public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String str=sc.nextLine();
        WordExample obj = new WordExample(str);
        obj.countWord();
        obj.placeWord();
    }
}
