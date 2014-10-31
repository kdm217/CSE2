//////////////////////////////////////////////////
// Keri McGlothlin
// CSE 2
// HW8 java Program
// This program is to help with methods.

public class MethodCalls{
     public static void main(String []  arg){
         int a=784,b=22,c;
         c=addDigit(a,3);
         System.out.println("Add 3 to "+a+" to get "+c);
         c=addDigit(addDigit(c,4),5);
         System.out.println("Add 3, 4, and 5 to "+a+" to get "+c);
         System.out.println("Add 3 to -98 to get: "+addDigit(-98,3));
         c=join(a,b);
         System.out.println("Join "+a+" to "+b+" to get "+c);
         System.out.println("Join 87, 42, and 83 to get "+join(87, join(42,83)));
         System.out.println("Join -9 and -90 to get "+join(-9,-90));
    }
  

    public static int addDigit(int a, int b){
        int c = 0;
        if (a > 0 && b > 0){
        c = Integer.parseInt(Integer.toString(b) + Integer.toString(a));
        }
        else if (a<0 && b>0){
            a = -a;
            c = Integer.parseInt(Integer.toString(b) + Integer.toString(a));
            c = -c;
        }
        else if (a>0 && b<0){
            b = -b;
            c = Integer.parseInt(Integer.toString(b) + Integer.toString(a));
            c = -c;
        }
        else{ //what to do when one of the numbers is negative
            a = -a;
            b =  -b;
            c = Integer.parseInt(Integer.toString(b) + Integer.toString(a));
        }
        return c;
    }
    
    public static int join(int x, int y){
        int z = 0;
        if (x > 0 && y > 0){
        z = Integer.parseInt(Integer.toString(x) + Integer.toString(y));
        }
        else if (x<0 && y>0){
            x = -x;
            z = Integer.parseInt(Integer.toString(x) + Integer.toString(y));
            z = -z;
        }
        else if (x>0 && y<0){
            y = -y;
            z = Integer.parseInt(Integer.toString(x) + Integer.toString(y));
            z = -z;
        }
        else{ //what to do when one of the numbers is negative
            x = -x;
            y =  -y;
            z = Integer.parseInt(Integer.toString(x) + Integer.toString(y));
        }
        return z;
    }

}
