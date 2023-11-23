import java.util.Scanner;

public class App {

  public static void main(String[] args) {
    System.out.println("Automated system for complementing your name");

    String name = query("What is your wonderful name?");
    System.out.println("What a beautiful name " + name);
  }

  static String query(String message) {
    Scanner scanner = new Scanner(System.in);

    System.out.print(message + " ");
    return scanner.nextLine();
  }

  static int queryNumber(String message) {
    int number = -1;

    while(number == -1) {
      String input = query(message);

      try {
        number = Integer.parseInt(input);
      } catch(NumberFormatException ex) {
        System.out.println(input + "is not a number, try again");
      }
    }

    return number;
  }
}
