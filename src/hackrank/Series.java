package hackrank;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Meelon
 */
/*a+2^0,a+2^0b+2^1b,.........a+2^0b+2^1b..2^n-1b*/
import java.util.*;

public class Series {

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int a = 0, b = 0, n = 0, p = 0, s = 0, i, j;
            int t = in.nextInt();
            for (i = 0; i < t; i++) {

                a = in.nextInt();
                b = in.nextInt();
                n = in.nextInt();

                for (j = 0; j < n; j++) {
                    p = b * (int) Math.pow(2, j);
                    s += p;

                    System.out.print(s + a + " ");
                }
                s = 0;
                System.out.println();

            }

        }
    }
}
