import java.util.Arrays;
import java.util.stream.Stream;

public static void main(String[] args) {
    
    String result = solution("-1 -2 -3 -4");
    System.out.println("Hello World! \n" + result);

}

public static String solution(String s) {
    int[] splitNum = Arrays.stream(s.split(" "))
            .mapToInt(Integer::parseInt)
            .toArray();
    /*
    List<String> a = Arrays.asList(s.split(" "));				// String[] splitA = s.split(" ");
    Stream<Integer> streamA = a.stream().map(Integer::parseInt);
    List<Integer> listA = streamA.toList();
    int[] arrayA = listA.stream()
            .mapToInt(Integer::intValue)
            .toArray();
    */

    int max = Arrays.stream(splitNum).max().orElse(0);
    int min = Arrays.stream(splitNum).min().orElse(0);

    return Integer.toString(min) + " " + Integer.toString(max);
}