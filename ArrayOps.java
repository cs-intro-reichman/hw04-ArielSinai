public class ArrayOps {
    public static void main(String[] args) {
        int [] arr = {-12,2,3,7,8,8};
        int [] arr2 = {3,1,5,2,0,66,6};
        System.out.println(findMissingInt(arr));
        System.out.println(secondMaxValue(arr));
        System.out.println(containsTheSameElements(arr, arr2));
        System.out.println(isSorted(arr));
    }
    
    public static int findMissingInt (int [] array) {
        int n = array.length;
        int sumArr = 0;
        int expectedSum = n * (n + 1) / 2;
        int missingInt;
        for (int i = 0; i < n; i++) {
            sumArr = sumArr + array[i];
        }
        
        missingInt = expectedSum - sumArr;
        return missingInt;
    }

    public static int secondMaxValue(int [] array) { 
        int n = array.length;
        int maxV = 0;
        int Max2 = 0;
        
        for (int i = 0; i < n; i++) {
            if (array[i] > maxV || array[i] == maxV) {
                Max2 = maxV;
                maxV = array[i];
            }
            else if (array[i] > Max2 && array[i] != maxV) {
                Max2 = array[i];
            }
        }
        return Max2;
    }

    public static boolean containsTheSameElements(int [] array1,int [] array2) {
        boolean foundInSecondArray = false;
         for (int i = 0; i < array1.length; i++) {
            foundInSecondArray = false;
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    foundInSecondArray = true;
                    break;
                }
            }
            if (!foundInSecondArray) {
                return false;
            }
        }
        for (int i = 0; i < array2.length; i++) {
            foundInSecondArray = false;
            for (int j = 0; j < array1.length; j++) {
                if (array2[i] == array1[j]) {
                    foundInSecondArray = true;
                    break;
                }
            }
            if (!foundInSecondArray) {
                return false;
            }
        }
        return true;
    }

    public static boolean isSorted(int [] array) {
        if (array[0] < array[1]) {
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i-1]) {
                    return false;
                }
            }
            return true;
        }
        else
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[i-1]) {
                return false;
            }
        }
        return true;
    }

}



