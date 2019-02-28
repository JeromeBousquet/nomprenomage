import java.util.Scanner;

public class Hello {

  public static void main (String arg []){

    System.out.println("Quel est votre prénom ?");

    Scanner scan = new Scanner (System.in);

    String prenom = scan.nextLine();

    System.out.println("Quel est votre nom ?");

    String nom = scan.nextLine();

    System.out.println("Quel est votre age ?");

    int age = scan.nextInt();

    System.out.println("Bonjour " + prenom + " " + nom + " vous avez " + age + " ans");

  }
}
