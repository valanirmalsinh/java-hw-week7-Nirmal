package java_hw_wk7_nirmal;

/**
 * 20. Write a Java program to test if an array contains a specific value
 */
public class P20_SpecificValueArray {
    public static void main(String[] args)
    {
        int x [] = {89,35,56,73,65,57};
        System.out.println(specificvalue(x,56));
        System.out.println(specificvalue(x,100));
    }
    public static boolean specificvalue(int [] n1, int item)
    {
        for (int n : n1)
        {
            if (item == n)
            {
                return true;
            }
        }
        return false;
    }
}
