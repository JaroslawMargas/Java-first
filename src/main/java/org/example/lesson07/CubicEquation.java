package org.example.lesson07;

import java.util.ArrayList;
import java.util.List;

public class CubicEquation {

    public static List<Integer> CubicValue(int a, int b, int c, int d) {
        /*
        Given the numbers a,b,c,d
        Output in ascending order all the integers between 0 and 1000 which are the roots of the equation
        ax3+bx2+cx+d=0
        If the specified interval does not contain the roots of the equation, do not output anything.
        Remember, that cubic equation always has 3 roots. Keep it in mind in order to optimize the code.
         */
        List<Integer> listValues = new ArrayList<>();

        for (int x = 0; x < 1001; x++) {
            double powX3 = Math.pow(x, 3);
            double powX2 = Math.pow(x, 2);

            int res = (int) (a * powX3 + b * powX2 + c * x + d);
            if (res == 0) {
                listValues.add(x);
            }
        }
        return listValues;
    }
}
