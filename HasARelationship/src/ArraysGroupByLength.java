import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TwoDimentionalArrays {

    public static void main(String[] args) {



    String[][] array = {
            {"A1", "A2"},
            {"B1", "B2"}
    };

    List<String[]> list = Arrays.asList(array);

        for (String[] arr : list) {
            System.out.print(Arrays.toString(arr));
        }

        System.out.println();
        List<List<String>> list2 = Arrays.stream(array)
                .map(Arrays::asList)
                .collect(Collectors.toList());
            System.out.print(list2);

        System.out.println();
        List<String> flatList = Arrays.stream(array)
                .flatMap(Arrays::stream)
                .collect(Collectors.toList());
        System.out.print(flatList);

        int[][] arr = {
                {1, 2},
                {3, 4},
                {4, 5}
        };

        System.out.println();
        List<Integer> flatListp = Arrays.stream(arr)
                .flatMapToInt(IntStream::of)
                .filter(i -> i != 4)
                .boxed()
                .collect(Collectors.toList());
        System.out.print(flatListp);





    }}
