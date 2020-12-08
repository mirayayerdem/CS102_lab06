import java.util.Scanner;

public class Lab06_a
/**
 * A Class to find the number of files in the directory
 * @author Miray Ayerdem
 * @date 08/12/2020
 */{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = in.nextLine();
        System.out.println(findLengthOfStr(str));

    }

    /**
     * method to find the length of the string
     * @param str string to be found its length
     * @return the length of the string
     */
    public static int findLengthOfStr(String str)
    {
        if(str.length() == 0)
            return 0;
        return 1 + findLengthOfStr(str.substring(1));
    }

}
