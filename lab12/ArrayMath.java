////////////////////////////////////
//Keri McGlothlin
//CSE 002-110
//September 24th
//Random Games
//This program helps with arrays.

public class ArrayMath {
    public static void main(String[] arg) {
        double x[] = {
                2.3, 3, 4, -2.1, 82, 23
            },
            y[] = {
                2.3, 3, 4, -2.1, 82, 23
            },
            z[] = {
                2.3, 13, 14
            },
            w[] = {
                2.3, 13, 14, 12
            },
            v[],
            u[] = {
                2.3, 12, 14
            };
        v = addArrays(x, y);
        System.out.println(display(x) + " \n  + " + display(y) + "\n   = " + display(v));
        System.out.println(display(x) + " \n  + " + display(z) + "\n   = " + display(addArrays(x, z)));
        System.out.println("It is " + equals(x, y) + " that " + display(x) +
            " == " + display(y));
        System.out.println("It is " + equals(z, w) + " that " + display(z) +
            " == " + display(w));
        System.out.println("It is " + equals(u, z) + " that " + display(u) +
            " == " + display(z));
}

    public static String display(double[] x) {
        String out = "{";
        for (int j = 0; j < x.length; j++) {
            if (j > 0) {
                out += ", ";
            }
            out += x[j];
        }
        return out + "}";
    }
    
    public static double[] addArrays(double[] x, double[] y){
        int length = 0;
        double[] result = new double[length];
        if(x.length >= y.length){
            for(int i=y.length; i<x.length; i++){
                y[i] = 0;
            }
        }
        else if(y.length >= x.length){
            for(int i=x.length; i<y.length; i++){
                x[i] = 0;
            }
        }
        length = x.length;
        for(int i=0; i<x.length; i++){
            result[i] = x[i] + y[i];
        }
        return result;
    }
    
    public static boolean equals(double[] x, double[] y){
        int count = 0;
        for (int i=0; i<x.length; i++){
            if (x[i] != y[i]){
                return false;
            }
            else{
                count++;
            }
        }
        if (count == (x.length-1)){
            return true;
        }
        return false;
    }
    
}
