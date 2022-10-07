import java.lang.*;
import java.util.Arrays;
public class FrequentElementsInArray {
    public static void countFrequency(int[] arr, int n)
    {

        Arrays.sort(arr);

        // Traverse the sorted array
        for (int i = 0; i < n; i++)
        {
            int count = 1;

            // Move the index ahead whenever
            // you encounter duplicates
            while (i < n - 1 && arr[i] == arr[i + 1]) {
                i++;
                count++;
            }

            System.out.println(arr[i] + ": " + count);


            count++;
        }
    }


}
