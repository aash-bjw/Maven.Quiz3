package rocks.zipcode.io.quiz3.fundamentals;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 09/12/2018.
 */
public class StringUtils {
    public static String capitalizeNthCharacter(String str, Integer indexToCapitalize) {

        char[] arr = str.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == indexToCapitalize) {
                i = Character.toUpperCase(arr[i]);
            }
        }
        //String newStr = arr.toString();
        return arr.toString();
    }

    public static Boolean isCharacterAtIndex(String baseString, Character characterToCheckFor, Integer indexOfString) {
        char[] arr = baseString.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == indexOfString) {
                //if (arr[i] == characterToCheckFor) {
                    return true;
                }
            }
       // }

        return false;
    }

    public static String[] getAllSubStrings(String string) {
        String[] subArray = new String[getNumberOfSubStrings(string)];
        int counter = 0;
        for (int i = 0; i < string.length(); i++) {
            for (int j = i + 1; j <= string.length(); j++) {

            }
        }
        return null;
    }

    public static Integer getNumberOfSubStrings(String input) {
        int counter = 0;
        for (int i = 0; i < input.length() - 1; i++) {
            for (int j = i + 1; j <= input.length(); j++) {
                counter++;
            }
        }
        return counter;
    }
}
