import java.io.File;

/**
 * A Class to find the number of files in the directory
 * @author Miray Ayerdem
 * @date 08/12/2020
 */
public class Lab06_d
{
    public static void main(String[] args)
    {
        String dir = "C:\\Users\\ASUS\\Desktop\\01_Lab05_Ayerdem_Miray";
        File folder = new File(dir);
        File[] files = folder.listFiles();
        System.out.println(numberOfFiles(files , files.length, 0));
        for(int i = 0 ; i < folder.listFiles().length ; i++)
        {
            System.out.println(folder.listFiles()[i]);
        }
    }

    /**
     * a recursive method to find the number of files in the directory
     * @param files array of files in the directory
     * @param size size of the array
     * @param n location of the files in the array
     * @return the number of files
     */
    public static int numberOfFiles(File[] files, int size, int n)
    {
        if(n  == size)
            return n;
        if(files[n].isFile())
        {
            return numberOfFiles(files, size, n + 1);
        }
        if(files[n].isDirectory())
        {
            return numberOfFiles(files[n].listFiles(), files[n].listFiles().length, 0) + numberOfFiles(files, size, n + 1 ) - 1 ;
        }
        return n;
    }
}
