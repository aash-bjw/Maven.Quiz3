package rocks.zipcode.io.quiz3.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class VowelUtils {
    public static Boolean hasVowels(String word) {

        return null;
    }

    public static Integer getIndexOfFirstVowel(String word) {
        int index = 0;

        for(int i = 0; i <= word.length(); i++){
            if(isVowel(word.charAt(i))){
                i = index;

            } break;
        }
        return index;
        //return null;
    }


    public static Boolean startsWithVowel(String word) {
        //char[] newArr = word.toCharArray();
        return (isVowel(word.charAt(0)));

    }

    public static Boolean isVowel(Character character) {

       String newStr = character.toString();
         return newStr.matches("[A-Za-z]");
        }
}
