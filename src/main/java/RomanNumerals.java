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

//code implements the interface

public class RomanNumerals implements RomanNumeralGenerator {

    //method to satisfy the interface

    public String generate(int Int) throws IllegalArgumentException {

        //exception handling as the method should not be concerned with
        //numbers over 3999 therefore throw exception in such cases

        if(Int > 3999){
            throw new IllegalArgumentException("The integer you entered is great than 3999 enter a smaller number");
        }

        //LinkedHashMap used to keep the order of the roman numerals
        LinkedHashMap<String, Integer> roman_numerals = new LinkedHashMap<String, Integer>();


        //add the values to the linked hash map

        roman_numerals.put("I", 1);
        roman_numerals.put("IV", 4);
        roman_numerals.put("V", 5);
        roman_numerals.put("IX", 9);
        roman_numerals.put("X", 10);
        roman_numerals.put("XL", 40);
        roman_numerals.put("L", 50);
        roman_numerals.put("XC", 90);
        roman_numerals.put("C", 100);
        roman_numerals.put("CD", 400);
        roman_numerals.put("D", 500);
        roman_numerals.put("CM", 900);
        roman_numerals.put("M", 1000);




        String res = "";

        for(Map.Entry<String, Integer> entry : roman_numerals.entrySet()){
            int matches = Int/entry.getValue();
            res += repeat(entry.getKey(), matches);
            Int = Int % entry.getValue();
        }
        return res;
    }


    //The repeat method takes the string s
    public static String repeat(String s, int n) {

        //if entry is null then return null as no values neccessary
        if(s == null) {
            return null;
        }

        //create a new string builder and append each letter then return
        //the final appended string


        final StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++) {
            sb.append(s);
        }
        return sb.toString();
    }

}
