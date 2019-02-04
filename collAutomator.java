import java.util.*;
import java.io.*;
import java.lang.*;

public class collAutomator {
  public static void main(String[] args) {
    Scanner console = new Scanner(System.in);
    System.out.println("Enter the starting number for the inputs.");
    System.out.println("Starting Number: ");
    int start = console.nextInt();
    System.out.println("Enter musical note digits for which you want to sequence on the coll in order");
    System.out.println("Press the enter button when done: ");
    console.nextLine();
    String input = console.nextLine();
    String[] numbers = input.split(" ");
    System.out.println("Here is your code!");
    System.out.println("Copy and paste this to the coll: ");
    System.out.println();
    System.out.println();
    for (int i = 0; i < numbers.length; i++) {
      System.out.println(start + ", " + numbers[i] + ";");
      start++;
    }
  }
}
