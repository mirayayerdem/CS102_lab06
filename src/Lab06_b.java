import java.util.Scanner;

/**
 * A class finds the number of non-vowels in the input
 * @author: Miray Ayerdem
 * @date: 06/12/2020
 */
public class Lab06_b {

    private static final String NON_VOWELS = "bcdfghjklmnprstvyzqx";

    //Main Method
    public static void main(String[] args)
   {
       Scanner in = new Scanner(System.in);
       System.out.println("Please enter a letter:");
       String str = in.nextLine();
       str = str.toLowerCase();
       System.out.println(lengthOfNonVowels(str, str.length()));

    }

    /**
     * a method to check whether the char is non-vowel or not
     * @param ch to be checked
     * @return 1 or 0
     */
    public static int isNonVowel(char ch)
    {
        if(NON_VOWELS.contains(ch + ""))
            return 1;
        return 0;
    }

    /**
     * a method to find the number of non-vowels
     * @param str the letters to be checked
     * @param length the length of the strings
     * @return finally the number of non-vowels
     */
    public static int lengthOfNonVowels(String str, int length)
    {
        if( length == 1)
            return isNonVowel(str.charAt(0));

        return lengthOfNonVowels(str,length - 1) + isNonVowel(str.charAt(length - 1));
    }
}
