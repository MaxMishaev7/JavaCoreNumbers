import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        int[] numList = {1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4};
        List<Integer> streamNumList = Arrays.stream(numList)
                .filter(x -> x > 0)
                .filter(x -> x % 2 == 0)
                .sorted()
                .boxed()
                .collect(Collectors.toList());
        System.out.println("Stream API");
        System.out.println(streamNumList);
    }
}
