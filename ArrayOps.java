public class ArrayOps {

    public static void main(String[] args) {
        int[] arr1 = {7, 5, 4, 3, -12};
        int[] arr2 = {1, 2, 3};
        int[] arr3 = {1, -2, 3};
        int[] arr4 = {1, 1, 500};
        int[] arr5 = {1, 3, 2};

        System.out.println(isSorted(arr1)); // true
        System.out.println(isSorted(arr2)); // true
        System.out.println(isSorted(arr3)); // false
        System.out.println(isSorted(arr4)); // true
        System.out.println(isSorted(arr5)); // false
    }

    public static boolean isSorted(int[] arr) {
        if (arr.length <= 1) {
            // An array with 0 or 1 element is considered sorted
            return true;
        }

        boolean increasing = true;
        boolean decreasing = true;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                decreasing = false;
            } else if (arr[i] < arr[i - 1]) {
                increasing = false;
            }
            // If neither increasing nor decreasing, the array is not sorted
            if (!increasing && !decreasing) {
                return false;
            }
        }

        // If either increasing or decreasing is true, the array is sorted
        return increasing || decreasing ;
    }
 

public static int[] allIndexOf(String str, char ch) {
    int count = 0;

    // Count occurrences to determine array size
    for (int i = 0; i < str.length(); i++) {
        if (str.charAt(i) == ch) {
            count++;
        }
    }

    // Create an array to store indices
    int[] indices = new int[count];
    int index = 0;

    // Populate the array with indices
    for (int i = 0; i < str.length(); i++) {
        if (str.charAt(i) == ch) {
            indices[index++] = i;
        }
    }

    return indices;
    }

public class CamelCaseConverter {

    public static void main(String[] args) {
        System.out.println(camelCase("Hello World")); // Output: helloWorld
        System.out.println(camelCase("HELLO world")); // Output: helloWorld
        System.out.println(camelCase(" tWo wordS")); // Output: twoWords
        System.out.println(camelCase("world")); // Output: world
        System.out.println(camelCase(" Intro to coMPUter sCIEncE ")); // Output: introToComputerScience
    }

    public static String camelCase(String string) {
        if (string == null || string.isEmpty()) {
            return "";
        }

        // Rule 1: The first word should be in lowercase.
        string = makeFirstWordLowercase(string);

        // Rule 2: Every word should start with an uppercase letter, and the rest should be lowercase.
        string = capitalizeWords(string);

        // Rule 3: Remove all spaces.
        string = removeSpaces(string);

        return string;
    } 
    private static String makeFirstWordLowercase(String input) {
        return input.trim().split("\\s+")[0].toLowerCase() + input.substring(input.indexOf(" ") + 1);
    }

    private static String capitalizeWords(String input) {
        String[] words = input.trim().split("\\s+");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            result.append(word.substring(0, 1).toUpperCase()).append(word.substring(1).toLowerCase());
        }

        return result.toString();
    }

    private static String removeSpaces(String input) {
        return input.replaceAll("\\s", "");
    }
}
 }



