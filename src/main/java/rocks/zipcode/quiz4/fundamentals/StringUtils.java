package rocks.zipcode.quiz4.fundamentals;

import org.w3c.dom.ls.LSOutput;

/**
 * @author leon on 21/12/2018.
 */
public class StringUtils {
    public static Character getMiddleCharacter(String string) {
        int middleI = string.length()/2;

        return string.charAt(middleI);
    }

    public static String capitalizeMiddleCharacter(String str) {
        int length = str.length();
        String output = "";
        for (int i = 0; i < length; i++){
            if (i == length/2){
                char x = Character.toUpperCase(str.charAt(i));
                output += x;
            }
            else{
                output += str.charAt(i);
            }
        }
        return output;
    }

    public static String lowerCaseMiddleCharacter(String str) {
        int length = str.length();
        String output = "";
        for (int i = 0; i < length; i++){
            if (i == length/2){
                char x = Character.toLowerCase(str.charAt(i));
                output += x;
            }
            else{
                output += str.charAt(i);
            }
        }
        return output;
    }

    public static Boolean isIsogram(String str) {
        for (int i = 0; i < str.length(); i++){
            for(int x = 0; x < str.length(); x++){
                if ((str.charAt(i) == str.charAt(x) && x != i)){
                    return false;
                }
            }
        }
        return true;
    }

    public static Boolean hasDuplicateConsecutiveCharacters(String str) {
        for (int i = 0; i < str.length()-1; i++){
            if (str.charAt(i)==str.charAt(i+1)){
                return true;
            }
        }
        return false;
    }

    public static String removeConsecutiveDuplicateCharacters(String str) {
        String str1 = "";//Fool
        for (int i = 0; i < str.length(); i++){
            if (i < 1){
                if (str.charAt(i)!=str.charAt(i+1)){
                    str1+=str.charAt(i);
                }
            }
            else if (i ==str.length()-1){
                str1+= str.charAt(i);
            }
            else if (str.charAt(i)!=str.charAt(i+1)){
                if(str.charAt(i)!=str.charAt(i-1)){
                    str1+=str.charAt(i);
                }
            }

        }
        return str1;
        }



    public static String invertCasing(String str) {
        String output = "";
        for(int i = 0; i < str.length();i++) {
            if(str.charAt(i) == ' '){
                output += " ";
            }
            else if(Character.isLowerCase(str.charAt(i))){
                output += Character.toUpperCase(str.charAt(i));
            }
            else if(Character.isUpperCase(str.charAt(i))){
              output += Character.toLowerCase(str.charAt(i));
            }
            else{
                output += str.charAt(i);
            }
        }
        return output;
    }









    public static void main(String[] args) {
        System.out.println(hasDuplicateConsecutiveCharacters("thanksgiving" ));
    }
}