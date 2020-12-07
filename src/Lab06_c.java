import java.util.Scanner;

/**
 * A class finds the binary strings
 * author: Miray Ayerdem
 * date: 08/12/2020
 */
public class Lab06_c
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String str;
        System.out.println("Enter the length of binary: ");
        int n = in.nextInt();

        str = "";
        System.out.println(findBinaryStrings(1, str, n, '0') + findBinaryStrings(1,str, n, '1'));


    }

    /**
     * a method to find the binary string without consecutive 1's
     * @param n the size of the current string
     * @param str string to be expanded
     * @param size the size of the binary strings
     * @param c the char to be added
     * @return the the binary strings
     */
    public static String findBinaryStrings(int n, String str, int size, char c)
    {
        str = str + c;
        if(n == size)
            return str + " ";
        if(str.charAt(n - 1) == '0')
        {
            return findBinaryStrings(n + 1, str, size, '0') + " " + findBinaryStrings(n + 1, str, size, '1');
        }
        else
        {
            return findBinaryStrings(n + 1, str, size, '0');
        }

    }

}
