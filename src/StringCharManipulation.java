import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class StringCharManipulation {

/*
Vowels and consonants

*/

    public static char[] vowels = new char[]{'a', 'e', 'i', 'o', 'u'};
    public static boolean debug = false;

    public static void main(String[] args) throws Exception {
        // write your code here

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        CharSequence inputLine;
        if (debug) inputLine = "Sam I Am.";
        else inputLine = bufferedReader.readLine();

        ArrayList<Character> vowels = new ArrayList<>();
        ArrayList<Character> nonVowels = new ArrayList<>();

        for (int i = 0; i < inputLine.length(); i++) {
            if (isVowel(inputLine.charAt(i))) vowels.add(inputLine.charAt(i));
            else if (inputLine.charAt(i) != ' ') nonVowels.add(inputLine.charAt(i));
        }
        for (Character ch : vowels) {
            System.out.print(ch + " ");
        }
        System.out.println();
        for (Character ch : nonVowels) {
            System.out.print(ch + " ");
        }

    }

    // The method checks whether a letter is a vowel
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // Convert to lowercase

        for (char d : vowels)   // Look for vowels in the array
        {
            if (c == d)
                return true;
        }
        return false;
    }

}
