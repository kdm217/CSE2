//////////////////////////////////////////////////
// Keri McGlothlin
// CSE 2
// FindDuplicate java Program
// This program will help with arrays.
import java.util.Scanner;
public class FindDuplicates {
  public static void main(String[] arg) {
    Scanner scan = new Scanner(System.in);
    int num[] = new int[10];
    String answer = "";
    do {
      System.out.print("Enter 10 ints- ");
      for (int j = 0; j < 10; j++) {
        num[j] = scan.nextInt();
      }
      String out = "The array ";
      out += listArray(num); //return a string of the form "{2, 3, -9}"   
      if (hasDups(num)) {
        out += "has ";
      }
      else {
        out += "does not have ";
      }
      out += "duplicates.";
      System.out.println(out);
      out = "The array ";
      out += listArray(num);
      if (exactlyOneDup(num)) {
        out += "has ";
      }
      else {
        out += "does not have ";
      }
      out += "exactly one duplicate.";
      System.out.println(out);
      System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- ");
      answer = scan.next();
    } while (answer.equals("Y") || answer.equals("y"));
  }

  public static String listArray(int num[]) {
    String out = "{";
    for (int j = 0; j < num.length; j++) {
      if (j > 0) {
        out += ", ";
      }
      out += num[j];
    }
    out += "} ";
    return out;
  }

  public static boolean hasDups(int x[]) {
    int i = 0;
    for (i = 0; i < x.length; i++) {
      for (int j = 0; j < x.length; j++) {
        if (x[i] == x[j]) {
          return true;
        }
      }
    }
    return false;
  }

  public static boolean exactlyOneDup(int y[]) {
    int z[] = new int[10];
    for (int i = 0; i < z.length; i++) {
      z[i] = 0;
    }
    for (int i = 0; i < z.length; i++) {
      z[y[i]] += 1;
    }
    for (int i = 0; i < z.length; i++) {
      System.out.print(z[i]);
      System.out.print(" ");
    }
    int dubs = 0;
    for (int i = 0; i < z.length; i++) {
      if (z[i] == 2) {
        dubs += 1;
      }
    }
    System.out.println(dubs);
    if (dubs == 1) {
      return true;
    }
    return false;
  }
}
