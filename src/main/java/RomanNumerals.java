/*For example, see the following sample inputs and outputs:
        1 = “I”
        5 = “V”
        10 = “X”
        20 = “XX”
        3999 = “MMMCMXCIX”



        Caveat: Only support numbers between 1 and 3999
        For an in-depth description of Roman Numerals, see

        http://en.wikipedia.org/wiki/Roman_numerals*/

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

public class RomanNumerals implements RomanNumeralGenerator {
    public int generate(int number) {

        return number;
    }

    public static String romanNumeralsCalc(int Int) throws IllegalArgumentException {

        if(Int > 3999){
            throw new IllegalArgumentException("The integer you entered is great than 3999 enter a smaller number");
        }

        LinkedHashMap<String, Integer> roman_numerals = new LinkedHashMap<String, Integer>();
        roman_numerals.put("M", 1000);
        roman_numerals.put("CM", 900);
        roman_numerals.put("D", 500);
        roman_numerals.put("CD", 400);
        roman_numerals.put("C", 100);
        roman_numerals.put("XC", 90);
        roman_numerals.put("L", 50);
        roman_numerals.put("XL", 40);
        roman_numerals.put("X", 10);
        roman_numerals.put("IX", 9);
        roman_numerals.put("V", 5);
        roman_numerals.put("IV", 4);
        roman_numerals.put("I", 1);
        String res = "";
        for(Map.Entry<String, Integer> entry : roman_numerals.entrySet()){
            int matches = Int/entry.getValue();
            res += repeat(entry.getKey(), matches);
            Int = Int % entry.getValue();
        }
        return res;
    }
    public static String repeat(String s, int n) {
        if(s == null) {
            return null;
        }
        final StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++) {
            sb.append(s);
        }
        return sb.toString();
    }

}
