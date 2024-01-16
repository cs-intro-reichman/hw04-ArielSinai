import java.util.Arrays;

public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {
        String check = "HELLo world ooo";
        System.out.println(capVowelsLowRest(check));
        System.out.println(camelCase(check));
        System.out.println(camelCase(check));
        System.out.println(Arrays.toString(allIndexOf(check, 'o')));
        
    }

    public static String capVowelsLowRest (String string) {
        String newString = "";
        for (int i = 0; i < string.length(); i++) {
            switch (string.charAt(i)) {
                case 97:
                case 101:
                case 105:
                case 111:
                case 117:
                newString = newString + (char) (string.charAt(i) - 32);
                break;
                
                case 65:
                case 69:
                case 73:
                case 79:
                case 85:
                newString = newString + (char) (string.charAt(i));
                break;
                
                case 32:
                newString = newString + " ";
                break;
                
                default:
                if (string.charAt(i) >= 65 && string.charAt(i) <= 90) {
                    newString = newString + (char) (string.charAt(i) + 32);
                }
                else
                newString = newString + (char) (string.charAt(i));
                break;
            }
        }
        return newString;
    }

    public static String camelCase (String string) {
        String newString = "";
        boolean nextcharuc = false;
        while (string.charAt(0) == ' ') {
            string = string.substring(1);
        }
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == 32) {
                nextcharuc = true;
            }
            else if (nextcharuc) {
                nextcharuc = false;
                if (string.charAt(i) >= 97 && string.charAt(i) <= 122) {
                    newString = newString + (char) (string.charAt(i) - 32);
                }
                else
                newString = newString + (char) string.charAt(i);
            }
            else
            {
                nextcharuc = false;
                if (string.charAt(i) >= 97 && string.charAt(i) <= 122) {
                    newString = newString + (char) string.charAt(i);
                }
                else
                newString = newString + (char) (string.charAt(i) + 32);
            }
        }
        return newString;
}

    public static int[] allIndexOf (String string, char chr) {
        int arraySize = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == chr) {
                arraySize++;   
            }
        }
        int[] indexes = new int[arraySize];
        int j = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == chr) {
                indexes[j] = i;
                j++;  
            }
        }
        return indexes;
    }
}
