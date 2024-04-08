package Array_Practice_Program;

import org.testng.annotations.Test;
import java.util.Arrays; // Importing Arrays class

public class Array_unique_2Integer {

    @Test
    public void test1() 
    {
        int[] a = {1, 3, 5, 7, 9};
        int[] a1 = {1, 3, 5, 8, 10};
        int[] a2 = new int[a.length + a1.length];
        int k = 0;
        
        // Merge the two arrays into a single array
        for (int i = 0; i < a2.length; i++) 
        {
            if (i < a.length) 
            {
                a2[i] = a[i];
            } 
            else
            {
                a2[i] = a1[k];
                k++;
            }
        }
        
        // Sort the merged array
        Arrays.sort(a2);
        
        // Print unique values
        int n = a2.length;
        if (n == 0) return;

        // First element is always unique
        System.out.print(a2[0] + " ");

        // Check adjacent elements to find unique values
        for (int i = 1; i < n; i++) 
        {
            if (a2[i] != a2[i - 1]) 
            {
                System.out.print(a2[i] + " ");
            }
            // Skip duplicate elements
            while (i < n - 1 && a2[i] == a2[i + 1]) 
            {
                i++;
            }
        }
    }
}
