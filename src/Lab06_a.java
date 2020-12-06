public class Lab06_a {
    public static void main(String[] args)
    {
        String str = "CS102 is the best";
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
