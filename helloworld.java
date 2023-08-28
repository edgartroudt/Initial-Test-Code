import java.util.*;

public class helloworld {

  public static void main(String[] args) {
    System.out.println("Hello, world!");
    System.out.println("What's your name?");
    Scanner s = new Scanner(System.in);
    String myName = s.nextLine();
    System.out.println("Well, hello " + myName + " good to meet you.");

  }

}
