import java.util.*;

class RemVowel
{
    static String removeVowels(String str) 
    {
        return str.replaceAll("[AEIOUaeiou]", "");
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.println("Without Vowels: " + removeVowels(str));
    }
}
