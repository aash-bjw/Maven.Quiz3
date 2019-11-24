package rocks.zipcode.io.quiz3.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class PigLatinGenerator {
    public String translate(String str) {

        String[] temp = str.split(" ");

        StringBuilder sb = new StringBuilder();
        for (String t : temp) sb.append(createWord(t) + " ");
        return sb.toString().trim();
    }

    public String createWord(String str) {

        if (VowelUtils.startsWithVowel(str)) {
            return str + "way";
        } else {
            str = str.substring(1) + str.charAt(0);
            return str + "ay";
        }
    }
}

