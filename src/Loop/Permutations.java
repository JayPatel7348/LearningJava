package Loop;

/**
 * @author Jaypatel
 */
import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public static void main(String[] args) {
        String input = "JAY";
        List<String> permutations = generatePermutations(input);
        for (String permutation : permutations) {
            System.out.println(permutation);
        }
    }

    public static List<String> generatePermutations(String input) {
        List<String> permutations = new ArrayList<>();
        permute("", input, permutations);
        return permutations;
    }

    private static void permute(String prefix, String remaining, List<String> permutations) {
        int length = remaining.length();
        if (length == 0) {
            permutations.add(prefix);
        } else {
            for (int i = 0; i < length; i++) {
                permute(prefix + remaining.charAt(i),
                        remaining.substring(0, i) + remaining.substring(i + 1, length), permutations);
            }
        }
    }
}
