package rocks.zipcode.quiz4.arrays;

import java.util.Arrays;

/**
 * @author leon on 01/01/2019.
 */
public class ArrayUtils {
    public static String getMiddleElement(String[] values) {
        String midE = values[values.length/2];
        return midE;
    }

    public static String[] removeMiddleElement(String[] values) {
        String[] newValues = new String[values.length-1];
        int counter= 0;
        for(int i = 0;i < values.length;i++){
            if (i != values.length/2){
                if(counter > 0){
                    newValues[i-1] = values[i];
                }
                else{
                    newValues[i] = values[i];
                }
            }
            else{
                newValues[i] = values[i];
                counter++;
            }
        }
        return newValues;
    }

    public static String getLastElement(String[] values) {
        String lastE = values[values.length-1];
        return lastE;
    }

    public static String[] removeLastElement(String[] values) {
        String[] newValues = new String[values.length-1];
        for(int i = 0;i < values.length;i++){
            if (i == values.length -1){
                continue;
            }
            newValues[i] = values[i];
        }
        return newValues;
    }

    public static void main(String[] args) {
        String[] names = {"ray", "rey", "reyrey"};
        System.out.println(removeMiddleElement(names));
    }
    }