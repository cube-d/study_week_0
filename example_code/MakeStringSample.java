import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MakeStringSample {

    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(1, 2, 3, 4, 5, 6);

        StringBuilder stringBuilder = new StringBuilder();

        for (Integer num : input) {
            stringBuilder.append(String.valueOf(num));
            stringBuilder.append(" : ");

        }
        System.out.println(stringBuilder.toString());

        String result = input.stream().map(String::valueOf).collect(Collectors.joining(" : "));

        System.out.print(result);
    }
}
