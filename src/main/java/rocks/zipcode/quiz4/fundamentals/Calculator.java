package rocks.zipcode.quiz4.fundamentals;

import java.awt.geom.Arc2D;

/**
 * @author leon on 21/12/2018.
 */
public class Calculator {
    public static Double squareRoot(Double value) {
        Double sqrt =Math.sqrt(value);
        return sqrt;
    }

    public static Double square(Double value) {
        Double square = value*value;
        return square;
    }

    public static Double[] squareRoots(Double... value) {
        Double[] sqrt = new Double[value.length];
        for (int i = 0; i < value.length;i++){
            sqrt[i] = Math.sqrt(value[i]);
        }
        return sqrt;
    }

    public static Double[] squares(Double... values) {
        Double[] square = new Double[values.length];
        for(int i = 0; i < values.length;i++){
            square[i] = Math.pow(values[i],2);
        }
        return square;
    }


    public static Double add(Double value1, Double value2) {
        Double add = value1+value2;
        return add;
    }

    public static Double subtract(Double value1, Double value2) {
        Double sub = value1-value2;
        return sub;
    }


    public static Double divide(Double divisor, Double dividend) {
        Double divide = divisor/dividend;
        return divide;
    }


}
