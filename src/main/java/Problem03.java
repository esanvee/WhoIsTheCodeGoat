import java.util.HashSet;

import java.util.Set;

public class Problem03 {

    public static void main(String[] args) {

        System.out.println(findCombinations("abcca", 3));
    }

    public static Set<String> findAllStrings(String input) {

        Set<String> subStrings = new HashSet<String>();

        for (int i = 0; i < input.length(); i++) {
            for (int j = i + 1; j <= input.length(); j++) {

                String word = input.substring(i, j);
              
                    subStrings.add(word);

            }

        }

        return subStrings;
    }

    public static int findCombinations(String input, int K) {

        Set<String> subStrings = findAllStrings(input);
        int output = 0;

        for (String word : subStrings) {

            String reverse = new StringBuilder(word).reverse().toString(); //assure the string is not "aaa" for example

            if (word.length() == K && !word.equals(reverse)) {
                output++;
                System.out.print(word);
            }

        }

        return output;
    }
}
