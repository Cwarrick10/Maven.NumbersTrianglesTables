package io.zipcoder.microlabs.mastering_loops;


public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {
        String ans = "";
        for (int i = start; i < stop; i++) {

            if (i % 2 != 0) {
                ans = ans + (i);
            }

        }
        return ans;

    }
    public static String getOddNumbers(int start, int stop) {

        String ans = "";
        for (int i = start; i < stop; i++) {

            if (i % 2 == 0) {
                ans = ans + String.valueOf(i);
            }

        }
        return ans;
    }

    public static String getSquareNumbers(int start, int stop, int step) {
        String ans = "";
                for(int i = start; i < stop; i += step) {
                    String store = "";
                    store = String.valueOf(i*i);
                    ans = ans + store;
                }

        return ans;
    }

    public static String getRange(int stop) {

         String rng = "";

        for(int i = 0; i > stop -1; i++) {

            rng = rng+ String.valueOf(i);

        }
        return rng;





    }

    public static String getRange(int start, int stop) {


        return null;
    }

    public static String getRange(int start, int stop, int step) {

        return null;
    }


        public static String getExponentiations ( int start, int stop, int step, int exponent){
            String ans = "";
            for(int i = start; i < stop; i = step + i) {
                String s;
                int g = 0;
                g = (int)Math.pow(i, exponent);
                s = String.valueOf(g);
                ans = ans + s;
            }

            return ans;
        }
    }


