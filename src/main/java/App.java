import java.util.Scanner;

public class App {

  public static void main(String[] args) {
    System.out.println("Automated system for complementing your name");

    String name = query("What is your name?");
    System.out.println("What a beautiful name " + name);
  }

  static String query(String message) {
    Scanner scanner = new Scanner(System.in);

    System.out.print(message + " ");
    return scanner.nextLine();
  }
}
