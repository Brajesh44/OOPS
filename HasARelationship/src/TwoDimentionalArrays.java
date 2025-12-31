import java.util.Arrays;
import java.util.Comparator;

public class TwoArraysCommonElement  {

    public static void main(String[] args) {
        int[] array1 = {3, 4, 5, 2, 1, 7, 12};
        int[] array2 = {1, 8, 4, 5, 2, 1, 7, 6, 12};

        System.out.println("Array 1: " + Arrays.toString(array1));
        System.out.println("Array 2: " + Arrays.toString(array2));

        // 🔧 Sort both arrays
        Arrays.sort(array1);
        Arrays.sort(array2);

        int[] temp = new int[Math.min(array1.length, array2.length)];
        int i = 0, j = 0, index = 0;

        while (i < array1.length && j < array2.length) {
            if (array1[i] == array2[j]) {
                if (index == 0 || temp[index - 1] != array1[i]) {
                    temp[index++] = array1[i];
                }
                i++;
                j++;
            } else if (array1[i] < array2[j]) {
                i++;
            } else {
                j++;
            }
        }
        int[] result=new int[index];
        for(int k=0; k<index; k++)
        {
            result[k]=temp[k];
        }

       // int[] result = Arrays.copyOf(temp, index);
        System.out.println("Common elements array: " + Arrays.toString(result));



        String[] array3 = {"apple", "banana", "cherry", "date"};
        String[] array4 = {"cherry", "date", "fig", "grape"};

        System.out.println("Array 1: " + Arrays.toString(array3));
        System.out.println("Array 2: " + Arrays.toString(array4));

        // Sort both arrays (case-insensitive)
        Arrays.sort(array3, String::compareToIgnoreCase);
        Arrays.sort(array4, String::compareToIgnoreCase);


        String[] temp1 = new String[Math.min(array3.length, array4.length)];
        int index1 = 0 , m = 0, n = 0;

        while (m < array3.length && n < array4.length) {
            int comparison = array3[m].compareToIgnoreCase(array4[n]);

            if (comparison == 0) {
                // Avoid duplicates
                if (index1 == 0 || !temp1[index1 - 1].equalsIgnoreCase(array3[m])) {
                    temp1[index1++] = array3[m];
                }
                m++;
                n++;
            } else if (comparison < 0) {
                m++;
            } else {
                n++;
            }
        }

        // Create a properly sized result array
        String[] commonWords = Arrays.copyOf(temp1, index1);

        // Print result
        System.out.println("Common words array: " + Arrays.toString(commonWords));
    }


}
